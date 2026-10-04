import java.util.Scanner;
public class numberpattern {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,j,s;
for(i=1;i<=n;i++) {
	for(s=1;s<=n-i;s++) {
		System.out.print(" ");
	}
	for(j=i;j>=1;j--) {
		System.out.print(+j);
	}
	
	

System.out.println( );
sc.close();
}
	}
}
