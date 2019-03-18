import java.util.Arrays;
import java.util.Scanner;

public class barbell {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int[] weight=new int[n];
		int[] plate=new int[m];
		int[] visited=new int[n];
		Arrays.fill(visited, 0);
		
		for(int i=0;i<n;i++){
			weight[i]=in.nextInt();
		}
		for(int i=0;i<m;i++)
			plate[i]=in.nextInt();
		
		

	}

}
