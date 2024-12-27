/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doc_Ghi_File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author hoanganh
 */
public class Nhap_Tu_Ban_Phim {
    public static void main(String[] args) throws IOException {
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
//        System.out.println("Nhap tu ban phim " + br.readLine());
//        br.close();

        String filePath = "/home/hoanganh/Documents/myfile.txt";
        File myfile = new File(filePath);
        FileWriter fw = new FileWriter(myfile);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("Que huong la chum khe ngot");
        pw.println("Cho con treo hai moi ngay");
        pw.close();
        FileReader fr = new FileReader(myfile);
        BufferedReader br = new BufferedReader(fr);
        String s ="";
        while((s = br.readLine()) != null){
              System.out.println("Doc tu file : " + s);
        }
        br.close();
    }
}
