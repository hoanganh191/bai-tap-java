/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quan_Ly_Ho_Dan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class HoDan {
    private int soThanhVien;
    private int soNha;
    private ArrayList<Nguoi> danhSach = new ArrayList<>();
    
    public void nhapHoDan(){
        System.out.print("Nhap so thanh vien :");
        Scanner sc = new Scanner(System.in);
        soThanhVien = sc.nextInt();
        System.out.print("Nhap so nha: ");
        soNha = sc.nextInt();
        for(int i = 0; i < soThanhVien; i++){
            Nguoi daiDien = new Nguoi();
            daiDien.nhapNguoi();
            danhSach.add(daiDien);
        }
        System.out.println("");
    }
    
    public void hienThi(){
        System.out.println("So nha : " + soNha);
        System.out.println("So thanh vien la: " + soThanhVien);
        System.out.println("Danh sach thong tin cac thanh vien la:");
        for(Nguoi i : danhSach){
            i.xuatNguoi();
            System.out.println("");
        }
        
        System.out.println("--------------------------");
    }
}
