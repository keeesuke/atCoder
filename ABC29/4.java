import java.util.Scanner;

class Main{
  public static void main(String args[]){
    // Scanner scan = new Scanner(System.in);
    // String n = scan.next();
    // int[] digit = new int[n.length()];
    // for(int i=0; i<n.length(); i++){
    //   digit[i] = Integer.parseInt(n.substring(i,i+1));
    // }
    // for(int i=0; i<n.length(); i++){
    //   System.out.println(digit[i]);
    // }
    System.out.println(rec(3));

    // if(digit[0] != 1){
    //
    // }
    // 0-9 9*(0)+1 =1
    // 10-99 9*(1)+10 =19
    // 100-999 9*(1+19)+100 =280  what 345? ={3*(1+19)+100}+{4*(1)+10}+{5*(0)+1} =175
    // 1000-9999 9*(1+19+280)+1000 =3700 what 3450?
    // 10000-99999 9*(1+19+280+3700)+10000 =
    // .
    // .
  }
  static int[] sum = new int[9];
  sum[0] = 0;
  static int i=0;
  public static int rec(int N){
    if(N == 0)return 1;
    else{
      i++;
      sum[i] = rec(N-1);
      System.out.println(sum);
      return 9*(sum[i])+(int)Math.pow(10, N);
    }
  }

}
