import java.util.Scanner;
import java.util.InputMismatchException;

class Main{
  public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
    try{
      int a = scan.nextInt();
      int b = scan.nextInt();
      int go = scan.nextInt();
      int back = scan.nextInt();
      int[] A = new int[a];
      int[] B = new int[b];

    for(int i=0; i<a; i++){
      A[i] = scan.nextInt();
    }
    for(int i=0; i<b; i++){
      B[i] = scan.nextInt();
    }
    scan.close();
    int now = 0, nowA = 0, nowB = 0, count = 0;

    while(now < B[b-1]+back){
      for(int i=nowA; i<a; i++){
        if(now <= A[i]){
          now = A[i];
          now += go;
          nowA = i;
          break;
        }
      }
      for(int i=nowB; i<b; i++){
        if(now <= B[i]){
          now = B[i];
          count++;
          now += back;
          nowB = i;
          break;
        }
      }

    }
    System.out.println(count);

    }catch(InputMismatchException e){
      System.out.println("wrong");
    }
  }
}
