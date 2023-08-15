package exercise;

import java.util.HashMap;
import java.util.Map;
// BEGIN
class App{

    public static Map<String, Integer> getWordCount(String sentence){

        Map<String, Integer> words = new HashMap<>();

        if (sentence == "") return words;

        String[] array = new String[(sentence.split(" ")).length];
        array = sentence.split(" ");
        for (String word : array){

            if (words.containsKey(word)) {
                words.put(word, (words.get(word) + 1 ));
            }
            else{
                words.put(word, 1);
            }
        }
        return words;
    }


    public static String toString(Map<String, Integer> map){

        String result = "{";

        if (map.isEmpty()) return "{}";


    for(String key : map.keySet()){

        result = result + "\n" + "  " + key + ": " + map.get(key);

        }

    result = result + "\n" + "}";

    return result;

    }
}
//END
