import java.util.*;

class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10); // duplicate allowed

        System.out.println(list.get(1)); // 20
        System.out.println(list.size()); // 3
        System.out.println(list.contains(10)); // true

        list.remove(1); // removes element at index 1

        System.out.println(list);
    }
}

