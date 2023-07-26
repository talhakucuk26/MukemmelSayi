package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        System.out.print("Bir sayı giriniz: ");

        int num = input.nextInt();

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            System.out.println(num + " Mükemmel sayı.");
        } else {
            System.out.println(num + " Mükemmel sayı değil.");
        }
    }
}