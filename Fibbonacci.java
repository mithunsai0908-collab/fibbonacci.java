import java.util.Scanner;
public class fibbonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int  n=sc.nextInt();
		int f=0,s=1,t,i;
		System.out.print(f+" "+s+" ");
		for(i=1;i<=n-2;i++) {
			t=f+s;
			f=s;
			s=t;
			System.out.print(t+" ");		
					
		}
sc.close();
	}

}

