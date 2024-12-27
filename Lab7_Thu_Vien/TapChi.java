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
public class TapChi extends TaiLieu {
    private String soPhatHanh;
    private int thangPhatHanh;
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Nhap so phat hanh: ");
        soPhatHanh = sc3.nextLine();
        System.out.print("Nhap thang phat hanh");
        thangPhatHanh = sc3.nextInt();
        while(thangPhatHanh > 12 || thangPhatHanh < 1){
            System.out.print("Nhap lai thang phat hanh");
            thangPhatHanh = sc3.nextInt();
        }
    }
    
    @Override 
    public void hienThi(){
        super.hienThi();
        System.out.println("So phat hanh la: " + soPhatHanh);
        System.out.println("Thang phat hanh la: " + thangPhatHanh);
    }
    
}
