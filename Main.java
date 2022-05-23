import java.util.Scanner;

class ShortWords{
    public ShortWords(String a) {
        String result;
        String[] words = a.split(" ");
        int max = 100000;
        for (String word : words) {
            int min = word.length();
            if (min< max){
                max = min;
            }
        }
        for (String array : words){
            if(array.length() == max){
                result = array;
                System.out.println(array);
                break;
            }
        }
    }
}
public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    String a = in.nextLine();
    ShortWords ds = new ShortWords(a);

    }
}
