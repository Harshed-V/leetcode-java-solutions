import java.util.*;

public class LongSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Solution2 solution = new Solution2();
        System.out.println(solution.lengthOfLongestSubstring(str));
        sc.close();
    }
}

class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0; // Stores max length found

        // Loop through all substrings starting at index 'i'
        for (int i = 0; i < s.length(); i++) {
            ArrayList<Character> str = new ArrayList<>(); // New list for every start index
            int count = 0; // Count of unique characters

            // Loop to expand substring starting from 'i'
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);

                if (!str.contains(c)) { // If unique, add it
                    str.add(c);
                    count++;
                    max = Math.max(max, count); // Update max length
                } else {
                    break; // Stop when a duplicate is found
                }
            }
        }
        return max;
    }
}
