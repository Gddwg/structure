package demo2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        LinkList<String> list = new LinkList<>();
        Scanner sc = new Scanner(System.in);
        // 输入空结束
        while (true){
            String data = sc.nextLine();
            if(data == ""){
                break;
            }
            list.add(data);
        }
        list.show();
        System.out.println(list.exits(sc.nextLine()));
    }
}
