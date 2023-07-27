import java.util.Scanner;

public class MinDiffNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr1[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr1[i] = sc.nextInt();
    }
    int arr2[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr2[i] = sc.nextInt();
    }
    int minDiff = Integer.MAX_VALUE;
    int i = 0;
    int j = 0;
    while (i < n && j < n) {
      int diff = Math.abs(arr1[i] - arr2[j]);
      minDiff = Math.min(minDiff, diff);
      if (arr1[i] < arr2[j]) {
        i++;
      } else {
        j++;
      }
    }
    System.out.println(minDiff);

  }
}
