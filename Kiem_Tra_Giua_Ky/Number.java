/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kiem_Tra_Giua_Ky;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class Number implements Serializable {
    private int value;
    private int min;
    private int max;
    
    
    public Number(){
        value = 0;
        min = 0;
        max = 0;
        
    }
    
    public Number(int value, int min, int max,boolean soNguyenTo){
        this.value = value;
        this.min = min;
        this.max = max;
        
    }
    
    public void nhap() throws Exception{ //Bài này tớ ném ngoại lệ để khi gọi trong main sẽ bắt các ngoại lệ này 
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhap gia tri value : ");
            value = sc.nextInt();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ban phai nhap gia tri la so");
        } 
        
        try {
            System.out.print("Nhap gia tri min : ");
            min = sc.nextInt();
            if(min > value) throw new Exception("Vui long nhap min < value");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ban phai nhap gia tri la so");
        }
        
        try {
            System.out.print("Nhap gia tri max :");
            max = sc.nextInt();
            if(max < min) throw new Exception("Vui long nhap max > min");
            if(max < value) throw new Exception("Vui long nhap max > value");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ban phai nhap gia tri la so");
        }
        
        
        
    }
    
    public boolean checkNto(){
        if(value < 2) return false;
        for(int i = 2; i < value; i++){
            if(value % i == 0) return false;
        }
        
        return true;
        
    }
    
    private static void luuFile(ArrayList<Number> ds, String duongDan){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(duongDan));
            oos.writeObject(ds);
            System.out.println("Luu thanh cong");
        } catch (IOException e) {
            System.out.println("Luu file that bai");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Number> ds = new ArrayList<>();
        boolean nhapTiep = true;
        while(nhapTiep){
            System.out.println("Chọn một tùy chọn:");
            System.out.println("1. Nhập các thông tin Number");
            System.out.println("2. Lưu thông tin Number từ file");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            
            int luaChon = sc.nextInt();
            
            switch (luaChon) {
                case 1:
                    Number num = new Number();
                    try {
                        num.nhap();
                    } catch (Exception e) { //này để bắt ngoại lệ , ExcExceptioneption Là ngoại lệ lớp cha nên nó sẽ bắt ngoại lệ nào vi phạm
                        System.out.println("");
                        System.out.println("Loi : " + e.getMessage());
                        System.out.println("Vui long nhap lai tu dau: ");
                        System.out.println("--------------------------------------------");
                        break;
                    }
                    
                    if(num.checkNto() == true) {
                        ds.add(num);
                        System.out.println("Luu thanh cong");
                    } else {
                        System.out.println("Khong luu do khong la so nguyen to");
                    }
                    break;
                    
                case 2:
                    String duongDan = "/home/hoanganh/Documents/luuNumber.txt"; //Đoạn này cậu thay đường dẫn của win nhé như D:\\ketqua.txt chẳng han
                    luuFile(ds, duongDan);
                case 3:
                    nhapTiep = false;
                default:
                    break;
                    
            }
        }
    }
    
}
