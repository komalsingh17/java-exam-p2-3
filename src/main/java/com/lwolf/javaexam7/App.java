package com.lwolf.javaexam7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 4, 6));
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(2, 3, 5));
        List<Integer> mergedList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(mergedList);
    }

    public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {

        //index = the index of the list2 element being compared
        //startIndex = the starting index of list1 when comparing an element form list2
        int index = 0, startIndex = 0, element = 0;
        while (index < list2.size()) {
            element = list2.get(index);
            for (int i = startIndex; i < list1.size(); i++) {
                if (list1.get(i) > element) {
                    list1.add(i, element);
                    startIndex = i + 1;
                    break;
                }
            }
            index++;
        }
        if (element > list1.get(list1.size() - 1)) list1.add(element);
        return list1;
    }

}
