/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9_Ho_So_THPT;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class chayBai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <HSHocSinh> danhSach = new ArrayList<>();
        System.out.println("Nhap so luong hoc sinh: ");
        int n = sc.nextInt();
        for(int i = 0; i < n ; i++){
            HSHocSinh temp = new HSHocSinh();
            temp.nhap();
            danhSach.add(temp);
            System.out.println("");
        }
        System.out.println("--------------------------------");
        System.out.println("Danh sach hoc sinh sinh nam 1985 la: ");
        for(HSHocSinh x : danhSach){
            if(x.getNamSinh() == 1985){
                x.xuat();
            }
        }
        
        System.out.println("----------------------------------");
        System.out.println("Danh sach hoc sinh sinh nam 1985 va que thai nguyen la: ");
        for(HSHocSinh x : danhSach){
            if (x.search(1985, "Thai Nguyen")) {
                x.xuat();
            }
        }
    }
}
