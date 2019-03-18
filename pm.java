import java.util.*;

public class pm {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int result=0;
		int n=scan.nextInt();
		int t=scan.nextInt();
		int[] l=new int[n];
		for(int i=0;i<n;i++){
			l[i]=scan.nextInt();
			
		}
		int[] list=new int[n*t];
		int[] full=new int[n*t];
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<t;i++){
			for(int j=0;j<l.length;j++){
				a.add(l[j]);
			}
		}
		//System.out.println(a.size());
		
		for(int i=0;i<a.size();i++){
			int m=1;
			
			for(int j=i-1;j>=0;j--){
				if(a.get(i)>a.get(j)){
					m=Math.max(m,list[j]+1 );
				}
			}
			list[i]=m;
			result=Math.max(result, m);
			
			
		}
		System.out.println(result);

	}

}
