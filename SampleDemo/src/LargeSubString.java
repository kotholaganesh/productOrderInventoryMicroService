import java.util.HashSet;

public class LargeSubString {


    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("Longest substring without repeating characters: " + longestSubstring(str));
    }

    public static int longestSubstring(String str) {

        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;


        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

}


