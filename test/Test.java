package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(dynaFib(8));
		for(int n=25;n<=45;n++){
			testDynamic(n);
		}
		
	}
	
	private static void testDynamic(int n){
		double time1=0;
		double time2=System.currentTimeMillis();
		
		time1=System.currentTimeMillis();
		System.out.println(fib(n));
		time1=System.currentTimeMillis()-time1;
		//End of recursion
		time2=System.currentTimeMillis();
		System.out.println(dynaFib(n));
		time2=System.currentTimeMillis()-time2;
		
		System.out.println("Recursion:"+time1+" Dynamic: "+time2);
		
	}
	
	private static int fib(int n){
		if(n==0 || n==1){
			return n;
		}
		else{
			return fib(n-1)+fib(n-2);
		}
	}
	
	private static int dynaFib(int n){
		int lookup[]= new int[n+1];
		lookup[0]=0;
		lookup[1]=1;
		for(int i=2;i<=n;i++){
			lookup[i]=lookup[i-1]+lookup[i-2];
		}
		
		return lookup[n];
	}

}
