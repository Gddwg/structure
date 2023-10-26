package demo5;

import java.util.Random;

/**
 * @author Administrator
 */
public class Test {
    public static void main(String[] args) {
        BinaryTree<Character> test = new BinaryTree<>();
        Random random = new Random();
        String str = "13d5sahyf8";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.print(c + " ");
            test.put(c);
        }
        System.out.println();
        test.display();
    }
}
