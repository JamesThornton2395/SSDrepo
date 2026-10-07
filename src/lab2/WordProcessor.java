public class WordProcessor implements Counter {

    /*The following allows use of user text input */
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    /* Counts the number of words in the given input */
    @Override
    public int countWords(String sentence) {
        if (sentence == null) {
            sentence = getText();
        }
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        String[] splited = sentence.split(" ");
        return splited.length;
    }

    /* Counts the number of letters in the given input */
    @Override
    public int countLetters(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        int i=0;
        int letters = 0;
        while (i < sentence.length()) {
            if ( Character.isLetter(sentence.charAt(i)) )
                letters++;
            i++;
        }
        return letters;
    }

    /* Returns the length of the given input */
    @Override
    public int getLength(String sentence) {
        if (sentence == null) {
            sentence = getText();
        }
        return sentence.length();
    }
}
