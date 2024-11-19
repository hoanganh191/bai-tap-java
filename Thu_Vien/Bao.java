/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thu_Vien;

import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class Bao extends TaiLieu {
    private int ngayPhatHanh;
    
    @Override 
    public void nhap(){
        super.nhap();
        Scanner sc4 = new Scanner(System.in);
        System.out.print("Nhap ngay phat hanh");
        ngayPhatHanh = sc4.nextInt();
        while(ngayPhatHanh > 31 || ngayPhatHanh < 1) {
            System.out.print("Nhap lai ngay phat hanh");
            ngayPhatHanh = sc4.nextInt();

        }
        
    }
    
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("Ngay phat hanh la: " + ngayPhatHanh);
    }
}
