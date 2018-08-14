import java.util.Scanner;

class sample{

  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    String[] str = new String[N];
    for(int i=0; i<N; i++){
      str[i] = scan.next();
    }

    int[][] time = new int[N][4];
    int temp = 0;
    for(int i=0; i<N; i++){
        time[i][0] = Integer.parseInt(str[i].substring(0,2));
        time[i][1] = Integer.parseInt(str[i].substring(2,4));
        time[i][2] = Integer.parseInt(str[i].substring(5,7));
        time[i][3] = Integer.parseInt(str[i].substring(7,9));
    }
    for(int i=0; i<N; i++){
      for(int j=1; j<4; j=j+2){
        temp = time[i][j] - time[i][j]/10*10;
        if(temp >= 1 && temp <= 5){
          if(j == 1){
            temp = 0;
            time[i][j] = temp + time[i][j]/10*10;
          }
          if(j == 3){
            temp = 5;
            time[i][j] = temp + (time[i][j]/10)*10;
          }
        }else if(temp >= 6 && temp <=9){
          if(j == 1){
            temp = 5;
            time[i][j] = temp + time[i][j]/10*10;
          }
          if(j == 3){
            temp = 0;
            time[i][j] = temp + (time[i][j]/10 + 1)*10;
          }
        }
      }
    }

    int oder = 0;
    for(int i=0; i<N; i++){
      for(int j=0; j<4; j++){

      }
    }

    for(int i=0; i<N; i++){
      for(int j=0; j<4; j++){
        System.out.println(time[i][j]);
      }
    }

  }
}
