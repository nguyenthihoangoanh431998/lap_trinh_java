package Lab_3;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = nhap.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("So thu " + (i + 1) + ": ");
            int nhapA = nhap.nextInt();
            a[i] = nhapA;
        }

        System.out.print("Mang vua nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        Arrays.sort(a);
        System.out.print("\nMang sau khi duoc sap xep thu tu tang dan la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nPhan tu co so nho nhat la: ");
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (min > a[i])
                min = a[i];
        }
        System.out.printf(min + "");

        double trungBinhCong = 0;
        int k = 0;
        for(int i =0 ; i<n; i++){
            if(a[i] % 3 == 0)
            {
                trungBinhCong += a[i];
                k++;
            }
        }
        System.out.println("\nTrung binh cong cua cac so chia het cho 3 la: " + trungBinhCong/k);
    }
}
