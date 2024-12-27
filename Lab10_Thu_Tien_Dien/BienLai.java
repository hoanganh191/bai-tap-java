/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10_Thu_Tien_Dien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class BienLai {
    KhachHang thongTinRieng = new KhachHang();
    private int chiSoCu;
    private int chiSoMoi;
    private long soTienPhaiTra;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        thongTinRieng.nhap();
        System.out.print("Nhap chi so cu: ");
        chiSoCu = sc.nextInt();
        System.out.print("Nhap chi so moi: ");
        chiSoMoi = sc.nextInt();
        System.out.println("");
       
    }
    
    public void tinhTien(){
        soTienPhaiTra = (chiSoMoi - chiSoCu)*750;
    }
    
    public void xuat(){
        thongTinRieng.xuat();
        System.out.println("Chi so cu la: "+chiSoCu);
        System.out.println("Chi so moi la: "+chiSoMoi);
        tinhTien();
        System.out.println("So tien phai tra la: " + soTienPhaiTra);
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <BienLai> danhSachBienLai = new ArrayList<>();
        System.out.print("Nhap so ho su dung dien: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            BienLai temp = new BienLai();
            temp.nhap();
            danhSachBienLai.add(temp);
        }
        
        System.out.println("----Thong tin bien lai da nhap la--------");
        for(BienLai x : danhSachBienLai){
            x.xuat();
        }
    }
}
