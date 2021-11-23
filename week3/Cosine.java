import java.lang.Math;

public class Cosine {
	public static void main(String[] args) {
        System.out.println(Cosine.cosine(1.4,2));
        System.out.print(Math.cos(1.4));
	}

    public static double cosine(double x,int k){
        double sum=0;
        for (int i = 0; i < 2*k; i++) {
            int factorial =1;
            for (int j=1; j <= i*2; j++) {
                factorial=factorial*j;
            }
            sum=sum+(Math.pow(-1,i)*Math.pow(x,2*i))/(factorial);
        }
        return sum;
    }
}