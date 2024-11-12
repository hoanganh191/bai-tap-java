/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phan_so;

import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class PhanSo {
    private int tu,mau;
    //Contructor mac dinh, khoi tao gia tri mac dinh
    public PhanSo(){
        tu = 1;
        mau = 1;
    }
    
    public PhanSo(int a, int b){
        tu = a;
        mau = b;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so va mau so: ");
        tu = sc.nextInt();
        mau = sc.nextInt();
    }
    
    public void xuat(){
        System.out.println("Phan so la : "+ tu + "/" + mau);
    }
    
    public PhanSo cong(PhanSo a){
        PhanSo c = new PhanSo();
        c.tu = tu*a.mau + a.tu*mau;
        c.mau = a.mau * mau;
        return c;
    }
    
    public PhanSo tru(PhanSo a){
        PhanSo c = new PhanSo();
        c.tu = tu*a.mau - a.tu*mau;
        c.mau = a.mau * mau;
        return c;
    }
    
    public PhanSo nhan(PhanSo a){
        PhanSo c = new PhanSo();
        c.tu = tu*a.tu;
        c.mau = a.mau * mau;
        return c;
    }
    
    public PhanSo chia(PhanSo a){
        PhanSo c = new PhanSo();
        c.tu = tu*a.mau;
        c.mau = a.tu * mau;
        return c;
    }
    
    public static void main(String[] args) {
        //Co 2 cach de khoi tao lop
        //Khoi tao ps1 bang contructor no input
        PhanSo ps1 = new PhanSo();
        ps1.nhap();
        
        //Khoi tao ps2 bang contructor co input
        System.out.println("Nhap tu so va mau so thu 2: ");
        Scanner sc2 = new Scanner(System.in);
        int a = sc2.nextInt();
        int b = sc2.nextInt();
        PhanSo ps2 = new PhanSo(a,b);

        //Thuc hien phep tinh
        System.out.print("Cong - ");
        ps1.cong(ps2).xuat();
        System.out.print("Tru -  ");
        ps1.tru(ps2).xuat();
        System.out.print("Nhan - ");
        ps1.nhan(ps2).xuat();
        System.out.print("Chia - ");
        ps1.chia(ps2).xuat();
    }
}
