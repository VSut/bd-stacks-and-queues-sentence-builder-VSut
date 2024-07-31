import java.util.Stack;

public class SentenceBuilder {
    Stack<String> words;
    /**
     * Constructor.
     */
    public SentenceBuilder() {

    }

    /**
     * Adds a word to the sentence.
     * @param word to be added to the sentence.
     */
    public void addWord(String word) {
        if(words == null) {
            words = new Stack<>();
        }
        words.push(word);
    }

    /**
     * Undoes the last word added, and returns it.
     * @return The word most recently added to the sentence, if any; null, otherwise.
     */
    public String undo() {
        if (words == null || words.isEmpty()) {
            return null;
        }
        return words.pop();
    }

    /**
     * Display all the current words in our sentence.
     * @return string representation of the words currently in the sentence.
     */
    public String getSentenceWords() {
        if(words == null || words.isEmpty()) {
            return "[]";
        }

        return words.toString();
    }
}
