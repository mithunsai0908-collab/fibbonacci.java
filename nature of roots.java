import java.util.Scanner;
public class nature of roots {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int R1,R2;
		if (((b*b)-(4*a*c))<0) {
			System.out.println("roots are imaginary");
		}
		if (((b*b)-(4*a*c))==0){
			System.out.println("roots are equal and real");
			R1=-b/2*a;
			System.out.println("R1=R2="+R1);
		}
		if (((b*b)-(4*a*c))>0){
			System.out.println("roots are distinct and real");
			R1=(-b+(int)Math.sqrt(((b*b)-(4*a*c)))/2*a);
			R2=(-b-(int)Math.sqrt(((b*b)-(4*a*c)))/2*a);
			System.out.println("R1="+R1+"  "+"R2="+R2);
		}
sc.close();
	}

}