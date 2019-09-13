package Lab_3;

import java.util.Scanner;

public class Bai_2
{
    public static void main (String[]args)
    {
        Scanner nhap = new Scanner(System.in);
        int a;
        System.out.print("MOI BAN NHAP BAN CUU CHUONG MUON BIET! ");
        a = nhap.nextInt();
        for (int i = 1; i <= 10 ; i++)
            System.out.println(a + " x " + i + " = " + (a*i));
        System.out.println();
        System.out.println("9 bang cuu chuong:");
        for(int j = 1; j<10;j++) {
            for (int i = 1; i <= 10; i++)
                System.out.println(j + " x " + i + " = " + (j * i));
            System.out.println();
        }

    }
}
