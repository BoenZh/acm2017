import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class zigzag {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[] data = new int[n];
		
		for(int i = 0; i < n;i++) {
			data[i] = in.nextInt();
		}
		
		int[] list = new int[n];
		boolean[] dirs = new boolean[n];
		
		int result = 0;
		
		
		for(int i=0;i < n;i++){
			int m = 1;
			boolean asc = false;
			
			for(int j = i - 1;j >= 0;j--) {
				if(data[i] == data[j])
					continue;
				
				if((data[i] > data[j]) ^ dirs[j] || list[j] == 1) {
					if(list[j] + 1 > m) {
						if(list[j] == 1) {
							asc = data[i] > data[j];
						}
						else asc = !dirs[j];
						m = list[j] + 1;
					}
					
				}
			}
			
			list[i] = m;
			dirs[i] = asc;
			
			result = Math.max(result, m);
			
		}//end for
		
		
		System.out.println(result);
		/*
5
2 1 3 4 2
		 */
	}

}
//C:\Users\zhangbb\Desktop\team7>c:\pc2-9.5.2\bin\pc2team