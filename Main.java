import java.util.Scanner;

class Short{
    public Short(String c) {
        String[] words = c.split(" ");
        int max = 99;
        for (String word:words) {
            int min = word.length();
            if (min< max){
                max = min;
            }
        }
        for (String array : words){
            if(array.length() == max){
                System.out.println("Самое короткое слово буит: " + array);
                break;
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите строчку пжалста");
        String a = in.nextLine();
        Short ds = new Short(a);
    }
}
