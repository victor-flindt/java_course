public class Triag{

    public static void main(String[] args){


    }

    public static int computeIndex(int number){
        int k = 0;
        for (int i = 0; i < number; i++)
        {
            if((i*(i+1)/2)>=number)
            {
                break;
            }
            k++;
        }
        return k;
    }
}
