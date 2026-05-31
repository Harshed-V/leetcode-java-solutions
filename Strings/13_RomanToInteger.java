import java.util.Scanner;

class Roman {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print(roman(s));

    }public static int roman(String s){


                char[] arr = s.toCharArray();
                int len = arr.length;

                char[] sy = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
                int[] val = {1, 5, 10, 50, 100, 500, 1000};

                int sum = 0;
                int prevValue = 0;

                for (int j = len - 1; j >= 0; j--) {
                    int currValue = 0;

                    // Find the integer value of the current Roman numeral
                    for (int i = 0; i < sy.length; i++) {
                        if (arr[j] == sy[i]) {
                            currValue = val[i];
                            break;
                        }
                    }

                    // Apply Roman numeral rules
                    if (currValue < prevValue) {
                        sum -= currValue;
                    } else {
                        sum += currValue;
                    }

                    prevValue = currValue;
                }

                return sum;
    }
}
