import java.util.*;
public class go1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		sc.nextLine();
		ArrayList<String> result=new ArrayList<String>();
		
		for(int j=0;j<c;j++){
		String go=sc.nextLine();
		ArrayList<Character> a=new ArrayList<Character>();
		//char[] temp=new char[go.length()];
		for(int i=0;i<go.length();i++){
			a.add(go.charAt(i));
		}
		//System.out.println(temp[3]);
		int s=0;
		int size=go.length();
		
		while(s<size){
			if(s+2>a.size())break;
			else if(a.get(s).equals(a.get(s+1))&&(a.get(s).equals(a.get(s+2)))){
				a.remove(s+2);
				s=0;
				size=a.size();
			}
			else if(s+3>a.size())break;
			else if(a.get(s).equals(a.get(s+1))&&a.get(s+2).equals(a.get(s+3))){
				a.remove(s+3);
				s=0;
				size=a.size();
			}
			else if(s+5>a.size())break;
			else if(a.get(s).equals(a.get(s+1))&&a.get(s+2).equals(a.get(s+3))&&a.get(s+4).equals(a.get(s+5))){
				a.remove(s+3);
				s=0;
				size=a.size();
				
			}
			else{
				s++;
				//System.out.println(size);
			}
		}//end while
		char[] hi=new char[a.size()];
		for(int i=0;i<a.size();i++){
			hi[i]=a.get(i);
		}
		String b=new String(hi);
		result.add(b);
		
		}//end all for
		
		for(int z=0;z<result.size();z++){
			System.out.println(result.get(z));
		}

	}

}
