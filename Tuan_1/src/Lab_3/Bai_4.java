package Lab_3;

import java.util.Scanner;
import java.util.ArrayList;

public class Bai_4
{
    public  static  void main (String []args)
    {
        Scanner nhap = new Scanner(System.in);
        ArrayList<String> hoTen = new ArrayList<String>();
        ArrayList<Integer>soDiem = new ArrayList<Integer>();
        ArrayList<String> xepLoai = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Nhap ho ten hoc sinh can tim: " + (i+1) +":");
            String nhapHoTen = nhap.nextLine();
            hoTen.add(nhapHoTen);
            System.out.print("Nhap Diem: ");
            for (;;)
            {
                int nhapDiem = Integer.parseInt(nhap.nextLine ());
                if (nhapDiem >= 0 && nhapDiem <=10 )
                {
                    soDiem.add(nhapDiem);
                    break;
                }
                else
                System.out.println("Diem phai tu 0 - 10. Nhap lai: ");
            }

        }
            for ( int i  = 0; i <5 ; i++)
            {
                if (soDiem.get(i) < 5)
                    xepLoai.add("Yeu");
                else if (soDiem.get(i) >= 5 && soDiem.get(i) < 6.5)
                    xepLoai.add("Trung Binh");
                else if (soDiem.get(i) >= 6.5 && soDiem.get(i) < 7.5)
                    xepLoai.add("Tien Tien");
                else if (soDiem.get(i) >= 7.5 && soDiem.get(i) < 9)
                    xepLoai.add("Gioi");
                else
                    xepLoai.add("Xuat Sac");
            }
            for ( int i = 0; i < 5 - 1; i ++)
            {
                for (int z = 0; z <5 - 1 - i; z++ )
                   if (soDiem.get(z) > soDiem.get(z+1))
                   {
                       int soDiemTam = soDiem.get(z);
                       soDiem.set(z , soDiem.get(z+1));
                       soDiem.set (z+1 , soDiemTam);
                       String hoTenTam = hoTen.get(z);
                       hoTen.set(z , hoTen.get (z+1));
                       hoTen.set (z+1 , hoTenTam);
                       String xepLoaiTam = xepLoai.get(z);
                       xepLoai.set(z , xepLoai.get(z +1));
                       xepLoai.set(z +1 , xepLoaiTam);
                   }
            }
        for (int i = 0; i < 5 ; i++ )
        {
            System.out.print("Hoc sinh: " + hoTen.get(i) + " - Diem: " + soDiem.get(i) + " - Xep Loai: " + xepLoai.get(i) +"\n");
        }
    }
}


