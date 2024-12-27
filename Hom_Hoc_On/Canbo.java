/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hom_Hoc_On;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author hoanganh
 */
public class Canbo extends Person {
    String phong_ban;
    float hsl;
    int tham_nien, luong_cb;
    
    public Canbo(String ht, String gt, String dc, int ns,String pb, 
        float h, int tn, int lcb ){
        super(ht, ns, dc, gt);
        phong_ban= pb;
        hsl=h;
        tham_nien=tn;
        luong_cb=lcb;
    }

    private Canbo() {
        
        
    }
    public void xuat(){
        super.xuat();
        System.out.println("Phong ban:"+ phong_ban+"\nHsl:"+ hsl);
        System.out.println("Tham nien:"+ tham_nien+"\nLuong cb:"+ luong_cb);
    } 
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
       String pathname = "/home/hoanganh/Documents/docdoituong.txt";
       File f = new File(pathname);
       FileOutputStream fos = new FileOutputStream(f);
       ObjectOutputStream oos = new ObjectOutputStream(fos);
       Canbo c = new Canbo();
       c.nhap();
       oos.writeObject(c);
       oos.close();
       
       FileInputStream fis = new FileInputStream(f);
       ObjectInputStream ois = new ObjectInputStream(fis);
       Canbo cb = (Canbo) ois.readObject();
       cb.xuat();
       ois.close();
       
    }
}
