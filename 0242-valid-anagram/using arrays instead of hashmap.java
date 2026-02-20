public class ValidAnagram {
 


    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {

            return false;

        }
 
        // 2. Use an array of size 128 to cover all standard ASCII characters.

        // This includes 'A'-'Z' (65-90), 'a'-'z' (97-122), numbers, and symbols.

        int[] counts = new int[128];
 
        // 3. Increment counts for characters in string s

        for (int i = 0; i < s.length(); i++) {

            counts[s.charAt(i)]++;

        }
 
        // 4. Decrement counts for characters in string t

        for (int i = 0; i < t.length(); i++) {

            char index = t.charAt(i);

            if (--counts[index] < 0) {

                return false;

            }

        }
 
        return true;

    }
 
    public static void main(String[] args) {

        System.out.println("Test 4 (a1!/1!a): " + isAnagram("a1!", "1!a")); // true

    }

}



/* if logic is case insensitive with no spaces or punctuations..

      int[] counts = new int[26];

    for (int i = 0; i < s.length(); i++) {

        counts[s.charAt(i) - 'a']++;

    }
 
    for (int i = 0; i < t.length(); i++) {

        if (--counts[t.charAt(i) - 'a'] < 0) {

            return false;

        }

    } */

 
