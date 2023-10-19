package demo3;

import java.util.Scanner;

public class Hanoi {
    public static void main(String[] args) throws Exception {
        System.out.println("输入大小");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SqStack<Integer> x = new SqStack<>(n);
        SqStack<Integer> y = new SqStack<>(n);
        SqStack<Integer> z = new SqStack<>(n);
        for (int i = n; i > 0; i--) {
            x.push(i);
        }
        /*move(x,y);*/
        hanoi(x,y,z,n);
        System.out.print("x = ");
        x.display();
        System.out.print("y = ");
        y.display();
        System.out.print("z = ");
        z.display();
    }

    public static void move(SqStack<Integer> o1,SqStack<Integer> o2) throws Exception {
        if((o1.getTop() != null && o2.getTop() == null) || (o1.getTop() != null && o1.getTop() < o2.getTop())){
            Integer pop = o1.pop();
            o2.push(pop);
        }else {
            throw new Exception("无法移动");
        }
    }

    public static void hanoi(SqStack<Integer> x,SqStack<Integer> y,SqStack<Integer> z,int n) throws Exception {
        if(n == 1){
            move(x,z);
            return;
        }
        hanoi(x,z,y,n - 1);
        hanoi(x,y,z,1);
        hanoi(y,x,z,n - 1);
    }
}
