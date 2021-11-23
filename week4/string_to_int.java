import java.util.Scanner;
import java.math.BigDecimal;

public class string_to_int{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String string_input = in.nextLine();
        try {
            string_to_int.String_to_int(string_input);
        } catch (IllegalArgumentException  e) {
            System.out.println("no");
        }
    }

    public static void String_to_int(String string_number){
        BigDecimal number =new BigDecimal(string_number);
            System.out.println("yes");
    }
}