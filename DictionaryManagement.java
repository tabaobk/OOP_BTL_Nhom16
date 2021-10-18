import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DictionaryManagement {

    //Them word tu ban` phim'
    public void insertFromCommandline() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Text your English word: ");
        String english_word = sc.next();
        System.out.println("Text VietNamese meaning: ");
        String vietnamese_word = sc.next();
        Word newword = new Word(english_word,vietnamese_word);
        // thêm newword vào database tùy theo luồng
    }

    //Them word tu file
    public void insertFromFile() {
        //lay du lieu tu duong dan

        Path file = Path.of("dictionaries.txt");
        try{
            // in ra danh sach tu dien
            List<String> wordlist = Files.readAllLines(file);
            System.out.format("%-15s     |%-15s    |%-15s \n","No", "English", "VietNam\n");
            int no = 1;
            for (String i : wordlist) {
                String[] data = i.split("\t");
                Word tempword = new Word();
                tempword.word_target = data[0];
                tempword.word_explain = data[1];
                System.out.format("%-15s     |%-15s    |%-15s \n", no++, tempword.word_target, tempword.word_explain);
            }
            }catch (Exception e){
            System.out.println(e);
        }


    }

    public void dictionaryLookup() {
        return;
    }

}
