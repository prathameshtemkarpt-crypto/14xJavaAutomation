package ex_01_Java_Basics;

public class Lab009_Assignment_Operator {
    public static void main(String[] args) {
        int a = 20;
        int b = 3;
        float c = 3.0f;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a/c);
        System.out.println("a+b");
        System.out.println(b-a);
        System.out.println(b/a);  //Result of 'b/a' is always '0'
    }
}
