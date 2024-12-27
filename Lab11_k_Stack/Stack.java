/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab11_k_Stack;

/**
 *
 * @author hoanganh
 */
public class Stack {
    private Object[] data;
    private int topIndex;
    private int sizeStack;
    public Stack(int size){
        if (size <= 0) {
            throw new IllegalArgumentException("Can nhap so lon hon 0");
        }
        this.data = new Object[size];
        topIndex = -1;
    }
    
    public boolean emty(){
        return topIndex == -1;
    }
    
    public boolean full(){
        return topIndex == (sizeStack - 1);
    }
    
    public void put(Object data){
        if(data == null){
            throw new IllegalArgumentException("Khong duoc cho phan tu null vao Stack");
        }
        
        if(full()){
            throw new IllegalStateException("Stack da day khong them duoc");
        }
        
        this.data[++topIndex] = data;
    }
    
    public Object get(int index){
        if(index < 0) throw new IllegalArgumentException("Can nhap so tu 0");
        if(index > sizeStack - 1) throw new IllegalArgumentException("Can nhap dung gia tri trong kich thuoc");
        return data[index];
    }
    
    public static void main(String[] args) {
        Stack stack1 = new Stack(5);
        stack1.put(null);
        
    }
    
    
}
