public class Staticblock {
    
    static int n ;
    static {
        n = 10;

        System.out.println("This is static block that will execute 1st time at a run time of class"+n);
    }

    public static void main(String[] args) {
        System.out.println("n : "+n);
    }
}
