import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int z=sc.nextInt();
		int a;
		int b;
		int c;
		int d;
		int remain;
		int l;
		for(int i=0;i<z;i++){
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			d=sc.nextInt();
			remain=a-b;
			l=remain%3;
			if(l+c+d==0||l-c+d==0||l+c-d==0||l-c-d==0)
				System.out.println("yes");
			else
				System.out.println("no");
			
		}

	}

}
