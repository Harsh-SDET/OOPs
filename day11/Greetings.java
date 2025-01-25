package day11;

public class Greetings {
    // No parametres and no return type method
    void m1() {
        System.out.println("Hello from no prametres and no return type method");
    }

    //No return type but string parametres
    void m2(String name) {
        System.out.println("Hello " + name + " from no return type method");
    }

    // No parametres but string return type method
    String m3() {
        return "Hello from no parameters and return type method";
    }
    // String return type and 
    String m4(String name) {
        return "Hello " + name + " from return type method";
    }
}
