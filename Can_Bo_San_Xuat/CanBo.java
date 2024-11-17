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
public class CanBo {
    private String hoTen;
    private int namSinh;
    private String gioiTinh;
    private String diaChi;
    
    
    //Ham check
    public boolean checkTen(){
        
        return hoTen == null || hoTen.isEmpty(); //Vi day la dieu kien boolean nen tra ve luon tranh du thua code
    }
    
    public boolean checkNamSinh(){
        
        return namSinh <= 1900 || namSinh >= 2024;
    }
    
    public boolean checkGioiTinh(){
        
        return (gioiTinh.equalsIgnoreCase("nam") == false && gioiTinh.equalsIgnoreCase("nu") == false )|| gioiTinh == null;
    }
    
    public boolean checkDiaChi(){
        
        return diaChi == null || diaChi.isEmpty();
    }
    
    //Ham Nhap
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ho va ten : ");
        hoTen = sc.nextLine();
        while(checkTen()){
            System.out.print("Nhap lai hoc va ten: ");
            hoTen = sc.nextLine();
        }
        
        System.out.print("Nhap nam sinh : ");
        namSinh = sc.nextInt();
        sc.nextLine(); //Xoa bo nho dem phim enter de tranh bi troi lenh
        while(checkNamSinh()) {
            System.out.print("Nhap lai nam sinh: ");
            namSinh = sc.nextInt();
            sc.nextLine();
        }
        
        System.out.print("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        while(checkGioiTinh()){
            System.out.print("Nhap lai gioi tinh: ");
            gioiTinh = sc.nextLine();
        }
        
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
        while(checkDiaChi()){
            System.out.print("Nhap lai dia chi: ");
            diaChi = sc.nextLine();

        }

    }
    
    //Ham hien thi
    public void hienThi(){
        System.out.println("Ten nhan vien la: " + hoTen);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Dia chi: " + diaChi);
    }
    
}
