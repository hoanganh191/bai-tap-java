/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8_Quan_Ly_Thue_Tro;

import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class Nguoi {
    protected String hoTen;
    protected int tuoi;
    protected int namSinh;
    protected String chungMinhThu;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
        System.out.print("Nhap nam sinh: ");
        namSinh = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap so chung minh thu nhan dan: ");
        chungMinhThu = sc.nextLine();
        System.out.println("");
    }
    
    public void xuat(){
        System.out.println("Ho va ten la: " + hoTen);
        System.out.println("Tuoi la: " + tuoi);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("So chung minh nhan dan la: "+ chungMinhThu);
        System.out.println("");
    }
    
}
