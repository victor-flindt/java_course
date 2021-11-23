public class CaesarCipher{

    public static void main(String[] args){
        System.out.println(CaesarCipher.encode("INTRODUCTIONTOPROGRAMMING", 0));
		System.out.println(CaesarCipher.encode("INTRODUCTIONTOPROGRAMMING", 2));
		String code = CaesarCipher.encode("INTRODUCTIONTOPROGRAMMING", 2);
		System.out.println(CaesarCipher.decode(code, 2));
		System.out.println(CaesarCipher.encode("INTRODUCTIONTOPROGRAMMING", 25));
		System.out.println(CaesarCipher.encode("INTRODUCTIONTOPROGRAMMING", 7));
		System.out.println(CaesarCipher.encode("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 2));
		System.out.println(CaesarCipher.encode("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 6));
		code = CaesarCipher.encode("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 17);
		System.out.println(CaesarCipher.decode(code, 17));
		System.out.println(CaesarCipher.encode("ADw", 3));
		System.out.println(CaesarCipher.encode("aDB", 3));
		System.out.println(CaesarCipher.encode("0123", 3));
		System.out.println(CaesarCipher.encode("A%F", 3));
		System.out.println(CaesarCipher.decode("ADw", 3));
		System.out.println(CaesarCipher.decode("aDB", 3));
		System.out.println(CaesarCipher.decode("0123", 3));
		System.out.println(CaesarCipher.decode("A%F", 3));
		System.out.println(CaesarCipher.encode("A", 25));
		System.out.println(CaesarCipher.encode("A", 26));
		System.out.println(CaesarCipher.encode("Z", 1));
		System.out.println("-" + CaesarCipher.encode("", 1)+"-");
		System.out.println("-" + CaesarCipher.decode("", 1)+"-");

    }

public static String encode(String text,int shift){
    String return_string="";
    Boolean break_b=false;
    char [] char_array= new char[text.length()];
    for (int i = 0; i < text.length(); i++) {
        char_array[i] = text.charAt(i);
        int ascii_interval= char_array[i];
        if (((65<=ascii_interval & ascii_interval<=90)&(0 <= shift & shift <= 25))!=true){
            break_b=true;
            break;
        }
    }
if(break_b==true){
    System.out.print("**ERROR**");
}else{
    for (int i = 0; i < char_array.length; i++) {
        int ascii_value=0;
        if (char_array[i]+shift > 90){
            ascii_value = (char_array[i]+shift)-26; 
        }else{
            ascii_value = char_array[i]+shift;
        }
        char ConvertedChar = (char)ascii_value;
        return_string = return_string+ConvertedChar;
    }
    }
    return return_string;
}
public static String decode(String text,int shift){
    String return_string = "";
    Boolean break_b=false;
    char [] char_array= new char[text.length()];
    for (int i = 0; i < text.length(); i++) {
        char_array[i] = text.charAt(i);
        int ascii_interval= char_array[i];
        if (((65<=ascii_interval & ascii_interval<=90)&(0 < shift & shift <= 25))!=true){
            break_b=true;
            break;
        }
    }
if(break_b==true){
    System.out.print("**ERROR**");
}else{
    for (int i = 0; i < char_array.length; i++) {
        int ascii_value = 0;
        if((char_array[i]-shift)<65){
            ascii_value = (char_array[i]-shift)+26; 
        }else{
            ascii_value=char_array[i]-shift;
        }
        char ConvertedChar = (char)ascii_value;
        return_string = return_string + ConvertedChar;
    }
    }
    return return_string;
}
}

