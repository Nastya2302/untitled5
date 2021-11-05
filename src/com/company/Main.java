package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String s;
        String s1 = "Привет";
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        if (s.startsWith(s1))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
