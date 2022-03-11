package homework25;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> s1 = new HashSet<>(List.of(1,2,3));
        Set<Integer> s2 = new HashSet<>(List.of(0,1,2));
        System.out.println(symmetricDifference(s1, s2));
    }

    private static Set<Integer> symmetricDifference(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> difference = new HashSet<>(s1);
        difference.removeAll(s2);
        s2.removeAll(s1);
        difference.addAll(s2);

        return difference;
    }
}
