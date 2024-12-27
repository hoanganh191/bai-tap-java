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
public class OTo extends PTGT {
    private int soChoNgoi;
    private String kieuDongCo;
    
    public boolean checkChoNgoi(){
        return soChoNgoi > 0;
    }
    
    public boolean checkDongCo(){
        return !kieuDongCo.isBlank();
    }
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.print("Nhap so cho ngoi: ");
            soChoNgoi = sc.nextInt();
        } while (!checkChoNgoi());
        
        sc.nextLine();
        
        do {            
            System.out.print("Nhap kieu dong co: ");
            kieuDongCo = sc.nextLine();
        } while (!checkDongCo());
        
        System.out.println("");
    }
    
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("So cho ngoi la: " + soChoNgoi);
        System.out.println("Kieu dong co la: " + kieuDongCo);
        System.out.println("");
    }
    
    
    
    
}
