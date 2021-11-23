
public class GradeConverter{

public static void main(String[] args) {
    try {
        System.out.print(GradeConverter.convert13to7(1221));
    } catch (IllegalArgumentException  e) {
        System.out.println("IllegalArgumentException");
    }
}
    public static int convert13to7(int grade){
        int ny_grade = 0;
        if ((grade == 13 || grade == 11)) {
            ny_grade = 12;
        }else if (grade == 10){
            ny_grade = 10;
        }else if (grade == 9 || grade == 8){
            ny_grade = 7;
        }else if (grade == 7){
            ny_grade = 4;
        }else if (grade == 6){
            ny_grade = 02;
        }else if ((grade == 5)||(grade == 03)){
            ny_grade = 00;
        }else if (grade == 0){
            ny_grade =-3;
        }else{
            throw new IllegalArgumentException("Number must be from old grade scala [13,11,10,9,8,7,6,5,0]");
        }
        return ny_grade;
    }
}