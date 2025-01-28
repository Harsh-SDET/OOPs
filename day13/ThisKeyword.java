public class ThisKeyword {
    int a, b;

    ThisKeyword(int a, int b){

        this.a = a;  //Using this keyword make the variable identifyable of Instance variable
        this.b = b;

    }

    public static void main(String[] args) {
        ThisKeyword k = new ThisKeyword(34, 70);

        System.out.println(k.a + k.b);

    }
}
