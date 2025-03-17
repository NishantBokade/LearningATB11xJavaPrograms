package ex_06_ternaryOperator;

public class Lab045_NestedTernary {
    public static void main(String[] args) {
        //Nested ternary
        //```
        //result = condition1 ? expression1 : expression2;
        //expression - (condition2 ? expression2 : expression3)
        int number = 25;
        String result = number > 10 ? (number > 20 ? "N>20" : "N<20") : "B";
        System.out.println(result);
    }
}
