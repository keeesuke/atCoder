import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

class Main{
    public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      String s = scan.next();
      int k = scan.nextInt();
      Set<String> arr = new HashSet<>();

        for(int i=0; i<s.length()-k+1; i++){
            arr.add(s.substring(i,i+k));
        }
        System.out.println(arr.size());
    }
  }
