package Lab_2;

import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args)
    {
        Scanner nhap = new Scanner(System.in);
        System.out.println("+----------------------------+");
        System.out.println("1. Giai phuong trinh bac nhat");
        System.out.println("2. Giai phuong trinh bac hai");
        System.out.println("3. Tinh tien dien");
        System.out.println("4. Ket thuc");
        System.out.println("+----------------------------+");
        System.out.print("Nhap so can thuc hien: ");
        int luachon;
        luachon=nhap.nextInt();
        switch (luachon)
        {
            case 1: giaiBPTB1();break;
            case 2: giaiBPTB2();break;
            case 3: tinhTienDien();break;
            case 4: System.exit(0);
            default:
                System.out.println("Nhap khong chinh xac! ");
        }

    }
    public static void giaiBPTB1()
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
    public static void giaiBPTB2()
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
    public static void tinhTienDien()
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
