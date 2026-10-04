import java.util.Scanner;
public class NO_OF_FACTORS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0,i;
		for(i=1;i<=n;i++) {
		if(n%i==0);
		i=i+1;
         ++c;
		}
		System.out.print("no of factors="+c);
	}

}
