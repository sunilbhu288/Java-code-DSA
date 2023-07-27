public class ArrayCommonFactore {
    public static void main(String [] args){
        int arr1 [] = {1,3,5,7,8,9};
        int arr2 [] = {3,6,11,15,5,8};
        commanFactore(arr1, arr2);

    }
    public static void commanFactore(int arr1[],int arr2[]){
        int x =0;
        int y=0;
        while(x<arr1.length && y<arr2.length){
        if(arr1[x] == arr2[y]){
            System.out.println(arr1[x]+" ");
            x++;
            y++;
        }
        else if(arr1[x]>arr2[y]){
            y++;
        }
        else{
            x++;
        }
        }

    }
}
