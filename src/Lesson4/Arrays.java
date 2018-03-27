package Lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arrays {

    public static void main(String[] args) {
        ArrayList<Integer> figures = new ArrayList<Integer>();
        figures.add(2);
        figures.add(0);
        figures.add(1);
        figures.add(3);
        figures.add(4);
        figures.add(5);

        System.out.println(figures);

        figures.remove(3);

        if (!figures.contains(3)){
            System.out.println(figures);
        }

        ArrayList<Integer> figures1 = new ArrayList<Integer>(figures);
        Collections.sort(figures);

        Iterator iterator = figures.iterator();
        Iterator iterator1 = figures1.iterator();
        while (iterator.hasNext()&& iterator1.hasNext()){
            System.out.println(iterator.next() + " " + (iterator1.next()));
        }

    }

}
