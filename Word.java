public class Word {
    String word_target; // tu moi
    String word_explain;// giai nghia

    public Word(String word_target, String word_explain) {
        this.word_target = word_target;
        this.word_explain = word_explain;
    }
    public Word() {
        word_explain = "";
        word_target = "";
    }

    public void printWord() {
        System.out.println(word_target+ " " + word_explain);
        return;
    }

    //Ham tra ve String ca tu moi va nghia cua tu
    public String getWord() {
        return word_target + " " + word_explain;
    }
}
