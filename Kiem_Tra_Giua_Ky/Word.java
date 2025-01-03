/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kiem_Tra_Giua_Ky;

import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class Word {
    private String id;
    private String en;
    private String vn;

    public Word(String id, String en, String vn) {
        this.id = id;
        this.en = en;
        this.vn = vn;
    }

    public Word() {
        this.id = "";
        this.en = "";
        this.vn = "";
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id ");
        this.id = sc.nextLine();
        System.out.println("Nhap tu tieng anh");
        this.en = sc.nextLine();
        System.out.println("Nhap nghia tieng viet");
        this.vn = sc.nextLine();
    }
    
}
