public class Main {

    public static void main(String[] args) {
        String str = "Java jav javas";
        String[] words = str.split(" ");
        for (String word:words){
            System.out.println(word);
        }
        if (str.isEmpty()){
            System.out.println("Пустая строка");
        }

       // for (int i = 0; i < words.length; i++){ }
    }
}