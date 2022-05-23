public class Main {

    public static void main(String[] args) {
        String str = "Java jav javas";
        String[] words = str.split(" ");
        System.out.println("Самое длинное слово: " + minLength(words));
        if (str.isEmpty()){
            System.out.println("Пустая строка");
        }
    }
    private static String minLength(String[] s) {
        int len = 0;
        String shortest = "";
        for (String string : s) {
            if (string.length() < len) {
                len = string.length();
                shortest = string;
            }
        }
        return shortest;
    }
}
