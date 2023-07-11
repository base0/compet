import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  static int[] m;

  static int f(int n) {
    if (n < 2) 
      return n;
    else {
      if (m[n] == -1) {
        m[n] = f(n-1) + f(n-2);
        return m[n];
      } else {
        return m[n];
      }
    }
  }
  public static void main(String[] args) throws Exception {
    // sc = new Scanner(new FileInputStream("c:\\temp\\in.txt"));
    int n = sc.nextInt();
    
    m = new int[n+1];
    Arrays.fill(m, 0, n+1, -1);

    System.out.println(f(n));
  }
}
