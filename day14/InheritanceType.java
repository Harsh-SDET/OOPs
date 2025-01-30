package day14;

class A{
    int a = 100;
    void m1(){
        System.out.println(a);
    }
}

class B extends A{
    int b = 299;
    void display(){
        System.out.println(b);
    }

    
}

class C extends B{
    int c = 209;
    void print(){
        System.out.println(c);
    }
}
public class InheritanceType {
    public static void main(String[] args) {
        B bobj = new B();
        bobj.m1();
        bobj.display();

        C cobj = new C();
        cobj.a = 100;
        cobj.b = 123;
        cobj.c = 3242;

        cobj.display();
        cobj.m1();
        cobj.print();

    }
}
