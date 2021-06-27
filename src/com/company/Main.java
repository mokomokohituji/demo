package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// アルゴリズムの教本を読みながら実践中

        //コンソールにキーボードで入力した数値を受け取る
        Scanner scan = new Scanner(System.in);
        System.out.println("4つの整数の最大値を求めます");
        System.out.println("aの値"); int a = scan.nextInt();
        System.out.println("bの値"); int b = scan.nextInt();
        System.out.println("cの値"); int c = scan.nextInt();
        System.out.println("dの値"); int d = scan.nextInt();

        scan(a,b,c,d);
    }
    //もとのソースから分割をしてみる
    public static void scan(int a,int b, int c,int d){
        int max = a;
        if ( b > max) max = b;
        if ( c > max) max = c;
        if ( d > max) max = d;
        System.out.println("最大値は" + max + "です。");
    }

}
