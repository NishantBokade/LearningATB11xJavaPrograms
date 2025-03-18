package ex_07_increment_decrement;

public class Lab052_post_increment {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a);
        System.out.println(a);

        //post increment- print 1st and then increase
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);

    }
}
