import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import lombok.*;

@Setter
@Getter
public class FilteredWordsService {
    private String[] separateWords;
    private List<String> filteredWords;
    private String text;
    private List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');


    public String filteredTextByRule(String text) {
        if (text == null) {
            return "";
        }

        System.out.println(text);

        return Arrays.stream(text.split(" "))
                .filter(this::isWordApplyToRule)
                .collect(Collectors.joining(" "));
    }

    private boolean isWordApplyToRule(String word) {
        int countVowels = 0;
        Matcher match = Pattern.compile("[aioeuy]").matcher(word);
        while (match.find()) {
            countVowels++;
        }
        return countVowels < word.length() / 2;

    }

}
