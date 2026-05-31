class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s; // No zigzag needed
        
        StringBuilder[] rows = new StringBuilder[Math.min(numRows, s.length())];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new StringBuilder();
        }

        int currRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currRow].append(c);
            
            // Change direction at the top or bottom row
            if (currRow == 0 || currRow == numRows - 1) {
                goingDown = !goingDown;
            }
            
            currRow += goingDown ? 1 : -1;
        }

        // Combine all rows into a single string
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "PAYPALISHIRING";
        
        System.out.println(solution.convert(s, 3)); // Output: "PAHNAPLSIIGYIR"
        System.out.println(solution.convert(s, 4)); // Output: "PINALSIGYAHRPI"
        System.out.println(solution.convert("A", 1)); // Output: "A"
    }
}
