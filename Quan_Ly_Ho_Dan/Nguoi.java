/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quan_Ly_Ho_Dan;

import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class Nguoi {
    private String hoTen;
    private int tuoi;
    private int namSinh;
    private String ngheNghiep;
    
    public void nhapNguoi(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten ");
        hoTen = sc.nextLine();
        System.out.print("Nhap tuoi :");
        tuoi = sc.nextInt();
        System.out.print("Nhap nam sinh: ");
        namSinh = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap nghe nghiep: ");
        ngheNghiep = sc.nextLine();
        System.out.println("");
    }
    
    public void xuatNguoi(){
        System.out.println("Ho va ten: "+ hoTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Nam sinh: "+ namSinh);
        System.out.println("Nghe nghiep : "+ ngheNghiep);
    }
    
    
    
}
