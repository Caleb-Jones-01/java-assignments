package Question4;

public class StaticAndNonStatic {
    // this program merges 2 sentences

    // This is a non static method
    void mergeSentence(String sentence_one, String sentence_two) {
        System.out.println(sentence_one + sentence_two);
    }

    // This is a static method
    static String getSecondSentence() {
        String Sentence2 = " code run?.";
        return Sentence2;
    }

    // main method
    public static void main(String[] args) {

        String sentence_one, sentence_two;
        // calling a static method
        sentence_one = "Did the";
        sentence_two = getSecondSentence();

        // using non-static method
        StaticAndNonStatic myClass = new StaticAndNonStatic();
        myClass.mergeSentence(sentence_one, sentence_two);
    }
}