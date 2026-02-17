public class StringsSplitJoinDemo {
    public static void main(String[] args) {
        String phrase = "Learning Java is exciting";
        // split the phrase into words
        String[] words = phrase.split("");
        System.out.println("Words after split: ");
        for (String w: words){
            System.out.println(w);
        }
        // join the words using a custom separator
        String newPhrase = String.join("_", words);
        System.out.println("Joined with underscores: " + newPhrase);
    }
}
