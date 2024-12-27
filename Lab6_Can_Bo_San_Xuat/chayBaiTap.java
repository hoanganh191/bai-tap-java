/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6_Can_Bo_San_Xuat;

/**
 *
 * @author hoanganh
 */
public class chayBaiTap {
    public static void main(String[] args) {
        //Ae khai bao cac thuc the tu cac lop va chay code, vi du ky su
        KySu a = new KySu();
        a.nhap();
        System.out.println(""); //Tao khoang trang
        System.out.println("Thong tin cua ky su vua nhap la");
        a.hienThi();
    }
}
