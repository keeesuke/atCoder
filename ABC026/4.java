
import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] c = new int[N];
    int temp = 0, n = 0;
    for(int i=0; i<N; i++){
      c[i] = scan.nextInt();
    }

    if(N != 1){
      for(int i=1; i<N; i++){
        temp = c[i];
        for(int j=0; j<i; j++){
          if(c[j] > temp){
            for(int k=i; k>j; k--){
              c[k] = c[k-1];
            }
            c[j] = temp;
            n++;
            for(int p=0; p<N; p++){
              if(i==0)System.out.print(c[p]);
              else{
                System.out.print(" "+c[p]);
              }
            }
            System.out.println("");
            break;
          }
        }
      }
    }
    // for(int i=0; i<N; i++){
    //   if(i==0)System.out.print(c[i]);
    //   else{
    //     System.out.print(" "+c[i]);
    //   }
    // }
    // System.out.println("");
    System.out.println(n);
  }
}
