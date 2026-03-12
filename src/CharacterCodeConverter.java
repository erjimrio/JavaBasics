public class CharacterCodeConverter {
    public static void main(String[] args) {
        // char to int (widening)
        char letter = 'A';
        int code = letter;
        System.out.println("Character: " + letter);
        System.out.println("Unicode value: " + code);
        // int to char (narrowing)
        int number = 66;
        char convertedLetter = (char) number;
        System.out.println("Number: " + number);
        System.out.println("Converted character: " + convertedLetter);
        // character arithmetic
        char nextLetter = (char) (letter+1);
        System.out.println("Next character after " + letter + " is " + nextLetter);
    }
}
