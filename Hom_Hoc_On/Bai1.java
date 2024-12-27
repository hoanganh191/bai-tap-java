/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hom_Hoc_On;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author hoanganh
 */
public class Bai1 {
    public static void main(String[] args) throws IOException {
        String filePath = "/home/hoanganh/Documents/nhanvien.dat";
        File myFile = new File(filePath);
        FileWriter fw = new FileWriter(myFile);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("Nguyen Van si$25-8-1983$Agentina$Nu");
        pw.println("Nguyen Do Thu$17-5-1981$Dong Lao$Nam");
        pw.close();
        
        //Doc file
        
        
    }
}
