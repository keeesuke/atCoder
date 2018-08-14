import java.util.Scanner;

class Main{
    public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int s[] = new int[n];
      for(int i=0; i<n; i++){
        s[i] = scan.nextInt();
      }

      int begin=0, end=0, taka=0, aoki=0, sumT=-10000, sumA=-10000, sumTMax=-10000, sumAMax=-10000;
      int beginAns=0, endAns=0;
      // int t[] = new int[];
      for(int taka=0; taka<n; taka++){
        for(int aoki=0; aoki<n; aoki++){
          if(taka != aoki){
            if(taka < aoki){
              begin = taka;
              end = aoki;
            }else{
              begin = aoki;
              end = taka;
            }
            for(int j=begin; j<end; j=j+2){
              sumT += n[j];
              if(sumT > sumTMax && taka < aoki){
                sumTMax = sumT;
                beginAns = begin;
              }
            }
            for(int j=begin+1; j<end; j=j+2){
              sumA += n[j];
              if(sumA > sumAMax && taka < aoki){
                sumAMax = sumA;
                beginAns = begin;
            }
            if(sumT > sumTMax){
              ans = sumT;
            }
            sumT = 0;
            sumA = 0;
          }
        }
      }
      System.out.println(ans);
  }
}

//6
// 1 -3 3 9 1 6
