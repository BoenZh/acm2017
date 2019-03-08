import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class alp {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int size=s.length();
		int result=0;
		
		//ArrayList<String> list=new ArrayList<String>();
		//list.add(Character.toString(s.charAt(0)));
		
		int[] list = new int[s.length()];
		
		
		for(int i=0;i<size;i++){
			int m = 1;
			
			for(int j = i - 1;j >= 0;j--) {
				if(s.charAt(i) > s.charAt(j)) {
					m = Math.max(m, list[j] + 1);
				}
			}
			
			list[i] = m;
			
			result = Math.max(result, m);
			
		}//end for
		
		System.out.println(26 - result);
		//xyzabcdefghijklmnopqrstuvw
		//aiemckgobjfndlhp
	}

}
//C:\Users\zhangbb\Desktop\team7>c:\pc2-9.5.2\bin\pc2team