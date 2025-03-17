package ex_05_typeCasting;

public class Lab042_typecasting_use
{
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        //int total = course+GST; //Narrow-imlicit - not allowed
        int total1 = course +(int)GST; //explicit
        System.out.println(total1);

        float total2 = course+GST;//widening-implicit
        float total3 = course+(float)GST; //widening-explicit
        System.out.println(total2);
        System.out.println(total3);



    }
}
