/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9_Tien_Luong_GV;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class CBGV extends Nguoi {
    private long luongCung;
    private long thuong;
    private long phat;
    private long luongThucLinh;
    
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap luong cung: ");
        luongCung = sc.nextLong();
        System.out.print("Nhap thuong: ");
        thuong = sc.nextLong();
        System.out.print("Nhap phat: ");
        phat = sc.nextLong();
        System.out.println("");
    }
    
    public void tinhLuong(){
        luongThucLinh = luongCung + thuong - phat;
    }
    
    public void xuat(){
        super.xuat();
//        System.out.println("luong cung :" + luongCung);
//        System.out.println("thuong: " + thuong);
//        System.out.println("phat: " + phat);
//        tinhLuong();
//        System.out.println("Luong thuc linh la: " + luongThucLinh);
//        System.out.println("");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CBGV> danhSach = new ArrayList<>();
        System.out.println("Nhap so luong giao vien: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            CBGV temp = new CBGV();
            temp.nhap();
            danhSach.add(temp);
        }
        
        System.out.println("-----Thong tin ca nhan giao vien la----------");
        for(CBGV x : danhSach){
            x.xuat();
        }
    }
}
