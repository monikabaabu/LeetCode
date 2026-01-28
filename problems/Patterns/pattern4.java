package Patterns;
import java.util.*;
//1
//2 2
//3 3 3
//4 4 4 4
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(); //4
        int c = sc.nextInt(); //4
        for (int i = 1; i <=r ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
