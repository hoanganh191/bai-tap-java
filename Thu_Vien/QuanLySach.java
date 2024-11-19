/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thu_Vien;

/**
 *
 * @author hoanganh
 */
public class QuanLySach {
    public static void main(String[] args) {
        System.out.println("Nhap thong tin ve Sach");
        Sach sgk = new Sach();
        sgk.nhap();
        System.out.println("");
        System.out.println("Nhap thong tin ve Tap Chi");
        TapChi tapChi1 = new TapChi();
        tapChi1.nhap();
        System.out.println("");
        System.out.println("Nhap thong tin ve Bao");
        Bao baoMoi = new Bao();
        baoMoi.nhap();
        System.out.println("");
        System.out.println("Thong tin ve sach vua nhap la: ");
        sgk.hienThi();
        System.out.println("");
        tapChi1.hienThi();
        System.out.println("");
        baoMoi.nhap();
    }
}
