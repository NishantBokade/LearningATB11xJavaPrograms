package Tasks;

public class Vowel_constant {
    public static void main(String[] args) {
        String word = "Its raining outside bring umbrella ";
        char c[]= word.toCharArray();
        int l = word.length();
        System.out.println(word.length());
        int i;
        for(char ch:c)
        {
            if(ch=='a'||ch=='i'||ch=='I'||ch=='e'||ch=='o'||ch=='u') {
                System.out.println("vowel= "+ch);
            }
            else if(ch!='a'||ch!='i'||ch!='I'||ch!='e'||ch!='o'||ch!='u') {
                System.out.println("Consent= "+ch);
            }
        }

    }
}

