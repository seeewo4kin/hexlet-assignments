package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN

class App{

    public static boolean scrabble(String chars, String word){

        int m = 0;

        List<String> charlist = new ArrayList<>();
        List<String> wordlist = new ArrayList<>();
        chars = chars.toLowerCase();
        word = word.toLowerCase();
        for (int i = 0; i < chars.length(); i++){
            charlist.add(Character.toString(chars.charAt(i)));
        }
        for (int i = 0; i < word.length(); i++){
            wordlist.add(Character.toString(word.charAt(i)));
        }
        do{
            if (charlist.containsAll(wordlist)){
            charlist.remove(wordlist.get(0));
            wordlist.remove(wordlist.get(0));
            }
            m++;
            System.out.println(wordlist);

            if (m > 20){
                break;
            }
        } while (wordlist.size() != 0);
            if (wordlist.isEmpty()){
                return true;
            }
            else {return false;}
    }
}


//END
