import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] a = new int[N];
    int all = 0, ans = 0, leftSum = 0;
    for(int i=0; i<N; i++){
      a[i] = scan.nextInt();
      all = all + a[i];

    }
    if(all%N != 0){
      System.out.println("-1");
    }else if(all == 0){
      System.out.println("0");
    }else{
      for(int i=0; i<N-1; i++){
          leftSum += a[i];
          if(all/N*(i+1) != leftSum){
            ans++;
          }
      }
      System.out.println(ans);
    }
  }
}
//8 2 1 1 0 3 0 1 0
//8 0 0 0 0 0 0 0 8
