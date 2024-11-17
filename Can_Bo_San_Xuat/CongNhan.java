/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Can_Bo_San_Xuat;

import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class CongNhan extends CanBo{
    private int bac;
    
    public boolean checkBac(){
        return bac < 0 || bac > 7;
    }
    
@Override  
    public void nhap(){
        super.nhap(); //Ke thua tu lop cha
        System.out.print("Nhap bac luong : ");
        Scanner cn = new Scanner(System.in);
        bac = cn.nextInt();
        while(checkBac()){
            System.out.print("Nhap bac luong : ");
            bac = cn.nextInt();
        }
        
    }
    
@Override
    public void hienThi(){
        super.hienThi();
        System.out.println("Bac luong la: " + bac + "/7");
    }
    
    
}
