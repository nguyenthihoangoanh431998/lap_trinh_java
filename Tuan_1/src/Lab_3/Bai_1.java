package Lab_3;

import java.util.Scanner;

public class Bai_1
{
    public static void main (String[]args)
    {
        double a;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Moi ban nhap so: ");
        a = nhap.nextDouble();
        boolean check = true;
        if(a>=2)
        {
            for (int i = 2; i < a - 1 ; i++)
            {
                if (a % i == 0)
                {
                    check = false; break;
                }
            }
        }
        else
            check = false;
        if(check) {
            System.out.println(a + " la so nguyen to");
        }
        else
            System.out.println(a + " khong phai la so nguyen to");
    }

}
