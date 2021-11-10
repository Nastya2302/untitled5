package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int Sum=0, Avg=0;
        Scanner scanner = new Scanner(System.in);
        int[] ary = new int[3];
        for (int i = 0; i < 3; i++)
        {
            System.out.print("Число= ");
            ary[i]=scanner.nextInt();
            Sum+=ary[i];
        }
        Avg=Sum/3;
        System.out.println("Cереднє значення ="+Avg);
    }


    }

