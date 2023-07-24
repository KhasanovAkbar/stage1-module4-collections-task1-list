package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {

        if (sourceList.size() > 1) {
            LinkedList<Integer> result = new LinkedList<>();
            result.add(sourceList.get(0));
            for (int i = 1; i < sourceList.size(); i++) {
                if (sourceList.get(i) % 2 == 0)
                    result.addLast(sourceList.get(i));
                else result.addFirst(sourceList.get(i));
            }
            return result;
        } else {
            return new LinkedList<>();
        }
    }
}
