/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab12_Quan_Ly_Phuong_Tien;

import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class PTGT {
    protected String hangSx;
    protected int namSx;
    protected long giaBan;
    protected String mau;
    
    public boolean checkHang(){
        return !hangSx.trim().isEmpty(); //Vi Neu hangsx.isemty == true thi can bao nhap sai (false) => can phu dinh ! 
    }
    
    public boolean checkNamSx(){
        return (namSx > 1000 && namSx < 2025);
    }
    
    public boolean checkGia(){
        return giaBan > 0;
    }
    
    public boolean checkMau(){
        return !mau.trim().isBlank(); //cach2 de check xem nguoi dung co nhap gi khong, isBlank k quan tam khoang trang , con emty thi co tinh
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.print("Nhap hang sx: ");
            hangSx = sc.nextLine();
        } while (!checkHang());
        
        do {            
            System.out.print("Nhap nam san xuat: ");
            namSx = sc.nextInt();
        } while (!checkNamSx());
        
        do {            
            System.out.print("Nhap gia ban: ");
            giaBan = sc.nextLong();
        } while (!checkGia());
        
        sc.nextLine();
         
        do {            
            System.out.print("Nhap mau: ");
            mau = sc.nextLine();
        } while (!checkMau());
       
    }
    
    public void hienThi(){
        System.out.println("------------------------------");
        System.out.println("Hang san san xuat : " + hangSx);
        System.out.println("Nam san xuat: "+namSx);
        System.out.println("Gia ban: " + giaBan);
        System.out.println("Mau sac: " + mau);
    }
    
    public boolean timMau(String mauCanTim){
        return  mau.equalsIgnoreCase(mauCanTim);
    }
    
}
