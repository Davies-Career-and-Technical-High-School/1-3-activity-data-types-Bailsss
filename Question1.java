import java.util.Scanner;

class Question1 {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      System.out.println("Give me two doubles");

      double input1 = scan.nextDouble();
      double input2 = scan.nextDouble();

      System.out.println(input2 + " " + input1);

    }
}