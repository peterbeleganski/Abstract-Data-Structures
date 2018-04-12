import linkedlist.custom.LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // TEST Exercise 3 Recursive functions
        // System.out.println(reverseStringRecursive("123"));


        /* TEST Exercise 4 Common Values*/
        /*int[] arr1 = {4,7,3,9,2};
        int[] arr2 = {3,2,12,9,40,32,4};


        for (int number :
                findCommonValues(arr1, arr2)) {
            System.out.print(number + " ");
        }*/


        // TEST Exercise 5
       /* int[] arr = {2,3,7,1,2,2};

        findIndexOfEqualSumsArray(arr);*/


       // TEST SinglyLinkedList
      /*  Integer[] list = { 4, 3, 2, 1 };

        testLinkedList(list);*/
    }

    private static void testLinkedList(Integer[] list) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>(list);

        linkedList.printList();
        linkedList.reverseList();
        linkedList.printList();
    }

    private static void findIndexOfEqualSumsArray(int[] arr) {
        int firstSum = 0;
        int secondSum = 0;

        for(int i=1; i< arr.length;i++) {
            for (int j = 0; j < i ; j++) {
                firstSum+= arr[j];
            }
            for (int k = i+ 1; k < arr.length ; k++) {
                secondSum+= arr[k];
            }

            if(firstSum == secondSum) {
                System.out.println(i);
            }

            firstSum = 0;
            secondSum = 0;
        }
    }

    private static String reverseStringRecursive(String value) {

        if(value.length() == 0) {
            return value;
        }

        return reverseStringRecursive(value.substring(1)) + value.charAt(0);
    }


    private static int[] findCommonValues(int[] a, int[] b) {
        List<Integer> results = new ArrayList<>();


        int[] ab = {1,2,3,4};
        // boolean contains = IntStream.of(a).anyMatch(x -> x == 4);

        for(int i=0; i<a.length;i++) {
            final int check = i;
            boolean contains = IntStream.of(b).anyMatch(x -> x == a[check]);

            if(contains) {
                results.add(a[check]);
            }

        }
        int[] resultArr = new int[results.size()];
        for(int i=0;i < results.size();i++) {
                resultArr[i] = results.get(i);
        }

        return  resultArr;
    }

    private static void removeDuplicates(int[] sortedArr) {

        int current = sortedArr[0];
        boolean found = false;

        for (int i = 0; i < sortedArr.length; i++) {
            if (current == sortedArr[i] && !found) {
                found = true;
            } else if (current != sortedArr[i]) {
                System.out.print(" " + current);
                current = sortedArr[i];
                found = false;
            }
        }
        System.out.print(" " + current);
    }
}
