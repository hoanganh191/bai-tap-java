/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class DanhSachSV {
    public static void ghiFileUTT(ArrayList<SinhVienUTT> sv, String duongDan){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(duongDan));
            oos.writeObject(sv);
            System.out.println("Luu thanh cong sinh vien UTT");
        } catch (IOException e) {
            System.out.println("Luu file Sinh Vien UTT that bai");
        }
    }
    
    public static void ghiFileHTTT(ArrayList<SinhVienHTTT> sv , String duongDan){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(duongDan));
            oos.writeObject(sv);
            System.out.println("Luu thanh cong Sinh Vien HTTT");
        } catch (IOException e) {
            System.out.println("Luu file that bai Sinh Vien HTTT");
        }
    }
    
    public static void docFileUTT(String duongDan){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(duongDan));
            ArrayList<SinhVienUTT> ketqua = (ArrayList<SinhVienUTT>) ois.readObject() ; //Ta ep kieu luong ois file sang ArrayList roi xuat ra
            for(SinhVienUTT temp : ketqua){ 
                temp.hienThi();
                System.out.println("--------------");
            }
        } catch (Exception e) {
            System.out.println("Loi khi doc file" + e.getMessage());
        }
    }
    
    public static void docFileHTTT(String duongDan){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(duongDan));
            ArrayList<SinhVienHTTT> ketqua = (ArrayList<SinhVienHTTT>) ois.readObject() ; //Ta ep kieu luong ois file sang ArrayList roi xuat ra
            for(SinhVienHTTT temp : ketqua){ 
                temp.hienThi();
                System.out.println("--------------");
            }
        } catch (Exception e) {
            System.out.println("Loi khi doc file" + e.getMessage());
        }
    }
    
    
    public static void main(String[] args) {
        ArrayList<SinhVienUTT> dsUTT = new ArrayList<>(); 
        ArrayList<SinhVienHTTT> dsHTTT = new ArrayList<>();
        String duongDanUTT = "/home/hoanganh/Documents/svutt.dat";
        String duongDanHTTT = "/home/hoanganh/Documents/svhttt.dat";
        Scanner sc = new Scanner(System.in);
        boolean nhapTiep = true;
        while (nhapTiep) {
            System.out.println("Chọn một tùy chọn:");
            System.out.println("1. Nhập thông tin SinhVienUTT");
            System.out.println("2. Nhập thông tin SinhVienHTTT");
            System.out.println("3. Luu tat ca thong tin vao file");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int chon = sc.nextInt();
            sc.nextLine(); 
            switch (chon) {
                case 1:
                    SinhVienUTT svUTT = new SinhVienUTT();
                    svUTT.nhap();
                    dsUTT.add(svUTT); // Thêm vào danh sách
                    break;
                case 2:
                   SinhVienHTTT svHTTT = new SinhVienHTTT();
                   svHTTT.nhap();
                   dsHTTT.add(svHTTT);
                   break;
                case 3:
                    ghiFileUTT(dsUTT, duongDanUTT);
                    ghiFileHTTT(dsHTTT, duongDanHTTT);
                    break;
                case 4:
                    nhapTiep = false;
                    break;
                default:
                   break;
            }
        }
        
        System.out.println("");
        System.out.println("------------Doc lai du lieu tu file file ----------");
        docFileUTT(duongDanUTT);
        System.out.println("--");
        docFileHTTT(duongDanHTTT);
        sc.close();
}

    
}
