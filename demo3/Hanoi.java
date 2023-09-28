package demo3;

import java.util.Scanner;

public class Hanoi {
    public static void main(String[] args) {
        System.out.println("输入大小");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SqStack<Integer> x = new SqStack<>(n);
        SqStack<Integer> y = new SqStack<>(n);
        SqStack<Integer> z = new SqStack<>(n);
        for (int i = n; i > 0; i--) {
            x.push(i);
        }
        x.display();
    }

    public static void move(SqStack<Integer> o1,SqStack<Integer> o2) throws Exception {
        if(o1.getTop() > o2.getTop()){
            throw new Exception("无法移动");
        }
        Integer pop = o1.pop();
        o2.push(pop);
    }
}
