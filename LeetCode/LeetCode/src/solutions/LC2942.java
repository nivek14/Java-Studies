package solutions;

import java.util.ArrayList;
import java.util.List;

public class LC2942 {

    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> indexWords = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            if(words[i].contains(Character.toString(x))) indexWords.add(i);
        }

        return indexWords;

    }

}
