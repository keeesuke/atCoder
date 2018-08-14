import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
    int x = 1;
    int[] arr = new int[4];
    arr[0] = 6;
    arr[1] = 7;
    arr[2] = 8;
    arr[3] = 9;
    if(n == 1)System.out.println("aoki");
    else{
      for(int i=0; i<10){
        for(int j=0; j<4; j++){
          if(n == arr[j]){
            System.out.println("aoki");
            return;
          }
        }
      }
    }
	}
}
