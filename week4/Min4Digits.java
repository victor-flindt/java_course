import java.lang.*;

public class Min4Digits {
public static void main(String[] args) {
    System.out.println(Min4Digits.min4Digits(-1));
}
public static String min4Digits(int digit){
    Boolean negative_flag=false;
    if(digit < 0){
        negative_flag = true;
    }

    String string ="";
    string = (Integer.toString(Math.abs(digit)));
    while(string.length()<4){
        string="0"+string;
    }
    if(negative_flag==true){
        string="-"+string;
    }
    return string;
}

}