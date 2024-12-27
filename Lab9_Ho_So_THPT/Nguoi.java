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
public class Nguoi {
    protected String hoTen;
    protected int tuoi;
    protected int namSinh;
    protected String queQuan;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
        System.out.print("Nhap nam sinh: ");
        namSinh = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap que quan: ");
        queQuan = sc.nextLine();
       
    }
    
    public void xuat(){
        System.out.println("Ho va ten la: " + hoTen);
        System.out.println("Tuoi la: " + tuoi);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Que quan la: "+ queQuan);
        
    }
    
}
