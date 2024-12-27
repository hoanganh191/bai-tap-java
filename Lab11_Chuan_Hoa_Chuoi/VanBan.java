/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab11_Chuan_Hoa_Chuoi;

import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class VanBan {
    private String xauKyTu;

    public VanBan() {
        this.xauKyTu = "";
    }

    public VanBan(String st) {
        this.xauKyTu = st;
    }
    
//    De dem so tu can check lenh trim() de xoa khoang trang dau cuoi, 
//    tranh truong hop tach khoang trang thanh 1 tu
    public int demSoTu(){ 
        if (xauKyTu.isBlank()) {
            return 0;
        } else {
            String[] word = xauKyTu.trim().split("\\s+"); //Tham so dau vao chinh la ma regex 
            return word.length;
        }
    }
    
    public int demKyTuH(){
        int soKyTu = 0;       
        for(int i = 0; i < xauKyTu.length(); i++){
            if (xauKyTu.charAt(i) == 'h' || xauKyTu.charAt(i) == 'H') {
                soKyTu++;
                
            }
        }
        
        return soKyTu;
    }
    
    public String chuanHoaChuan(){
        String xuLy = xauKyTu;
        //Xu ly khoang trang dau xau
        xuLy = xuLy.trim();
        
        //Xu ly nhieu khoang trang gan nhau
        xuLy = xuLy.replaceAll("\\s+", " ");
        return xuLy;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi: ");
        String test = sc.nextLine();
        VanBan vanBan1 = new VanBan(test);
        System.out.println("So tu la: " + vanBan1.demSoTu());
        System.out.println("So ky tu H khong phan biet chu hoa thuong la: " + vanBan1.demKyTuH());
        System.out.println("Day sau khi chuan hoa dang chuan la: " + vanBan1.chuanHoaChuan());
        
    }
    
    
}
