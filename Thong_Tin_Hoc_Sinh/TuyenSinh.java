/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thong_Tin_Hoc_Sinh;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class TuyenSinh {
    public static void main(String[] args) {
        ArrayList<ThiSinh> danhSach = new ArrayList<>();
        System.out.print("Nhap so luong hoc sinh muon nhap: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            ThiSinh nhapThiSinh = null;
            System.out.println("Chon khoi thi cua thi sinh: ");
            System.out.println("1. Khoi A");
            System.out.println("2. Khoi B");
            System.out.println("3. Khoi C");
            System.out.println("Nhap gia tri: ");
            int chon = sc.nextInt();
            switch(chon){
                case 1:
                    nhapThiSinh = new ThiKhoiA();
                    nhapThiSinh.nhap();
                    danhSach.add(nhapThiSinh);
                    System.out.println("");
                    break;
                
                case 2:
                    nhapThiSinh = new ThiKhoiB();
                    nhapThiSinh.nhap();
                    danhSach.add(nhapThiSinh);
                    System.out.println("");
                    break;
                
                case 3:
                    nhapThiSinh = new ThiKhoiC();
                    nhapThiSinh.nhap();
                    danhSach.add(nhapThiSinh);
                    System.out.println("");
                    break;
                    
                default:
                    System.out.println("Loi ban oi");
                    break;
            }
            
        }
        
        System.out.println("Danh sach thi sinh vua nhap la: ");
        for(ThiSinh i : danhSach){
            i.hienThi();
            System.out.println("");
        }
        

    }
    
}
