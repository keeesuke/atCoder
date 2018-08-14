import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int l1 = scan.nextInt();
    int l2 = scan.nextInt();
    int l3 = scan.nextInt();

    if(l1 == l2)System.out.println(l3);
    else if(l2 == l3)System.out.println(l1);
    else{
      System.out.println(l2);
    }
  }
}
