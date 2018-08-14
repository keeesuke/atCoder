import java.util.Scanner;
import java.util.Arrays;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] r = new int[N];
    double ans = 0;
    for(int i=0; i<N; i++){
      r[i] = scan.nextInt();
    }
    Arrays.sort(r);
    for(int i=N-1; i>-1; i--){
      ans = (-1)*ans + (-1.0)*(r[i]*r[i]*Math.PI);
    }
    if(ans < 0){
      System.out.printf("%.10f", (-1)*ans);
      System.out.println("");
    }else{
      System.out.printf("%.10f", ans);
      System.out.println("");

    }

  }
}
