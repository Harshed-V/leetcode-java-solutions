    import java.util.Scanner;

    public class ValidParenthesis {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            char[] a=str.toCharArray();
            int len=str.length();
            int i,j,flag=1;
            for(i=0,j=len-1;i<j;i++,j--){
                if(len==1||len%2!=0){
                    break;
                }
                else if((a[i]=='('&&(int)a[j]==')'||(int)a[i]=='{'&&(int)a[j]=='}'||(int)a[i]=='['&&(int)a[j]==']')){
                    flag=0;
                    if((int)a[i]>(int)a[i+1]){
                        flag=1;
                        break;
                    }i++;
                } else{
                    {
                        if((a[i]=='('&&(int)a[j]==')'||(int)a[i]=='{'&&(int)a[j]=='}'||(int)a[i]=='['&&(int)a[j]==']')){
                            flag=0;
                            if((int)a[i]>(int)a[j]){
                                flag=1;
                                break;
                            }
                            i++;
                            j--;
                        }
                    }
                }
            }if(flag==0){
                System.out.print("True");
            }else{
                System.out.print("False");
            }
        }
    }
