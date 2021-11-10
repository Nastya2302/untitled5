package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        double y;
        System.out.print("Результати циклу: ");
        for (double x=-1;x<=1;x+=0.1) {
            if(x==0)
                System.out.println("Ділити на 0 не можна!");
            y = Math.pow(x, (1/x));
            System.out.print(y+"\n");
        }

    }
}
