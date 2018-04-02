package Lesson2;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Strings {
    public static void eachNth() {
        Scanner num = new Scanner(System.in);
        System.out.println("Please, put any integer number: ");
        int n = num.nextInt();
        Scanner line = new Scanner(System.in);
        System.out.println("Please, put any string: ");
        String ln = line.nextLine();
        int lth = ln.length();
        char[] strToArray = ln.toCharArray();
        for (int i = 0; i < lth; i =  i + n){
            char result = strToArray[i];
            System.out.print(result);
        }
    }

    public static void main(String[] args) {
        eachNth();
    }
}
