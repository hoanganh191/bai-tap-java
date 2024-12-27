/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab12_Quan_Ly_Phuong_Tien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class QLPTGT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <PTGT> danhSach = new ArrayList<>();
        boolean nhapTiep = true;
        int chon;
        while (nhapTiep) {            
            System.out.println("1.Nhap cac phuong tien");
            System.out.println("2.Tim phuong tien theo mau");
            System.out.println("3.Ket thuc");
            System.out.print("Nhap lua chon cua ban: ");
            PTGT phuongTien = null;
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("--------------------------");
                    System.out.println("Chon loai xe muon nhap: ");
                    System.out.println("1. Oto");
                    System.out.println("2. Xe may");
                    System.out.println("3. Xe tau");
                    System.out.print("Lua chon xe: ");
                    int chonXe = sc.nextInt();
                    switch(chonXe){
                        case 1:
                            phuongTien = new OTo();
                            phuongTien.nhap();
                            break;
                        
                        case 2:
                            phuongTien = new XeMay();
                            phuongTien.nhap();
                           
                            break;
                             
                        default:
                            phuongTien = new XeTai();
                            phuongTien.nhap();
                            
                            break;
                    }
                    danhSach.add(phuongTien);
                    break;
                    
                case 2 :
                    System.out.print("Nhap mau sac muon tim kiem: ");
                    sc.nextLine();
                    String mauCanTim = sc.nextLine();
                    for(PTGT x : danhSach){
                        if(x.timMau(mauCanTim)) x.hienThi();
                    }
                    break;
                    
                default:
                    nhapTiep = false;
                    
            }
        }
    }
    
}
