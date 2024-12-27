/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9_Ho_So_THPT;

import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class HSHocSinh extends Nguoi {
    private String lop;
    private int khoaHoc;
    private int kyHoc;
    
    public int getNamSinh(){
        return namSinh;
    }
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap lop : ");
        lop = sc.nextLine();
        System.out.print("Nhap khoa hoc: ");
        khoaHoc = sc.nextInt();
        System.out.print("Nhap ky hoc: ");
        kyHoc = sc.nextInt();
        System.out.println("");
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Lop : " + lop);
        System.out.println("Khoa hoc: " + khoaHoc);
        System.out.println("Ky hoc: " + kyHoc);
        System.out.println("");
    }
    
    public boolean search(int namTim, String queTim){
       return (namTim == namTim && queQuan.equalsIgnoreCase(queTim));
    }
            
}
