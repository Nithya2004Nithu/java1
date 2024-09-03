package javapro1;
import java.util.Scanner;
public class fibannoci {

	public static void main(String[] args) {
	int a=0,b=1;
	int n,c,i;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	System.out.println(a);
	System.out.println(b);
	for(i=0;i<=n;i++) {
	c=a+b;
	System.out.println(c);
	a=b;
	b=c;
	}
	}
}
