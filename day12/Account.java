package day12;

public class Account {

    //Encapsulation concepts
    private int accNo;

    private String name;

    private double amount;

    //Setter
    void setAccNo(int x){
        accNo = x;
    }
    //Getter
    int getAccNo() {
        return accNo;
    }

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }


    void setAmount(double amount){
        this.amount=amount;

    }

    double getAmount(){
        return amount;
    }

}
