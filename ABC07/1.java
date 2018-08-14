import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    if(N == 3){
      System.out.println(2);
    }else if(N == 2){
      System.out.println(1);
    }else{
        System.out.println((N/2)*(N/2));
    }
  }
}
