package basic;

public class FindCharType {
//    Write code to find special character, number, capital and small
//    letter in a given string.

    public static void main(String[] args) {
        String str = "Durgesh's laptop.";
        findCharType(str);
    }

    private static void findCharType(String str) {
        for(char ch: str.toCharArray()){
            if(Character.isDigit(ch)){
                System.out.println(ch+" is a digit.");
            }
            if(Character.isUpperCase(ch)){
                System.out.println(ch+" is a upper case char.");
            }
            if(Character.isLowerCase(ch)){
                System.out.println(ch+" is a lower case char.");
            }
            if(!Character.isDigit(ch) && !Character.isLetter(ch) && !Character.isWhitespace(ch) ){
                System.out.println(ch+" is a special char.");
            }
        }
    }
}
