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
public class Sach extends TaiLieu {
    private String tacGia;
    private int soTrang;
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Nhap ten tac gia: ");
        tacGia = sc2.nextLine();
        System.out.print("Nhap so trang: ");
        soTrang = sc2.nextInt();
    }
    
    @Override 
    public void hienThi(){
        super.hienThi();
        System.out.println("Ten tac gia: " + tacGia);
        System.out.println("So trang: " + soTrang);
    }
}
