import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int i = 0 ; i < n ; i++) set.add(a[i]);
		int j = 0;
		for(int key : set) {
			map.put(key, j);
			j++;
      System.out.println("key: " + key);
		}
    System.out.println("");
		for(int i = 0 ; i < n ; i++) {
			System.out.println(map.get(a[i]));
		}
	}
}
