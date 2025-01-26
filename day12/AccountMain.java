package day12;

public class AccountMain {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.setAccNo(53049);
        System.out.println("Accout Nuber : " + acc.getAccNo());


        acc.setAmount(352535);
        System.out.println("Amount : " + acc.getAmount());

        acc.setName("Harsh Pandey");
        System.out.println("Name : " + acc.getName());

        
    }
}
