import java.util.Scanner;

class Main{
    public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int k = scan.nextInt();
      int[] s = new int[n];
      boolean flag = false;
      for(int i=0; i<n; i++){
        s[i] = scan.nextInt();
        if(s[i] == 0){
          flag = true;
        }
      }
      if(flag == true){
        System.out.println(n);
        return;
      }
      if(k == 0){
        System.out.println(0);
        return;
      }
      int multi = 1, count = 0, j = 0, max = -1;
      for(int i=0; i<n; i++){
        j = i;
          while(multi <= k){
            if(j >= n){
              break;
            }else{
              multi *= s[j];
              if(multi > k)break;
              count++;
              j++;
            }
          }
          max = Math.max(max, count);
          multi = 1;
          count = 0;
      }

      System.out.println(max);
    }
  }
  7 6
  4
  3
  1
  1
  2
  10
  2
