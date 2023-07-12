import java.util.*;
// Prime numbers Program
class Prime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Size of an array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Target Number");
    int t = sc.nextInt();
    System.out.println("Numbers are");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i <= n; i++) {
      int count = 0;
      for (int j = 1; j <=arr[i]; j++) {
        int a = 0;
        for (int k = 1; k < t; k++) {
          int a = i + k;
          if (a % j == 0) {
            count++;
          }
          if (count == 2) {
            System.out.println("Prime Numbers are");
            System.out.println(a);
          }
        }
      }
    }
  }
}
