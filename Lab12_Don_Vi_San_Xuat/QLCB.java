/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab12_Don_Vi_San_Xuat;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class QLCB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <CanBo> danhSach = new ArrayList<>();
        boolean nhapTiep = true;
        while(nhapTiep){
            CanBo CanBoTemp = null;
            System.out.println("1.Nhap cac can bo");
            System.out.println("2.Tim kiem theo ho ten");
            System.out.print("Nhap lua chon cua ban: ");
            int chon = sc.nextInt();
            switch(chon){
                case 1:
                    System.out.println("--------------------------");
                    System.out.println("Chon loai can bo muon nhap: ");
                    System.out.println("1. Cong nhan");
                    System.out.println("2. Ky su");
                    System.out.println("3. Nhan vien");
                    System.out.print("Lua chon cua ban: ");
                    int chonLoai = sc.nextInt();
                    switch(chonLoai){
                        case 1:
                            CanBoTemp = new CongNhan();
                            CanBoTemp.nhap();
                            break;
                        case 2:
                            CanBoTemp = new KySu();
                            CanBoTemp.nhap();
                            break;
                        default:
                            CanBoTemp = new NhanVien();
                            CanBoTemp.nhap();
                        
                        danhSach.add(CanBoTemp);
                        break;
                    }
                    
                case 2:
                    System.out.print("Nhap ten can bo muon tim kiem: ");
                    sc.nextLine();
                    String tenCanTim = sc.nextLine();
                    for(CanBo x : danhSach){
                        if (x.timTen(tenCanTim)) {
                            x.hienThi();
                        }
                    }
                    
                default:
                    nhapTiep = false;
            }
                
        }
    }
}
