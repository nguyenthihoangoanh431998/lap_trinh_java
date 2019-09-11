package Lab_1;

import java.util.Scanner;

public class Bai_1 {
	public static void main(String[] args) {
		System.out.print("Nhap ten: ");
		Scanner nhap = new Scanner(System.in);
		String hoTen = nhap.nextLine();	
		System.out.print("Nhap diem: ");
		double nhapDiem = nhap.nextDouble();
		System.out.println (hoTen + " " + nhapDiem + " diem");
		nhap.close();
	}	
}
