/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7_Thong_Tin_Hoc_Sinh;

import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class ThiKhoiC extends ThiSinh {
    private float van;
    private float su;
    private float dia;
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem van: ");
        van = sc.nextFloat();
        while(!dieuKienDiem(van)) {
            System.out.print("Nhap lai diem van: ");
            van = sc.nextFloat();
        }
        
        System.out.print("Nhap diem su: ");
        su = sc.nextFloat();
        while(!dieuKienDiem(su)){
            System.out.print("Nhap lai diem ly: ");
            su = sc.nextFloat();
        }
        
        System.out.print("Nhap diem dia: ");
        dia = sc.nextFloat();
        while(!dieuKienDiem(dia)){
            System.out.print("Nhap lai diem dia: ");
            dia = sc.nextFloat();
        }

    }
    
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("Diem van la: " + van);
        System.out.println("Diem su la: " + su);
        System.out.println("Diem dia la: "+ dia);
    }
}
