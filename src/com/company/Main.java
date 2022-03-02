package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Add(1,3));
        System.out.println(Add(1.8,3.8));
        System.out.println(Add("gee","thika"));
    }
    public static int Add(int a, int b){
        return (a+b);
    }
    public static double Add(double a, double b){
        return (a+b);
    }
    public static String Add(String a, String b){
        return (a+b);
    }
}
