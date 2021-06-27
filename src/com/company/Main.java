package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// アルゴリズムの教本を読みながら実践中
        Scanner scan = new Scanner(System.in);
        System.out.println("4つの整数の最大値を求めます");
        System.out.println("aの値"); int a = scan.nextInt();
        System.out.println("bの値"); int b = scan.nextInt();
        System.out.println("cの値"); int c = scan.nextInt();
        System.out.println("dの値"); int d = scan.nextInt();

        int max = a;
        if ( b > max) max = b;
        if ( c > max) max = c;
        if ( d > max) max = d;
        System.out.println("最大値は" + max + "です。");
    }
}
