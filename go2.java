import java.util.*;
public class go2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int rep=in.nextInt();
		
		int size=in.nextInt();
		int gift=1;
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<size;i++){
			a.add(in.nextInt());
		}
		
		int num=Collections.min(a);
		int min=a.indexOf(Collections.min(a));
		
		if(min==0){
			for(int i=1;i<a.size();i++){
				if(checkmid(a.get(i-1),a.get(i),a.get(i+1)))
					gift++;
				
			}
		}

	}
	
	public static boolean checkmid(int a,int b,int c){
		if(b>=a&&b>=c)
			return true;
		else
			return false;
		
		
	}

}
