package ugeseddel10.opg4;
import java.util.ArrayList;

public class ArrayListX {

	public static void main(String[] args) {

	}

	public static void append(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		for (int i = 0; i < list2.size(); i++) {
			list1.add(list2.get(i));
		}
	}

	public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if (list1.size()>list2.size())
		{
			int longest = list1.size();
			int shortest = list2.size();

			for (int i = 0; i < shortest; i++) {
				res.add(list1.get(i));
				res.add(list2.get(i));
			}

			for (int i = (longest-(longest-shortest)); i < longest; i++) {
				res.add(list1.get(i));
			}

		}
		else
		{
			int longest = list2.size();
			int shortest = list1.size();

			for (int i = 0; i < shortest; i++) {
				res.add(list1.get(i));
				res.add(list2.get(i));
			}

			for (int i = (longest-(longest-shortest)); i < longest; i++) {
				res.add(list2.get(i));
			}
		}

		return res;	
	}
	
	public static void printList(ArrayList<Integer> list, String name) {
		System.out.println("------------------------\n"+name+":\n");
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}	
}
