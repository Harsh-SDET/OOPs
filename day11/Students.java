package day11;

public class Students {
    int sid;
    String sname;
    char grade;

    void printData(){
        System.out.println(sid + "   " + sname + "      " + grade);
    }

    void setStudents(int id, String name, char a){
        sid = id;
        sname = name;
        grade = a;
    }
    //This is a constructor similar to a method but only use to initialize the method 
    Students(int id , String name, char a) {
        sid = id;
        sname = name;
        grade = a;

    }

    Students(){
        
    }


}
