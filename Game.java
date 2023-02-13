import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.text.NumberFormat;

public class Game {
	public static void main(String[] args) {
		System.out.println("--- Thử thách Game Tài Xỉu ----");
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		//format tien te
		Locale lc =new Locale("VI", "VN");
		NumberFormat nFormat = NumberFormat.getCurrencyInstance(lc);
		
		double taiKhoan = 1000000;
		int taiXiu;
		do {
			System.out.println("Nhấn phím (1) để chơi ---- phím khác để thoát Game !");
			luaChon = sc.nextInt();
			if (luaChon == 1) {
				
				System.out.println("Tài khoản của Bạn được cấp :" + nFormat.format(taiKhoan));
				
				Random xucXac = new Random();
				
				//giatri random
				int giaTri1 = xucXac.nextInt(5) + 1;
				int giaTri2 = xucXac.nextInt(5) + 1;
				int giaTri3 = xucXac.nextInt(5) + 1;
				int tong = giaTri1 + giaTri2 + giaTri3;
				double tienDatCuoc = 0;
				do {
					System.out.println("Chọn phím (1) Tài ----- chọn phím (2) Xỉu ");
					taiXiu = sc.nextInt();
					
					
					//tinh toan
					if(taiXiu == 2) {
						
						do {
							System.out.println("Tiền đặt cược phải > 0 và nhỏ hơn tài khoản hiên có ");
							tienDatCuoc = sc.nextDouble();
						}
						while(tienDatCuoc<0 && tienDatCuoc > taiKhoan);
						if(tong >= 11 && tong<=17) {
							System.out.println("Kết quả : "+giaTri1+"-"+giaTri2+ "-"+giaTri3);
							System.out.println("Bạn đã thắng ");
							
							System.out.println("Tài khoản mới của Bạn " + nFormat.format(taiKhoan+=tienDatCuoc) );
						}else {
							System.out.println("Kết quả : "+giaTri1+"-"+giaTri2+ "-"+giaTri3);
							System.out.println("Bạn đã thua ");
							System.out.println("Tài khoản mới của bạn " + nFormat.format(taiKhoan-=tienDatCuoc) );
						}
					}else {
						do {
							System.out.println("Tiền đặt cược phải > 0 và nhỏ hơn tài khoản hiên có ");
							tienDatCuoc = sc.nextDouble();
						}
						while(tienDatCuoc<0 && tienDatCuoc > taiKhoan);
						if(tong >= 3 && tong<=10) {
							System.out.println("Kết quả : "+giaTri1+"-"+giaTri2+ "-"+giaTri3);
							System.out.println("Bạn đã thắng ");
							System.out.println("Tài khoản mới của bạn" + nFormat.format(taiKhoan+=tienDatCuoc) );
						}else {
							System.out.println("Kết quả : "+giaTri1+"-"+giaTri2+ "-"+giaTri3);
							System.out.println("Bạn đã thua ");
							System.out.println("Tài khoản mới của bạn" + nFormat.format(taiKhoan-=tienDatCuoc) );
						}
					}
				}
				while(taiXiu!=1 && taiXiu!=2);				
				
			}

		} while (luaChon == 1);
	}
}
