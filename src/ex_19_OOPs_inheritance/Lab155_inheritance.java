package ex_19_OOPs_inheritance;

public class Lab155_inheritance {
    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();

        Son s1 = new Son();
        s1.bhk3();
        System.out.println(f1.gold_f);
        s1.bhk2();
    }
}
class Father{
    int gold_f = 1000; // Attribute | Data variables |  Property | Instance Variables

    void bhk2() { //  Behaviour |  Method | Function | Data members
        System.out.println("Father - 2BHK");
    }
}
class Son extends Father{
    void bhk3() {
        System.out.println("3bhk son");
    }
}