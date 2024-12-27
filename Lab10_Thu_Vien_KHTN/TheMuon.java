/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10_Thu_Vien_KHTN;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class TheMuon {
    private int soPhieuMuon;
    private LocalDate ngayMuon;
    private LocalDate hanTra;
    private String soHieuSach;
    private SinhVien thongTinCaNhan = new SinhVien();
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phieu muon");
        soPhieuMuon = sc.nextInt();
        System.out.print("Nhap ngay muon: ");
        int ngay,thang,nam;
        ngay = sc.nextInt();
        thang = sc.nextInt();
        nam = sc.nextInt();
        ngayMuon = LocalDate.of(nam, thang, ngay);
        System.out.print("Nhap han tra: ");
        ngay = sc.nextInt();
        thang = sc.nextInt();
        nam = sc.nextInt();
        hanTra = LocalDate.of(nam, thang, ngay);
        System.out.print("Nhap so hieu sach");
        sc.nextLine();
        soHieuSach = sc.nextLine();
        System.out.println("Nhap thong tin ca nhan");
        thongTinCaNhan.nhap();
        System.out.println("");
    }
    
    public void xuat(){
        System.out.println("So phieu muon la: " + soPhieuMuon);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String ngayMuon2 = ngayMuon.format(formatter);
        String hanTra2 = hanTra.format(formatter);
        System.out.println("Ngay muon la: " + ngayMuon2);
        System.out.println("Han tra la: " + hanTra2);
        System.out.println("So hieu sach la: " + soHieuSach);
        thongTinCaNhan.xuat();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <TheMuon> danhSachThe = new ArrayList<>();
        System.out.print("Nhap so the muon: ");
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            TheMuon temp = new TheMuon();
            temp.nhap();
            danhSachThe.add(temp);
        }
        
        System.out.println("---------Thong tin vya nhap la --------------");
        for(TheMuon x : danhSachThe){
            x.xuat();
        }
    }
}
