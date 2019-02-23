import java.util.Scanner;

public class checkdiff {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String firstValue = scanner.next();
        String secondValue = scanner.next();
     difference(firstValue,secondValue);
    }
    public static void difference (String text1 , String text2 ){
        if (text1.equals(text2)) {
        System.out.println(" Text lines are the same ");
        }else {
            System.out.println("text are different");
        }
    }
}

