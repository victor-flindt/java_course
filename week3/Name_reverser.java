import java.util.Scanner;
public class Name_reverser{

public static void main(String[] args ){

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Please enter your full name:");
    String name = myObj.nextLine();  // Read user input
    Name_reverser.name_reverser(name);

}

public static void name_reverser(String name){
    char[] ch_array = new char[name.length()];
    System.out.print("Your name in reverse order is ");
    for (int i = 0; i < name.length(); i++) {
        ch_array[i] = name.charAt(i);
    }
    boolean a = false;
    for (int i = 0; i < name.length(); i++) {
        if (ch_array[i] == ' ') {
            a=true;
        } 
        if (a==true&&ch_array[i]!=' '){
            System.out.print(ch_array[i]);
        }
    }
    System.out.print(", ");
    for (int i = 0; i < name.length(); i++) {
        if(ch_array[i]==' '){
            break;
        }
        System.out.print(ch_array[i]);

        
    }
}
}