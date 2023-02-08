
public class Main {

	public static void main(String[] args) {
		float a=5,b=6,c=7;
		int n=5;
		Main.PTB2(a,b,c);
		Main m=new Main();
		System.out.println("Gia thua cua 5 la: "+Main.GT(n));
	}
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
	static long GT(int n)
	{
		long gt=1;
		for(int i=1;i<=n;i++)
		{
			gt*=i;
		}
		return gt;
	}
}
