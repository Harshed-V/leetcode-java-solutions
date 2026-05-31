import java.util.*;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int b =  myAtoi(str);   // calls the myAtoi Method
        System.out.println(b);
        sc.close();

     }public static int myAtoi(String s){      // I used Static as i have created it inside the class 
        if( s==null|| s.isEmpty())             //checksthe given input is empty or not
          return 0;
        char[] str = s.toCharArray(); 
        int i=0;
        int num=0, sign = 1;
        int n=str.length;
        while(i<n && str[i] == ' ')           //Removes or Avoids the leading White space
            i++;
        if(i<n && (str[i]=='+'||str[i]=='-')){    // checks for The Sign positive or negative 
            sign = (str[i]=='-')?-1:1 ;          // Stores the value in the variable sign
            i++;
        }
        while(i<n && Character.isDigit(str[i])){  // checks the number is digit or not stops if non digit value occurs
            int digit = str[i]-'0';        // converts the value into integer with out ascii or built in function
            if(num>(Integer.MAX_VALUE-digit)/10){     //prevents overflow of  number in case of input more than the value of integer datatype
                return (sign == 1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            num=(num*10)+(str[i]-'0');      // Stores the numbers in variable num
            i++;
        }
        return (sign==-1)?(-num):num;      // return the value in ehich sign it should be using ternary operator
    }
}
