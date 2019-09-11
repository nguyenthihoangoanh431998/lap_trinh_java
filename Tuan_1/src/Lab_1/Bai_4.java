package Lab_1;
import java.util.*;
public class Bai_4 
{
	public static void main (String[]args)
	{
		double a,b,c;
		Scanner nhap=new Scanner(System.in);
		System.out.print("Nhap a: ");
		a =nhap.nextDouble();
		System.out.print("Nhap b: ");
		b =nhap.nextDouble();
		System.out.print("Nhap c: ");
		c = nhap.nextDouble();
		
		double delta = Math.pow(b, 2) - (4 * a * c);
		System.out.println("Delta = " + delta);
		if(delta >= 0)
			System.out.println("Can delta: " +Math.sqrt(delta));
		else
			System.out.println("Khong co can delta");
	}
}
