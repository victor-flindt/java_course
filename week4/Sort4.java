import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Sort4{

public static void main(String[] args){
    Sort4.sort4(22,11,33,12);
}
    public static void sort4(int a1, int a2, int a3, int a4){
        LinkedList<Integer> linked_list = new LinkedList<Integer>();
        linked_list.add(a1);
        linked_list.add(a2);
        linked_list.add(a3);
        linked_list.add(a4);

        Collections.sort(linked_list);
        for (Integer x : linked_list) {
            System.out.print(x+" ");
        }
        System.out.println("");

    }
}