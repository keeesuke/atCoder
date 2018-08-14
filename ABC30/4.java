import java.util.Scanner;

class Main{
    public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      int a = scan.nextInt();
      long k = scan.nextInt();
      int[] b = new int[N];
      for(int i=0; i<N; i++){
        b[i] = scan.nextInt();
      }

      int step = 0, now = a;
      for(int i=0; i<k; i++){
        now = b[now-1];
        step++;
      }
      System.out.println(now);

    // 6 4
    // 5
    // 2 3 1 2 6 5
  }
}
