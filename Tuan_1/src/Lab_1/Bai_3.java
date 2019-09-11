package Lab_1;
import java.util.*;
public class Bai_3 
{
	public static void main(String[]args)
	{
		double a;
		Scanner nhap=new Scanner(System.in);
		System.out.print("Nhap chieu dai canh a: ");
		a =nhap.nextDouble();

		System.out.println("The tich hinh lap phuong la: "+(a*a*a));
	}
}
