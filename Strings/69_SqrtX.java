import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        System.out.print(mysqrt(val));
    }public static int mysqrt(int x){
        int i=0;
        while((long) i *i!=x){
            if((long) i *i>=x){
                return i-1;
            }
            i++;
        }
        return i;
    }
}
