import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();
    int X, Y, Z, i=0;
    //例：N＝7, M=23　で(1 3 3)
    // M - 2*N = Y + 2*Z;
    // X = N - Y - Z;
    if(M - 2*N < 0) System.out.println("-1 -1 -1");
    else{
      for(Z=0; Z<N+1; Z++){
        Y = M - 2*N - 2*Z;
        X = N - Y - Z;
        if(Y > -1 && X > -1){
          i = 1;
          if(i == 1){
            System.out.println(X + " " + Y + " " + Z);
            break;
          }
        }
      }
      if(i == 0)System.out.println("-1 -1 -1");
    }
  }
}
