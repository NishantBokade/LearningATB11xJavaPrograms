package ex_17_OOPS;

import org.w3c.dom.ls.LSOutput;

public class Lab146_Cats {
    public static void main(String[] args) {
        cat c1 = new cat();
        cat c2;
        new cat();

        c1.running();
//        c2.running();

        new cat().running();
        System.out.println(new cat().name);

    }

}
class cat{
    String name;
    void running(){
        System.out.println("Running");
    }

}