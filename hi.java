
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class hi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int x=0;
		String s;
		try {
			Scanner in=new Scanner(new FileReader("a.txt"));
			s=in.nextLine();
			
			
			while(in.hasNext()){
				x=x+in.nextInt();
			}
			System.out.println("The sum is "+x+".");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}*/
	String a="s";
	String b="b";
	if(a.compareTo(b)<0){
		System.out.println("yolo");
	}
	}
	
	/*
	int n = set.length;
	 
    // Run a loop for printing all 2^n
    // subsets one by obe
    for (int i = 0; i < (1<<n); i++)
    {
        System.out.print("{ ");

        // Print current subset
        for (int j = 0; j < n; j++)

            // (1<<j) is a number with jth bit 1
            // so when we 'and' them with the
            // subset number we get which numbers
            // are present in the subset and which
            // are not
            if ((i & (1 << j)) > 0)
                System.out.print(set[j] + " ");

        System.out.println("}");
    }
	*/
}
