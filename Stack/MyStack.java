/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

import java.util.ArrayList;

/**
 *
 * @author hoanganh
 */
public class MyStack implements Stack {
    private ArrayList <Object> DataStack = new ArrayList<>();
    
    @Override
    public void push(Object obj) {
        DataStack.add(obj);
    }

    @Override
    public Object pop() {
         Object temp = DataStack.getLast();
         DataStack.removeLast();
         return temp;
    }

    @Override
    public boolean check_emty() {
        return DataStack.isEmpty();
    }

    @Override
    public Object peek() {
        return DataStack.getLast();
    }
    
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("Hoang Anh");
//        stack.push(5);
//        Circle1 vongtron = new Circle1();
//        stack.push(vongtron);
        System.out.println("Phan tu dau la: " + stack.peek());
//        stack.pop();
        
        
    }
    
    
    
}
