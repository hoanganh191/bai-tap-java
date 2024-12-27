/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hom_Hoc_On;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author hoanganh
 */
public class Employee extends Person{
String phong_ban;
    float hsl;
    int tham_nien, luong_cb;
    public Employee(String ht, String gt, String dc, int ns,String pb, 
        float h, int tn, int lcb ){
        super(ht, ns, dc, gt);
        phong_ban= pb;
        hsl=h;
        tham_nien=tn;
        luong_cb=lcb;
    }
    public void xuat(){
        super.xuat();
        System.out.println("Phong ban:"+ phong_ban+"\nHsl:"+ hsl);
        System.out.println("Tham nien:"+ tham_nien+"\nLuong cb:"+ luong_cb);
    } 
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileReader fr= new FileReader(new File("/home/hoanganh/Documents/nhanvien.txt"));
        BufferedReader br=new BufferedReader(fr);
        String s="";
        ArrayList<Employee> ar= new ArrayList<>();
        while((s=br.readLine())!=null){
            String[] a= s.split("\\$");
            Employee e= new Employee(a[0], a[1], a[2], Integer.parseInt(a[3]), 
           a[4], Float.parseFloat(a[5]), Integer.parseInt(a[6]),
                    Integer.parseInt(a[7]));
            ar.add(e);
        }
        br.close();
        for(Employee ee: ar){
            ee.xuat();
        }
    }
}

 

