package jv;

public class Basic {
	static void PTB2(float a,float b,float c) {
		double del=b*b-4*a*c;
		if(del<0)
			System.out.println("Phuong trinh vo nghiem");
		else if(del==0) {
			double x=-b/2*a;
			System.out.println("Phuong trinh co nghiem kep: "+x);
		}else {
			double x1=(-b-Math.sqrt(del))/2*a;
			double x2=(-b+Math.sqrt(del))/2*a;
			System.out.printf("PT co hai nghiem la: "+x1,x2);
		}
	}
	static long GT(long n) {
		long t=1;
		for(int i=1;i<n;i++)
			t*=i;
		return t;
	}
	static long GT2(long n) {
		if(n==0)
			return 1;
		return n* GT2(n-1);
	}
	static long Fibo(long n) {
		long f0=0,f1=1,f2=2;
		if(n==0) return 0;
		for(long i=2;i<=n;i++) {
			f2=f1+f0;
			f0=f1;
			f1=f2;
		}
		return f2;
	}
}
