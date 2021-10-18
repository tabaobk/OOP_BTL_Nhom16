import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DictionaryCommandline {

    //in ra toan` bộ từ trong từ điển cả Anh và Viet
    public static void showAllWords() {
        Scanner sc = new Scanner(System.in);
        Path path = Path.of("D:\\Temp\\Dictionary\\src\\data");
        try {
            List<String> wordlist = Files.readAllLines(path);
            //System.out.println(wordlist);
            System.out.format("%-15s     |%-15s    |%-15s \n","No", "English", "VietNam\n");
            int no = 1;
            for (String i : wordlist) {

                String []data = i.split(",");
                Word tempword = new Word();
                tempword.word_target = data[0];
                tempword.word_explain = data[1];
                System.out.format("%-15s     |%-15s    |%-15s \n",no++, tempword.word_target, tempword.word_explain);

            }

        } catch (IOException e) {
            System.out.println("Error");
        }
    }



    public void dictionaryBasic() {
        DictionaryManagement Diction = new DictionaryManagement();
        Diction.insertFromCommandline();
        showAllWords();
    }

    public void dictionaryAdvanced(){
        DictionaryManagement Diction = new DictionaryManagement();
        Diction.insertFromFile();
        showAllWords();
        Diction.dictionaryLookup();
    }

    public static void main(String[] args) {
        showAllWords();
    }
}
