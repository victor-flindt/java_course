import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


public class regex_thing{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String string_input = in.nextLine();

        regex_thing.regex_detection(string_input);
    }

    public static void regex_detection(String input) {
     
        Pattern pattern = Pattern.compile("java|nova", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);

        boolean matchFound = matcher.find();

        if(matchFound==true){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}