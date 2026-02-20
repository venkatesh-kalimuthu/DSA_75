import java.util.HashMap;

import java.util.Map;
 
public class ValidAnagram {
 
    public static boolean isAnagram(String s, String t) {

        // 1. Quick length check (O(1))

        if (s.length() != t.length()) {

            return false;

        }
 
        // Use Map interface for better practice, HashMap for implementation

        Map<Character, Integer> countMap = new HashMap<>();
 
        // 2. Build frequency map for string s

        // Using charAt() avoids creating a new char[] array in memory

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);                                         //char c = Character.toLowerCase(s.charAt(i));

            countMap.put(c, countMap.getOrDefault(c, 0) + 1);

        }
 
        // 3. Decrement frequencies using string t

        for (int i = 0; i < t.length(); i++) {

            char c = t.charAt(i);                                         //char c = Character.toLowerCase(s.charAt(i));

            Integer currentCount = countMap.get(c);
 
            // If currentCount is null, char c wasn't in string s.

            // If currentCount is 0, char c appears more times in t than in s.

            if (currentCount == null || currentCount == 0) {

                return false;

            }
 
            // Decrement the count

            countMap.put(c, currentCount - 1);

        }
 

        return true;

    }
 
    public static void main(String[] args) {

        System.out.println(isAnagram("anagram", "nagaram")); // true

        System.out.println(isAnagram("rat", "car"));         // false

        System.out.println(isAnagram("😊🔥", "🔥😊"));       // true (Unicode support)

    }

}

 
