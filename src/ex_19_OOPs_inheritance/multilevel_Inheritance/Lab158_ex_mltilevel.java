package ex_19_OOPs_inheritance.multilevel_Inheritance;

public class Lab158_ex_mltilevel {
    public static void main(String[] args) {
  //      Son s1 = new Grandfather();
//        Son s1 = new Father();
        Son amit = new Son();
        amit.s();
        amit.f();
        amit.gf();
        System.out.println(amit.gold_gf);

        Father f1 = new Father();
        f1.home();

        Grandfather gf1 = new Grandfather();
        gf1.home();


        Grandfather grandFather = new Son();
        grandFather.home();


    }
}
