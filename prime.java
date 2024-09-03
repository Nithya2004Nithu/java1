package javapro1;

public class prime {
	public static void main(String[] args) {
	int i;
	int n,flag=0;
	n=20;
	for(i=2;i<=n/2;i++) {
	if(n%i==0)

	flag=1;
	break;

	}
	if(flag==0)
	System.out.println("prime");

	else {
	System.out.println("not prime");
	}
	}
}
