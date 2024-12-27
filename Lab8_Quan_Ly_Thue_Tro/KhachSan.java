/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8_Quan_Ly_Thue_Tro;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class KhachSan {
    private int soNgayTro;
    private int loaiPhongTro;
    private long giaPhong;
    private ArrayList<Nguoi> danhSachKhach = new ArrayList<>();
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so ngay tro: ");
        soNgayTro = sc.nextInt();
        System.out.print("Nhap loai phong tro: ");
        loaiPhongTro = sc.nextInt();
        System.out.print("Nhap gia phong: ");
        giaPhong = sc.nextLong();
        System.out.print("Nhap so luong khach tro: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            Nguoi temp = new Nguoi();
            temp.nhap();
            danhSachKhach.add(temp);
        }
    }
    
    public void xuat(){
//        System.out.println("So ngay tro la: "+soNgayTro);
//        System.out.println("Loai phong tro la: " + loaiPhongTro);
//        System.out.println("Gia phong la: " + giaPhong);
        System.out.println("Thong tin ca nhan cua danh sach khach tro la");
        for(Nguoi x : danhSachKhach){
            x.xuat();
        }
    }
    
    public static void main(String[] args) {
        KhachSan thangThien = new KhachSan();
        thangThien.nhap();
        System.out.println("--------------------------------------");
        System.out.println("");
        System.out.println("Thong tin ve cac khach tro la: ");
        thangThien.xuat();
    }
}
