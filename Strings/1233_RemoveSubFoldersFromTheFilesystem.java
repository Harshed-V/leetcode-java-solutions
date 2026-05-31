import java.util.*;

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        // Step 1: Sort the folder paths lexicographically
        Arrays.sort(folder);

        List<String> result = new ArrayList<>();
        String prev = ""; // Stores the last added top-level folder

        for (String curr : folder) {
            // Step 2: If curr is NOT a subfolder of prev, add it to result
            if (prev.isEmpty() || !curr.startsWith(prev + "/")) {
                result.add(curr);  // Add current folder
                prev = curr;       // Update prev to current folder
            }
        }

        return result;
    }
}
