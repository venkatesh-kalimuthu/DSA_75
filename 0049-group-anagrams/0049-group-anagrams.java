import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        
        for (String word : strs) {
            char[] count = new char[26];
            for (int i = 0; i < word.length(); i++) {                                           // for (char c : word.toCharArray()) -- will create more temporary objects
                count[word.charAt(i) - 'a']++;
            }
            String key = String.valueOf(count);
            anagramMap.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }
}
