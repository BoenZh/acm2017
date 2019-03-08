import java.util.Scanner;

public class dice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums1 = new int[6];
		
		int wins = 0, ties = 0;
		
		for(int i = 0;i < nums1.length;i++) {
			nums1[i] = sc.nextInt();
		}
		for(int i = 0;i < nums1.length;i++) {
			int num = sc.nextInt();
			for(int j = 0;j < nums1.length;j++) {
				if(nums1[j] > num) {
					wins++;
				}
				else if(nums1[j] == num) {
					ties++;
				}
			}
		}
		
		System.out.printf("%.5f\n",
				((double)wins) / (36 - ((double)ties))
		);
	}
}
