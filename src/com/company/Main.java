package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String s;
        Scanner scanner = new Scanner(System.in);
// Читання цілого числа
        System.out.print("x=");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.print("y=");
        int y = scanner.nextInt();
        scanner.nextLine();
        System.out.print("y=");
        int z = scanner.nextInt();
        scanner.nextLine();
        if(x<1||x>10) {
            System.out.println("Помилка! Введіть число від 1 до 10");
            x = scanner.nextInt();
            scanner.nextLine();
        }
        if(y<1||y>10) {
            System.out.println("Помилка! Введіть число від 1 до 10");
            y = scanner.nextInt();
            scanner.nextLine();
        }
        if(z<1||z>10) {
            System.out.println("Помилка! Введіть число від 1 до 10");
            z = scanner.nextInt();
            scanner.nextLine();
        }
        Random random = new Random(10);
        int min=1; int max=10;
        int a = (int) ((Math.random() * (max - min)) + min);
        int b = (int) ((Math.random() * (max - min)) + min);
        int c = (int) ((Math.random() * (max - min)) + min);
        System.out.println("Згенеровані числа: "+a+", "+b+", "+c);
        int k=0;
        if(x==a)
            k+=1;
        else if(x==b)
            k+=1;
        else if(x==c)
            k+=1;
        if(y==a)
            k+=1;
        else if(y==b)
            k+=1;
        else if(y==c)
            k+=1;
        if(z==a)
            k+=1;
        else if(z==b)
            k+=1;
        else if(z==c)
            k+=1;

        if(k>=3)
            System.out.println("Вітаю з перемогою!");
        if(k==2)
            System.out.println("Ви були близькі до перемоги.Щасти наступного разу!");
        else
            System.out.println("Ви програли!");
    }
}
