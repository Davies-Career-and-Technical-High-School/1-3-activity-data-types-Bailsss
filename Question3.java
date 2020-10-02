import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      boolean question1;
      boolean question2;
      boolean question3;

      System.out.println("Java is a programming language, true or false?");

      question1 = scan.nextBoolean();

      System.out.println("Only numbers can be stored by variables in Java, true or false?");

      question2 = scan.nextBoolean();

      System.out.println("There are only 2 possible values which can be held by a boolean variable, true or false?");

      question3 = scan.nextBoolean();

      System.out.println("Question 1 - Your answer: " + question1 + ". Correct answer: true");

      System.out.println("Question 2 - Your answer: " + question2 + ". Correct answer: false");

      System.out.println("Question 3 - Your answer: " + question3 + ". Correct answer: true");


    }
}