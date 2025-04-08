package ex_24_OOPs_Super;

public class Lab165_Super {
    public static void main(String[] args) {

    }
}
class GOD{
    void sound(){
        System.out.println("God!");
    }
}
class Animal {
    protected String color = "white";

    void sound() {
        System.out.println("Animal Sound!");

    }

    class Dog extends Animal {
        private String color = "Black";


        Dog() {
            //super();
        }

        void display() {
            System.out.println(this.color);
            System.out.println(super.color);
            super.sound();
        }
    }
}