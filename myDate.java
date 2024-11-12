/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_tap_date;

import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class myDate {
    private int date,mouth,year;
    
    public void nhap(){
        System.out.println("Nhap ngay thang nam: ");
        Scanner sc = new Scanner(System.in);
        date = sc.nextInt();
        mouth = sc.nextInt();
        year = sc.nextInt();
    }
    
    public void myDate(){
        nhap();
        System.out.println("Ngay thang nam vua nhap la : "+ date +" "+ mouth +" " + year); 
    }
    
    public void myDate(int a, int b, int c){
        System.out.println("Ngay thang nam vua nhap la : "+ a +" "+ b +" " + c); 
    }
    
    public static void main(String[] args) {
        //Co 2 cach nhap contructor
        //Cach 1 contructor no input
        myDate d = new myDate();
        d.myDate();
        
        //Cach 2 contructor input
        System.out.println("Cach 2 co tham so");
        System.out.println("Nhap ngay thang nam: ");
        Scanner sc2 = new Scanner(System.in);
        int a = sc2.nextInt();
        int b = sc2.nextInt();
        int c = sc2.nextInt();
        d.myDate(a,b,c);
    }
}

