import java.util.Scanner;

class Main{
    public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      String s = scan.next();
      s += "+";
      String[] str = new String[s.length()];
      for(int i=0; i<s.length(); i++){
        str[i] = s.substring(i,i+1);
      }
      boolean b = false;
      int count = 0;
      for(int i=0; i<s.length(); i++){
        if(i%2 == 0){
          if(str[i].equals("0")){
            b = true;
          }else{
            continue;
          }
        }else{
          if(str[i].equals("+")){
            if(b == false){
              count++;
            }else{
              b = false;
            }
          }
        }
      }
      System.out.println(count);
    }
  }
