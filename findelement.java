package javapro1;
import java.util.Scanner;
public class findelement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	//int x=sc.nextInt();
	int flag=0;
	int arr[] = new int[n];
	for(int i=0;i<=n-1;i++) {
		int t=sc.nextInt();
		arr[i]=t;
	}
	int x=sc.nextInt();
	for(int i=0;i<n-1;i++) {
if(arr[i]==x) {
	flag=1;
	break;
}
	else {
		flag=0;
	}
if(flag==1) {
	System.out.println("no");
}
else {
	System.out.println("yes");
}
	}
}
}
