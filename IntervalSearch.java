import java.lang.Math;
public class IntervalSearch {
	public static void main(String[] args) {

		System.out.println(IntervalSearch.intervalContains(5, 11, 3));
		//@ Test
		System.out.println(IntervalSearch.intervalContains(5, 11, 4));
		//@ Test
		System.out.println(IntervalSearch.intervalContains(17, 17, 17));
		//@ Test
		System.out.println(IntervalSearch.intervalContains(17, 17, 5));
		//@ Test
		System.out.println(IntervalSearch.intervalContains(12, 18, 12));
		//@ Test
		System.out.println(IntervalSearch.intervalContains(18, 12, 12));
		//@ Test
		System.out.println(IntervalSearch.intervalContains(18, 24, 12));
		//@ Test
		System.out.println(IntervalSearch.intervalContains(18, 144, 12));
		//@ Test
		System.out.println(IntervalSearch.intervalContains(18, 14403434, 12));
		//@ Test
		System.out.println(IntervalSearch.intervalContains(5, 11, 1));
		//@ Test
		System.out.println(IntervalSearch.intervalContains(1, 5, 1));
		//@ End
		
	}
    public static boolean intervalContains (int g1 , int g2 , int power){
        int higher = 0;
        int lower = 0;
        
        if(g1>=g2){
            higher = g1;
            lower = g2;

        }else{
            higher = g2;
            lower = g1;
        }
        Boolean result = false;
        for (int i = 0; i < higher; i++) {
            if(((lower<=Math.pow(power,i))&&(Math.pow(power,i)<=higher))==true){
                result=true;
                break;
            }

        }
        return result;
    }
}