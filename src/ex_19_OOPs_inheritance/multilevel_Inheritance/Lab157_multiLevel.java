package ex_19_OOPs_inheritance.multilevel_Inheritance;

public class Lab157_multiLevel {
    public static void main(String[] args) {
        //        Son s1 = new GrandFather();
//        Son s1 = new Father();
        Son amit = new Son();

        Grandfather g1 = new Son(); // Dynamic Dispatch
        g1.gf();
        g1.home();



        Grandfather g2 = new Father();
        g2.home();


        Father f2 = new Son();
        f2.home();
        // Father f3 = new GrandFather();

        // WebDriver driver = new ChromeDriver();





    }
}
