/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class SinhVien implements Serializable { //Luu ys cai implements (chuoi hoa) de con ghi file 
    protected String maSv;
    protected String hoTen;
    protected int ngaySinh;
    protected String gioiTinh;
    protected float dtb;

    public SinhVien() {
        maSv = "";
        hoTen = "";
        ngaySinh = 0;
        gioiTinh = "";
        dtb = 0;
    }

    public SinhVien(String maSv, String hoTen, int ngaySinh, String gioiTinh, float dtb) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.dtb = dtb;
    }
    
    public void hienThi(){
        System.out.println("Ma sinh vien : " + maSv);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Gioi tinh : " + gioiTinh);
        System.out.println("Diem trung binh: "+ dtb);
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        maSv = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập ngày sinh : ");
        ngaySinh = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Nhập giới tính: ");
        gioiTinh = sc.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        dtb = sc.nextFloat();
        sc.nextLine(); // Consume newline
    }
    
    
}
