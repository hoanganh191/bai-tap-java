/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kiem_Tra_Giua_Ky;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoanganh
 */
public class Dictionary {
    private ArrayList<Word> dsTu = new ArrayList<>();
    private int soTu;

    public Dictionary() {
        soTu = 0;
    }

    public Dictionary(int soTu) {
        this.soTu = soTu;
    }
    
    public int timKiem(String chuoiTim){
        int left = 0;
        int right = soTu - 1; 
        while(left <= right) {
            int mid = left + (right - left)/2;
            int ketQuaSoSanh = chuoiTim.compareTo(dsTu.get(mid).getEn());
            if(ketQuaSoSanh == 0) {
                return mid;
            }
            
            if (ketQuaSoSanh < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
       
        return -1; //Neu vong while chay het va khong tim thay
    }
    
    public void sapXep(){
        for(int i = 0; i < soTu ; i++){
            int minIndex = i;
            for(int j = i + 1; j < soTu; j++){
                if (dsTu.get(j).getEn().compareTo(dsTu.get(minIndex).getEn()) < 0) {
                    minIndex = j;
                }
            }
            
            if (minIndex != i) {
                Word temp = dsTu.get(i);
                dsTu.set(i, dsTu.get(minIndex));
                dsTu.set(minIndex, temp);
            }
        }
    }
    
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary(10);
        
        dictionary.dsTu.add(new Word("1", "apple", "táo"));
        dictionary.dsTu.add(new Word("2", "banana", "chuối"));
        dictionary.dsTu.add(new Word("3", "cherry", "anh đào"));
        dictionary.dsTu.add(new Word("4", "date", "chà là"));
        dictionary.dsTu.add(new Word("5", "elephant", "voi"));
        dictionary.dsTu.add(new Word("6", "fig", "sung"));
        dictionary.dsTu.add(new Word("7", "grape", "nho"));
        dictionary.dsTu.add(new Word("8", "honeydew", "dưa xanh"));
        dictionary.dsTu.add(new Word("9", "kiwi", "kiwi"));
        dictionary.dsTu.add(new Word("10", "lemon", "chanh"));
        
        dictionary.sapXep();
        
        System.out.println("Nhap gia tri ban muon tim trong tu dien: ");
        Scanner sc = new Scanner(System.in);
        String chuoiTim = sc.nextLine();
        
        int viTriKetQua = dictionary.timKiem(chuoiTim);
        if(viTriKetQua != -1) {
            System.out.println("Nghia tieng viet cua " + dictionary.dsTu.get(viTriKetQua).getEn() + "la :" + dictionary.dsTu.get(viTriKetQua).getVn());
        } else {
            System.out.println("Khong ton tai tu do");
            System.out.println("Them tu vao tu dien");
            Word temp = new Word();
            temp.nhap();
            dictionary.dsTu.add(temp);
            System.out.println("Them vao ArrayList thanh cong");
            
        }
    }
    
}


