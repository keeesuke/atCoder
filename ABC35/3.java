import java.util.Scanner;

class Main{
    public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int q = scan.nextInt();
      int[] l = new int[q];
      int[] r = new int[q];
      for(int i=0; i<q; i++){
        l[i] = scan.nextInt();
        r[i] = scan.nextInt();
      }
      int[] arr = new int[n];
      int sum = 0;
      for(int i=0; i<n; i++){
        for(int j=0; j<q; j++){
          if(i+1 > l[i] && i+1 < r[i]){
            sum++;
          }
          
        }
        // arr[i] = 0;

      }
      for(int i=0; i<n; i++){
        System.out.print(arr[i]);
      }
      System.out.println();
    }
  }
