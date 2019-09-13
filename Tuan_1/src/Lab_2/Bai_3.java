package Lab_2;

import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args)
    {
        Scanner nhap=new Scanner(System.in);
        double soDien, soTien;
        System.out.print("Nhap so dien: ");
        soDien=nhap.nextDouble();
            if (soDien >= 0  && soDien <= 50)
                System.out.println("Gia dien la :" + soDien * 1000 + "VND");
            else
                System.out.println("Gia dien la : " + ((50 *1000) + (soDien - 50)*1200)+"VND");
    }
}
