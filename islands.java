import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class islands {
	static boolean[][] visit ;
	static int m, n;
	static char[][] temp;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		m=sc.nextInt();
		n=sc.nextInt();
		sc.nextLine();
		visit= new boolean[m][n];
		String str="";
		int island=0;
		
				
		temp=new char[m][n];
		for(int i=0;i<m;i++){
			str = sc.nextLine();
			for(int j=0;j<n;j++){
				temp[i][j]= str.charAt(j);
			}
		}
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(temp[i][j]=='L'&& visit[i][j]==false){
					island++;
					BFS(i,j);
				}
					 
					
			}
			
		}
		System.out.println(island);
	}
	
	public static boolean BFS(int x,int y){
		
		Queue<Point> hi=new LinkedList<Point>();
		visit[x][y]=true;
		hi.add(new Point(x,y));
		while(!hi.isEmpty()){
			Point p;
			p=hi.poll();
			for(int i=0;i<4;i++){
				int xd=(int) Math.pow(-1, i);
				int yd= 0;
				if(i / 2 == 1) {

					xd= 0;
					yd= (int) Math.pow(-1, i);
				}
				Point p2=new Point(xd+p.x,yd+p.y);
				if(p2.x<0||p2.y<0||p2.x>=m||p2.y>=n)
					continue;
				if(temp[p2.x][p2.y]=='W')
					continue;
				if(visit[p2.x][p2.y]==true)
					continue;
				
				hi.add(p2);
				visit[p2.x][p2.y]=true;
				//System.out.println(p2.x+"     "+p2.y);
				
				
				
				
			}
		}
		
		
		
		return false;
	}
	
	static class Point {
		public int x;
		public int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
