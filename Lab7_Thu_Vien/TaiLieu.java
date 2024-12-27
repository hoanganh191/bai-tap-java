/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7_Thu_Vien;

import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class TaiLieu {
    private String maTaiLieu;
    private String nhaXuatBan;
    private int soBanPhatHanh;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma tai lieu: ");
        maTaiLieu = sc.nextLine();
        System.out.print("Nhap ten nha xuat ban: ");
        nhaXuatBan = sc.nextLine();
        System.out.print("Nhap so ban phat hanh: ");
        soBanPhatHanh = sc.nextInt();
    }
    
    public void hienThi(){
        System.out.println("Ma tai lieu la: " + maTaiLieu);
        System.out.println("Ten nha xuat ban la: " + nhaXuatBan);
        System.out.println("Nhap so ban phat hanh: "+soBanPhatHanh);
    }
}
