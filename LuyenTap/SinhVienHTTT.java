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
public class SinhVienHTTT extends SinhVien {
    private long hocPhi;

    public SinhVienHTTT() {
        super();
        hocPhi = 0;
    }

    public SinhVienHTTT(long hocPhi, String maSv, String hoTen, int ngaySinh, String gioiTinh, float dtb) {
        super(maSv, hoTen, ngaySinh, gioiTinh, dtb);
        this.hocPhi = hocPhi;
    }
    
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("Hoc phi: " + hocPhi);
    }
    
    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập học phí: ");
        hocPhi = sc.nextLong();
        sc.nextLine(); 
        System.out.println("-----------------------");
    }
    
}
