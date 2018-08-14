import java.util.Scanner;

class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){
		return Integer.parseInt(s.next());
	}
	public static void main(String[]$){
		int n=gInt(),v[]=new int[n];
		for(int i=0;i<n;++i)
			v[i]=gInt();
		int r=-9999;
		for(int t=0;t<n;++t){
			int tv=-9999,amax=-9999;
			for(int a=0;a<n;++a) if(a!=t){
				int f=0;
				int[] m={0,0};
				for(int i=Math.min(t,a);i<=Math.max(t,a);++i){
					m[f%2]+=v[i];
					++f;
				}
				if(amax<m[1]){
					amax=m[1];
					tv=m[0];
				}
			}
			r=Math.max(r,tv);
		}
		System.out.println(r);
	}
}
