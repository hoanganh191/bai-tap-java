/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7_Thong_Tin_Hoc_Sinh;

import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class ThiSinh {
    private String soBaoDanh;
    private String hoTen;
    private String diaChi;
    private int uuTien;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so bao danh: ");
        soBaoDanh = sc.nextLine();
        System.out.print("Nhap ho va ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.print("Nhap do uu tien: ");
        uuTien = sc.nextInt();
        
    }
    
    public void hienThi(){
        System.out.println("So bao danh: " + soBaoDanh);
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Uu tien: " + uuTien);
       
    }
    
    public boolean dieuKienDiem(float diem){
        return 0 <= diem && diem <= 10; //dieu kien nhap diem dung 
    }
    
    public boolean tim(String chuoiTim){
        return (soBaoDanh.equalsIgnoreCase(chuoiTim));
    }
    
   
}
