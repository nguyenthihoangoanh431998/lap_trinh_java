package Lab_2;

import java.util.*;
public class Bai_1 
{
	public static void main(String []args)
	{
		double a,b;
		Scanner nhap=new Scanner (System.in);
		System.out.print("Nhap a: " );
		a = nhap.nextDouble();
		System.out.print("Nhap b: ");
		b = nhap.nextDouble();
		if (a==0)
		{
			if (b==0)
			{
				System.out.print("Phuong trinh co vo so nghiem!");
		
			}
			else
				System.out.print("Phuong trinh vo nghiem!");
				
		}
		
		else
			System.out.println("Phuong trinh co nghiem la: x = "  + (-b/a));
	}
}
