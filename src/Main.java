import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> arr1 = new LinkedList<>();
        LinkedList<Integer> arr2 = new LinkedList<>();

        arr1.add(2);
        arr1.add(3);
        arr1.add(6);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);

        System.out.println(Solution.addTwoNumbers(arr1, arr2));


    }
}

class Solution {
    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        for(int i = 0; i < l1.size(); i++) {
            l1.set(i, l1.get(i) + l2.get(i));
            l1.set(i, Character.getNumericValue(String.valueOf(l1.get(i)).charAt(String.valueOf(l1.get(i)).length()-1)));
        }

        return l1;
    }
}

/*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.
 */ //