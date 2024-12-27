/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7_Thu_Vien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class QuanLySach {
    public static void main(String[] args) {
        ArrayList<TaiLieu> loaiSach = new ArrayList<>();
        System.out.println("Nhap so sach muon nhap: ");
        Scanner sc = new Scanner(System.in);
        int soSach = sc.nextInt();
        for(int i = 0; i < soSach; i++){
            TaiLieu luuThongTin = null; //De bat dau moi vong lap thi object nay trong thong tin
            System.out.println("Chọn loại tài liệu cho tài liệu thứ " + (i + 1) + ":");
            System.out.println("1. Sach");
            System.out.println("2. Tap chi");
            System.out.println("3. Bao");
            System.out.print("Lựa chọn: ");
            int chon = sc.nextInt();
            
            switch(chon){
                case 1:
                    luuThongTin = new Sach();
                    luuThongTin.nhap();
                    loaiSach.add(luuThongTin);
                    System.out.println("");
                    break;
                case 2:
                    luuThongTin = new TapChi();
                    luuThongTin.nhap();
                    loaiSach.add(luuThongTin);
                    System.out.println("");
                    break;
                case 3:
                    luuThongTin = new Bao();
                    luuThongTin.nhap();
                    loaiSach.add(luuThongTin);
                    System.out.println("");
                    break;
            }
        }
        
        System.out.println("Thong tin cac loai sach vua nhap la: ");
        for(TaiLieu b : loaiSach){
            b.hienThi();
            
        }

    }
}
