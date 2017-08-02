import java.util.Scanner;
class EvenOddWithoutIfElse {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] res = {"Even", "Odd"};
    int number = in.nextInt();
    System.out.println(res[number%2]);
  }
}
