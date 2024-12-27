/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doc_Ghi_File;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author hoanganh
 */
public class Doc_ghi_nguyen_thuy {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String filePath = "/home/hoanganh/Documents/file_nt.txt";
        File f = new File(filePath);
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(100);
        dos.writeUTF("Hello Tet Holiday");
        dos.close();
        
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        System.out.println("Doc tu file: " + dis.readInt());
        System.out.println("Doc tu file" + dis.readUTF());
        dis.close();
    }
}
