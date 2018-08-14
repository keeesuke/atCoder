import java.util.Scanner;

class Main{
    public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      int[] n = new int[8];
      for(int i=0; i<8; i++){
        n[i] = scan.nextInt();
      }
      System.out.println(solution(n[0],n[1],n[2],n[3],n[4],n[5],n[6],n[7]));

    }

    public static int solution(int K, int L, int M, int N, int P, int Q, int R, int S) {
      int sum = 0;
      sum = (M-K)*(N-L)+(R-P)*(S-Q);
        if((P < M && S > L) && (K < P && N > S) && (M < R && L > Q)){
          sum = sum - (M-P)*(S-L);
          System.out.println("1");
        }else if((K > P && N < S)&&(K < R && N > Q)&&(R < M && Q > L)){
          sum = sum - (R-K)*(N-Q);
          System.out.println("2");

        }else if((K >= P && N <= S)&&(R >= M && Q <= L)){
          sum = (R-P)*(S-Q);
          System.out.println("3");

        }else if((K <= P && N >= S)&&(R <= M && Q >= L)){
          sum = (M-K)*(N-L);

          System.out.println("4");

        }else{}

        if(sum <= 2147483647){
          return sum;
        }else{
          return -1;
        }
    }
  }
//5 2 7 4 1 9 4 13
