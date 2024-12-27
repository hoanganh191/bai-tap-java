/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab12_Quan_Ly_Phuong_Tien;

import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class XeMay extends PTGT {
    private int congSuat;
    
    public boolean checkCongSuat(){
        return congSuat > 0;
    }
    
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        do {            
            System.out.print("Nhap cong suat: ");
            congSuat = sc.nextInt();
        } while (!checkCongSuat());
        System.out.println("");
    }
    
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("Cong suat : " + congSuat);
        System.out.println("");
    }
    
    
}
