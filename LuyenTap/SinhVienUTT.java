/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap;

import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class SinhVienUTT extends SinhVien {
    private String donVi;
    private long luong;

    public SinhVienUTT() {
        super();
        donVi = "";
        luong = 0;
    }

    public SinhVienUTT(String donVi, long luong, String maSv, String hoTen, int ngaySinh, String gioiTinh, float dtb) {
        super(maSv, hoTen, ngaySinh, gioiTinh, dtb);
        this.donVi = donVi;
        this.luong = luong;
    }

    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("Don vi tinh: " + donVi);
        System.out.println("Luong : "+ luong);
    }
    
    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập đơn vị: ");
        donVi = sc.nextLine();
        System.out.print("Nhập lương: ");
        luong = sc.nextLong();
        sc.nextLine(); 
        System.out.println("----------------------");
    }
    
    
    
}
