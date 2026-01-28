package Patterns;
import java.util.*;
//*
//* *
//* * *
//* * * *
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(); //4
        int c = sc.nextInt(); //4
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
