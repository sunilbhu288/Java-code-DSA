import java.util.Scanner;
 class Test1 {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = "";
    while(n>0){
        int arr = n%10;
        if(arr==0){
            str = "zero "+str;
        }
        else if(arr==1){
            str = "one "+str;
        }
        else if(arr==2){
            str = "two "+str;
        }
        else if(arr==3){
            str = "three "+str;
        }
        else if(arr==4){
            str = "four "+str;
        }
        else if(arr==5){
            str = "five "+str;
        }
        else if(arr==6){
            str = "six "+str;
        }
        else if(arr==7){
            str = "seven "+str;
        }
        else if(arr==8){
            str = "eight "+str;
        }
        else if(arr==9){
            str = "nine "+str;
        }
        n = n/10;
        
    }
    System.out.println(str);
}

    
}
