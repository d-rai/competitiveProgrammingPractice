package basic;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "Hi my name is Durgesh and I am from Bihar";
        reverseWordOfString(str);

    }

    private static void reverseWordOfString(String str) {
        String[] split = str.split(" ");

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = split.length-1; i >= 0; i--) {
            stringBuilder.append(split[i]+" ");
        }

        stringBuilder.toString().trim();
        System.out.print(stringBuilder);

    }
}
