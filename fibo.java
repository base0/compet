import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  static int f(int n) {
    if (n < 2) 
      return n;
    else 
      return f(n-1) + f(n-2);
  }
  public static void main(String[] args) throws Exception {
    // sc = new Scanner(new FileInputStream("c:\\temp\\in.txt"));
    int n = sc.nextInt();

    System.out.println(f(n));
  }
}
