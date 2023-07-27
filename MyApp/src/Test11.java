import java.util.Scanner;
public class Test11 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String str = "";
        if(a<=10 && b>=10){
            str = "true "+str;
        }
        else{
            str = "false "+str;
        }
        if(a%2==0 || b%2==0){
            str = "true "+str;
        }
        else{
            str = "false "+str;
        }
        if(a!=b){
            str = "true "+str;
        }
        else{ 
            str = "false "+str;
        }
        System.out.println(str);
    }
}
