package ex_32_Collection_framework.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab225_SET_P1 {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Nishant");
        hs.add("Nishant");
        hs.add("Bokade");
        System.out.println(hs);

    }

}
