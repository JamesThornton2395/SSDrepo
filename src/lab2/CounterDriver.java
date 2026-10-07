import java.util.Scanner;

public class CounterDriver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /* allows inputs */

        /* testing the WordProcessor class */
        WordProcessor processor = new WordProcessor();
        String sentence = "Hello, World!";
        System.out.println("Words: " + processor.countWords(sentence));
        System.out.println("Letters: " + processor.countLetters(sentence));
        System.out.println("Length: " + processor.getLength(sentence));

        /*
        Counter processor1 = new WordProcessor();
        String sentence1 = "Hello, World!";
        System.out.println("Words: " + processor1.countWords(sentence1));
        System.out.println("Letters: " + processor1.countLetters(sentence1));
        System.out.println("Length: " + processor1.getLength(sentence1));

        Changing WordProcessor to Counter works in this case because WordProcessor implements the counter
        interface, and uses its methods.
        */

        /* testing the WordProcessor class with user input */
        WordProcessor processor2 = new WordProcessor();
        System.out.println("Enter a sentence:");
        String sentence2 = scanner.nextLine();
        processor2.setText(sentence2);
        System.out.println("Words: " + processor2.countWords(sentence2));
        System.out.println("Letters: " + processor2.countLetters(sentence2));
        System.out.println("Length: " + processor2.getLength(sentence2));

    }
}
