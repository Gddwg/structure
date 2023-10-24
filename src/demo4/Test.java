package demo4;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<Course> courses = new PriorityQueue<>((o1, o2) -> {
            if(o1.lever != o2.lever){
                return o1.lever - o2.lever;
            }
            return o1.id - o2.id;
        });
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            Course course = new Course();
            System.out.println("请输入进程号");
            course.setId(sc.nextInt());
            System.out.println("请输入进程优先级");
            course.setLever(sc.nextInt());
            courses.add(course);
        }
        while(!courses.isEmpty()){
            System.out.println(courses.poll());
        }
    }
}
