/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thong_Tin_Hoc_Sinh;

import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class ThiKhoiB extends ThiSinh {
    private float toan;
    private float sinh;
    private float hoa;
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem toan: ");
        toan = sc.nextFloat();
        while(!dieuKienDiem(toan)) {
            System.out.print("Nhap lai diem toan: ");
            toan = sc.nextFloat();
        }
        
        System.out.print("Nhap diem sinh: ");
        sinh = sc.nextFloat();
        while(!dieuKienDiem(sinh)){
            System.out.print("Nhap lai diem sinh: ");
            sinh = sc.nextFloat();
        }
        
        System.out.print("Nhap diem hoa: ");
        hoa = sc.nextFloat();
        while(!dieuKienDiem(hoa)){
            System.out.print("Nhap lai diem hoa: ");
            hoa = sc.nextFloat();
        }

    }
    
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("Diem toan la: " + toan);
        System.out.println("Diem sinh la: " + sinh);
        System.out.println("Diem hoa la: "+ hoa);
    }
    
    
}
