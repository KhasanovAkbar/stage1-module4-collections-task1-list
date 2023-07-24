package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {

        if (sourceList.size() > 0) {
            ListComparator listComparator = new ListComparator();
            String min;
            int index;
            for (int i = 0; i < sourceList.size(); i++) {
                min = sourceList.get(i);
                index = i;
                for (int j = i + 1; j < sourceList.size(); j++) {
                    if (listComparator.compare(min, sourceList.get(j)) > 0) {
                        min = sourceList.get(j);
                        index = j;

                    } else if (listComparator.compare(min, sourceList.get(j)) == 0) {
                        if (Integer.parseInt(sourceList.get(i)) > Integer.parseInt(sourceList.get(j))) {
                            min = sourceList.get(j);
                            index = j;
                        }
                    }
                }
                sourceList.set(index, sourceList.get(i));
                sourceList.set(i, min);
            }
        }

    }
}

class ListComparator implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        return Integer.compare(5 * a1 * a1 + 3, 5 * b1 * b1 + 3);
    }
}
