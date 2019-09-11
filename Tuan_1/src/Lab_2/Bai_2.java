package Lab_2;
import java.util.*;
public class Bai_2 
{
	public static void main (String[]args)
	{
		double a,b,c,A,x1,x2;
		Scanner nhap=new Scanner(System.in);
		System.out.println("PHUONG TRINH BAC 2 DANG ax^2 + bx + c = 0" );
		System.out.print("Nhap a:" );
		a=nhap.nextDouble();
		System.out.print("Nhap b: ");
		b=nhap.nextDouble();
		System.out.print("Nhap c: ");
		c=nhap.nextDouble();
		System.out.println("PHUONG TRINH DANG: " +a+"x^2 + "  +b+ "x + "  +c+ " = 0" );
		if (a==0)
		{
			System.out.println("Phuong trinh bat nhat bx +c = 0");
			if (b!=0)
				System.out.println("Phuong trinh co nghiem duy nhat x: " +(-b/c));
			else if(b==0)
			{
				if (c == 0)
					System.out.println("Phuong trinh co nghiem dung voi moi x thuoc R ");
				else
					System.out.println("Phuong trinh vo nghiem!");
			}
		}
		else
		{
			A=b*b - 4*a*c;
			x1=((-b)- Math.sqrt(A) / (2*a) );
			x2=((-b) + Math.sqrt(A) / (2*a));
			
			if (A==0)
			{
				System.out.print("Phuong trinh co nghiem kep: x =" + (-b/2 *a));
			}
			else if (A>0)
			{
				System.out.print("Phuong trinh co 2 nghiem phan biet: x1 =" +x1 );
				System.out.print("Phuong trinh co 2 nghiem phan biet: x2 =" +x2 );
			}	
				else
				System.out.print("Phuong trinh vo nghiem");
				
		}
	}
}
