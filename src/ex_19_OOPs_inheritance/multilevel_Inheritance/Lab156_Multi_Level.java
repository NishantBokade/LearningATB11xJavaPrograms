package ex_19_OOPs_inheritance.multilevel_Inheritance;

public class Lab156_Multi_Level {
    public static void main(String[] args) {
        Grandfather gf = new Grandfather();
        gf.gf();

        System.out.println(" -- ");

        Father f1 = new Father();
        f1.f();
        f1.gf();

        System.out.println(" -- ");



        Son s1 = new Son();
        s1.gf();
        s1.f();
        s1.s();


    }
}
