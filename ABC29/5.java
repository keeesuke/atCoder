import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		new Main().solve();
	}

	void solve(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt()+1;
		String n=String.valueOf(N);
		int digit=n.length();
		long ans=0;

		for(int i=1;i<=digit;i++){
			int pat=(int)Math.pow(10,i);
			int num=(int)Math.pow(10, i-1);
			//N = 345
			//pat = 10,100,1000
			//num = 1,10,100
			ans+=N/pat*num;
			System.out.println("ans 1: "+ans);
			//ans = 34+30+0

			int res=N%pat;
			//res = 5,45,345
			if(res<num){
				continue;
			}else{
				ans+=Math.min(num, res-num);
				System.out.println("ans 2: "+ans);

			}
		}
		System.out.println(ans);

	}
}
