package day12;

public class Adder {
    int a, b, c;

    Adder (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //Overloading can achive with different parametres
    void add(int a, int b, int c){
        int ans = a+b+c;
        System.out.println("Sum of the numbers are : " + ans);
    }

    void add(int a, int b){
        int ans = a+b;
        System.out.println("Sum of the numbers are : "+ans);
    }

    void add (){
        System.out.println("No numbers to add");
    }

    
}
