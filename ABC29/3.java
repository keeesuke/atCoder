import java.util.Scanner;

class Main{

  static Scanner scan = new Scanner(System.in);
  static int n = scan.nextInt();
  static StringBuilder str = new StringBuilder();
  static int j = 0;
  static String[] arr = new String[3];

  public static void main(String args[]){
    arr[0] = "a";
    arr[1] = "b";
    arr[2] = "c";
    repeat(j);
  }

  public static void repeat(int j){
    if(j == n) return;
    j++;
    for(int i=0; i<3; i++){
      str.append(arr[i]);
      if(str.length() == n) System.out.println(str.toString());
      repeat(j);
      str.deleteCharAt(str.length()-1);
    }
  }

}
