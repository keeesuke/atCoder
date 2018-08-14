import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int x = scan.nextInt();
    int left = 0;
    int right = 0;
    int temp = 0;
    for(int i=0; i<m; i++){
      temp = scan.nextInt();
      if(temp < x)left++;
      else{
        right++;
      }
    }
    System.out.println(Math.min(left, right));

  }
}
// input:
// 5 3 3
// 1 2 4
//       s
// 0 1 2 3 4 5
// 0 1 1 0 1 0
//
// input:
// 7 3 2
// 4 5 6
//     s
// 0 1 2 3 4 5 6 7
// 0 0 0 0 1 1 1 0
//
// input:
// 10 7 5
// 1 2 3 4 6 8 9
//           s
// 0 1 2 3 4 5 6 7 8 9 10
// 0 1 1 1 1 0 1 0 1 1 0
