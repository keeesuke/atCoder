import java.util.Scanner;
import java.util.Arrays;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int[] n = new int[5];
    int[] sum = new int[10];
    int index = 0;
    for(int i=0; i<5; i++){
      n[i] = scan.nextInt();
    }
    for(int i=0; i<3; i++){
      for(int j=i+1; j<4; j++){
        for(int k=j+1; k<5; k++){
          sum[index] = n[i] + n[j] + n[k];
          index++;
        }
      }
    }
    Arrays.sort(sum);
    int l = 0, m = 1;
    while(true){
      if(sum[sum.length-m] > sum[sum.length-m-1]){
        l++;
        if(l == 3){
          System.out.println(sum[sum.length-m]);
          break;
        }
      }
      m++;
    }
    // for(int i=0; i<sum.length; i++){
    //   System.out.print(sum[i] + " ");
    // }
  }
}
