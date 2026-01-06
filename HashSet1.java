import java.util.*;

class HashSet1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 1};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println(set);
    }
}

