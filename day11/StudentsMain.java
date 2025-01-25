package day11;

class StudentsMain {

    public static void main(String[] args) {
        Students s1 = new Students();
        //Way to store data in Students class variables
        //Using object reference variables

        s1.sid = 101;
        s1.grade = 'A';
        s1.sname = "Harsh Pandey";

        s1.printData();


        Students s2 = new Students();

        //Using set method ---> Setter method 
        s2.setStudents(809, "Yash Pandey", 'F');

        s2.printData();

        //Using Constructor
        Students s3 = new Students(32,"Rupali",'F');
        s3.printData();
    }
}