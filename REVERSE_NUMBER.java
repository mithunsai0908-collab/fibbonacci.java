import java.util.Scanner;
public class REVERSENO {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cou=0,r,rv=0;
		while (n>0) {
			r=n%10;
			rv=rv*10+r;
			n=n/10;
			
		}
		System.out.println("reverseno="+rv);
		sc.close();
	}

}
