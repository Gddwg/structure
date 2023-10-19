package demo1;

import java.util.Scanner;

public class studentSystem {
    public static void main(String[] args) {
        SqList<Student> list = new SqList<>(12);
        Scanner sc = new Scanner(System.in);
        loop : while(true){
            System.out.println("------欢迎来到学生管理系统------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择");
            String choose = sc.next();
            switch (choose){
                case "1" -> {
                    addStudent(list);
                }case "2" -> {
                    delStudent(list);
                }case "3" -> {
                    updateStudent(list);
                }case "4" -> {
                    queryStudent(list);
                }case ("5")-> {
                    System.out.println("退出");
                    break loop;
                }default -> {
                    System.out.println("没有这个选项");
                }
            }

        }

    }
    public static void addStudent(SqList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生id");
        String id = sc.next();
        while(true){
            if(contain(list,id) != null){
                System.out.println("id已存在,请重新输入");
                id = sc.next();
            }else{
                break;
            }
        }
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生性别");
        String gender = sc.next();
        System.out.println("请输入学生英语成绩");
        int english = sc.nextInt();
        System.out.println("请输入学生数学成绩");
        int math = sc.nextInt();
        Student s = new Student(id,name,gender,english,math);
        list.add(s);
        System.out.println("学生信息添加成功");
    }
    public static void delStudent(SqList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除的id");
        String id = sc.next();
        int i = getIndex(list,id);
        if(i != -1){
            list.remove(i);
            System.out.println("删除成功");
            return;
            }
        System.out.println("id不存在");
    }
    public static void updateStudent(SqList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的id");
        String id = sc.next();
        int i = getIndex(list,id);
        if(i != -1){
            System.out.println("请输入修改后的英语成绩");
            int english = sc.nextInt();
            System.out.println("请输入修改后的数学成绩");
            int math = sc.nextInt();
            list.get(i).setEnglish(english);
            list.get(i).setMath(math);
            System.out.println("修改成功");
            return;
        }
        System.out.println("id不存在");
    }
    public static void queryStudent(SqList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入查询方法 1.学号查询 2.查询全部");
        if(sc.nextInt() == 1){
            queryStudentById(list);
            return;
        }
        System.out.println("查询学生");
        if(list.size() == 0){
            System.out.println("当前无学生信息,请先添加学生信息");
            return;
        }
        System.out.println("id\t\t姓名\t\t性别\t\t英语\t\t数学");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu);
        }
    }

    private static void queryStudentById(SqList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号");
        String id = sc.next();
        Student student = contain(list, id);
        if(student != null){
            System.out.println("id\t\t姓名\t\t性别\t\t英语\t\t数学");
            System.out.println(student);
            return;
        }
        System.out.println("无此学生");
    }

    public static Student contain(SqList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i).getId();
            if (id.equals(s)) {
                return list.get(i);
            }
        }
        return null;
    }
    public static int getIndex(SqList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i).getId();
            if (id.equals(s)) {
                return i;
            }
        }
        return -1;
    }
}

