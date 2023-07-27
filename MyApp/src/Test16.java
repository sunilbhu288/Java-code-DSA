import java.util.Scanner;
public class Test16 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(2);
        if(a == 'R' || b=='R'){
            System.out.println("R");
        }
        else if(a == 'J' || b=='J'){
            if(a== 'J'){
                System.out.println(b);
            }
            else{
                System.out.println(a);
            }
        }
        else{
            System.out.println("D");
        }

            }
        
        
    }

