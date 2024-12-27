/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab11_So_Phuc;

import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class SoPhuc {
    private double phanThuc;
    private double phanAo;
    
    public SoPhuc(){
        phanThuc = 0;
        phanAo = 0;
    }
    
    public SoPhuc(float a, float b){
        this.phanThuc = a;
        this.phanAo = b;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan thuc: ");
        phanThuc = sc.nextDouble();
        System.out.print("Nhap phan ao: ");
        phanAo = sc.nextDouble();
    }
    
    public void hienThi(){ //Chu y hien thi khi phan ao am/duong
        if (phanAo >= 0) {
            System.out.println(phanThuc + " + " + phanAo +" i");
        } else {
            System.out.println(phanThuc + " " + phanAo + " i");
        }
        
    }
    
    public SoPhuc cong(SoPhuc sp2){
        SoPhuc ketQua = new SoPhuc();
        ketQua.phanThuc = phanThuc + sp2.phanThuc;
        ketQua.phanAo = phanAo + sp2.phanAo;
        return ketQua;
    }
    
    public SoPhuc nhan(SoPhuc sp2){
        SoPhuc ketQua = new SoPhuc();
        ketQua.phanThuc = phanThuc*sp2.phanThuc - phanAo*sp2.phanAo;
        ketQua.phanAo = phanThuc*sp2.phanAo + phanAo*sp2.phanThuc;
        return ketQua;
    }
    
    public static void main(String[] args) {
        SoPhuc A = new SoPhuc();
        SoPhuc B = new SoPhuc();
        SoPhuc C = new SoPhuc();
        System.out.println("------Nhap so phuc A--------");
        A.nhap();
        System.out.println("------Nhap so phuc B--------");
        B.nhap();
        System.out.println("------C = A x B la----------");
        C = A.nhan(B);
        C.hienThi();
    }
}
