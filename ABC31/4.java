import java.util.Scanner;

class Main{
    public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      int k = scan.nextInt();
      int n = scan.nextInt();
      String[] v = new String[n];
      String[] w = new String[n];
      for(int i=0; i<n; i++){
        v[i] = scan.next();
        w[i] = scan.next();
      }
      String[] s = new String[k+1];
      int[] sLength = new int[k+1];

      int[][] vEach = new int[n][k];
      for(int i=0; i<n; i++){
        for(int j=0; j<v[i].length(); j++){
          vEach[i][j] = Integer.parseInt(v[i].substring(j,j+1));
        }
      }
      for(int i=1; i<=k; i++){
        s[i] = "";
        sLength[i] = 1;
      }

      int[] sum = new int[n];
      for(int i=0; i<k; i++){

      }
k n
6 4
v   w
356 migoro
461 yoroi
2 ni
12 ini
      for(int i=0; i<n; i++){
        System.out.println("s["+i+"] is: "+s[i+1]);
      }

    }
    static void f(int k){

      for(int i=0; i<n; i++){
        for(int j=0; j<v[i].length(); j++){
          sum[i] += sLength[vEach[i][j]];
        }
        if(sum[i] == w[i].length()){
          continue;
        }else{
          sLength[i]++;
        }
      }

    }

  }
