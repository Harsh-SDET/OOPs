package day14;

class Parent{
    void display(int a){
        System.out.println(a);
    }
}

class Child1 extends Parent{
    void print(int b){
        System.out.println(b);
    }
}

class Child2 extends Parent{

    void show(int c ){
        System.out.println(c);
    }
}
public class HirarcheyInheritance {
    public static void main(String[] args) {
        Child1 ch1 = new Child1();

        ch1.display(8);
        ch1.print(89);

        Child2 ch2 = new Child2();
        ch2.display(79);
        ch2.show(34);
        
    }
}
