package day14;
//Why multiple inheritance is not supported in java

class A{
    void m1(){}
}

class B{
    void m1(){}
}

// class C extends A,B{
        //We can't use two classes with the keyword extends this is the reason 1.
        //If we extends the 2 class these class may have same methods this brigs with ambiguity issue.
        //If 2 class don't have the same method but there are still chances of having some some methods because Every class in java have the same root class(Object) in the method.
// }
public class MultipleInheritance {
    
}
