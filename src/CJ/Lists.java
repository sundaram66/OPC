package CJ;


import java.util.*;

class CustomList {

    int i;

    CustomList(int val) {
        this.i = val;
    }
}

class CustomListComparator implements Comparator<CustomList> {


    @Override
    public int compare(CustomList o1, CustomList o2) {
        return o2.i - o1.i;
    }
}

public class Lists {

    public static void main(String[] args) {

        Object[] a = new String[10];
        a[0] = "str";
        a[1] = 1;


        List<CustomList> list = new ArrayList<>();

        for(int i=1;i<10;i++)
            list.add(new CustomList(i));
        Collections.sort(list,new CustomListComparator());
        for(CustomList c : list)
            System.out.println(c.i + " ");
    }
}
