/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hom_Hoc_On;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class Person implements Serializable {
    
    String Hoten;
    int NgaySinh;
    String DiaChi;
    String GioiTinh;
    
    public Person(){
        
    }

    public Person(String Hoten, int NgaySinh, String DiaChi, String GioiTinh) {
        this.Hoten = Hoten;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
    }
    
    public void nhap(){
        System.out.println("Nhap Ho ten:");
        Scanner sc = new Scanner(System.in);
        Hoten= sc.nextLine();
        System.out.println("Nhap Ngay Sinh: ");
        NgaySinh=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap Gioi Tinh;");
        GioiTinh= sc.nextLine();
        System.out.println("Nhap Dia Chi:");
        DiaChi= sc.nextLine();
}
     public void xuat(){
       Scanner sc = new Scanner (System.in);
       System.out.println("Ho ten: "+Hoten+"\tNam Sinh: "+NgaySinh+"\tGioi Tinh: "+GioiTinh+ "\tDia Chi: "+DiaChi);
   }  
}