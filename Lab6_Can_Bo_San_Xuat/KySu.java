/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6_Can_Bo_San_Xuat;

import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class KySu extends CanBo {
    private String nganhDaoTao;
    
    public boolean checkNganh(){
        return nganhDaoTao == null || nganhDaoTao.isEmpty();
    }
    
    @Override
    public void nhap(){
        super.nhap(); //ke thua tu lop cha
        System.out.print("Nhap nganh dao tao: ");
        Scanner ks = new Scanner(System.in);
        nganhDaoTao = ks.nextLine();
        while(checkNganh()){
            System.out.print("Nhap lai nganh dao tao : ");
            nganhDaoTao = ks.nextLine();
        }
    }
    
    @Override 
    public void hienThi(){
        super.hienThi(); //ke thua tu lop cha
        System.out.println("Nganh dao tao: "+ nganhDaoTao);
    }
    
    
}
