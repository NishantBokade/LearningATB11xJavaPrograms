package ex_23_OOPS_Abstraction;

public class Lab166_abstraction {
    public static void main(String[] args) {
        Child c = new Child();
        c.loan50K();
        c.loan25k();
        //Father f1 = new Father():
        Father f2 = new Child();

    }


}

abstract class Father{

    abstract void loan50K();

    void loan25k(){
        System.out.println("Given 25K");
    }

}

class Child extends Father{

    @Override
    void loan50K() {
        System.out.println("Child will pay the loan!");
    }

    }


