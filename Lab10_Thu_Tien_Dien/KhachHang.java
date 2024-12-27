/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10_Thu_Tien_Dien;

import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class KhachHang {
    private String hoTen;
    private int soNha;
    private String maCongTo;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap so nha: ");
        soNha = sc.nextInt();
        System.out.print("Nhap ma cong to: ");
        sc.nextLine();
        maCongTo = sc.nextLine();
        
    }
    
    public void xuat(){
        System.out.println("Ho ten: " + hoTen);
        System.out.println("So nha: "+ soNha);
        System.out.println("Ma cong to: "+ maCongTo);
    }
}
