import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws InvalidArithmeticOperatorException, WrongTypeNumberException, NumberOutOfRangeException, DifferentTypesOfNumbersException{

      Sentense rv;

      Scanner sc = new Scanner(System.in);
      System.out.println("Введите выражение:");
      String str = sc.nextLine();

      rv = Init.init(str);
      rv = Check.check(rv);
      rv = Convert.convert(rv);
      String result = Calculator.calculator(rv);
      result = Convert.convert(rv.isRoman, result);
      System.out.print(str+" = "+result);
   }

}
