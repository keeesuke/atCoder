import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try{
      int m = sc.nextInt();
      int n = sc.nextInt();
      if((m > 10 || m < 1) || (n > 10 || n < 1)){}
    }catch(InputMismatchException e){
      System.out.println("1");
      return;
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("1");
      return;
    }
  }
}
