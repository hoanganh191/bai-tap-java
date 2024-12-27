/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10_Thu_Vien_KHTN;

import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class SinhVien {
    private String hoTen;
    private int tuoi;
    private int namSinh;
    private String lop;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
        System.out.print("Nhap nam sinh: ");
        namSinh = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap lop: ");
        lop = sc.nextLine();
       
    }
    
    public void xuat(){
        System.out.println("Ho va ten la: " + hoTen);
        System.out.println("Tuoi la: " + tuoi);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Lop: "+ lop);
        
    }
}
