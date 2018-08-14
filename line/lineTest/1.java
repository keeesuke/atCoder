import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int week = sc.nextInt();
    String date = sc.next();
    int[] d = new int[3];
    int[] test = new int[week];
    String[] D = date.split("-", 0);
    d[0] = Integer.parseInt(D[0]);
    d[1] = Integer.parseInt(D[1]);
    d[2] = Integer.parseInt(D[2]);
    char[] c = new char[week];
    for(int i=0; i<week; i++){
       c[i] = (char)(0x41 + i);
    }
    if(d[2] > month){
      System.out.println("-1");
      return;
    }
    int stuck = year % month;
    int temp = stuck * d[0];
    if(month > temp){
      if(d[1] > year/month){
        System.out.println("-1");
        return;
      }
      int ans = ((year/month)*month * (d[0]-1) + ((d[1]-1)*month) + (d[2]-1))%week;
      System.out.println(c[ans]);
      return;
    }else{
      if(d[1] > year/month + 1){
        System.out.println("-1");
        return;
      }
      int ans = ((year/month)*month * (d[0]-1) + ((d[1]-1)*month) + (d[2]-1))%week;
      System.out.println(c[ans]);
      return;
        }
  }
}
