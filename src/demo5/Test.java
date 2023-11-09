package demo5;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree<String> test = new BinaryTree<>();
        String str = "84315sdvbdouinsahyf8";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.print(c + " ");
            test.put(String.valueOf(c));
        }
        System.out.println();
        System.out.println("输入节点值");
        test.display(scanner.next());

    }
}
