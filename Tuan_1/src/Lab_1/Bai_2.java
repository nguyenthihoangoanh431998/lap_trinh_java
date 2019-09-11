package Lab_1;
import java.util.Scanner;
public class Bai_2
{
	public static void main (String[]args) 
	{
		double a,b;
		Scanner nhap=new Scanner(System.in);
		System.out.print("Nhap chieu dai: ");
		a = nhap.nextDouble();
		System.out.print("Nhap chieu rong: ");
		b = nhap.nextDouble();
		System.out.println("Dien tich hinh chu nhat la: " + (a*b));
		System.out.print("Chu vi hinh chu nhat la: " + (a+b)*2);
	}
}
