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
public class NhanVien extends CanBo {
    private String congViec;
    
    public boolean checkCongViec(){
        return congViec == null || congViec.isEmpty();
    }
    
    @Override
    public void nhap(){
        super.nhap(); //Ke thua tu lop cha
        System.out.print("Nhap cong viec phuc vu: ");
        Scanner nv = new Scanner(System.in);
        congViec = nv.nextLine();
        while(checkCongViec()){
            System.out.print("Nhap lai cong viec phuc vu: ");
            congViec = nv.nextLine();
        }
    }
    
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("Cong viec dang phuc vu: " + congViec);
    }
    
}
