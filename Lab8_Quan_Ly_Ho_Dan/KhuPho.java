/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8_Quan_Ly_Ho_Dan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class KhuPho {
    public static void main(String[] args) {
        ArrayList<HoDan> danhSachHoDan = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong ho dan : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Nhap ho dan thu " + (i+1) );
            HoDan temp = new HoDan();
            temp.nhapHoDan();
            danhSachHoDan.add(temp);
            System.out.println("-----------------");
        }
        
        System.out.println("Danh sach ho dan vua nhap la: ");
        for(HoDan x : danhSachHoDan){
            x.hienThi();
        }
        
        
    }
}
