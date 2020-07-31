package StarPlatinum;

public class jotaro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//假设某员工今年的年薪是30000元，年薪的年增长率6%。
		//编写一个Java应用程序计算该员工10年后的年薪，并统计未来10年（从今年算起）总收入。
		double a = 30000;
		double c = 30000;
		for(int i =1;i<=10;i++){
			a = a*(1+0.6);
			c = c+a;
		}
		System.out.println(c);
		System.out.println(a);
		/*double x = 30000;
		
	       double sum=0;
	       
	       for(int i=0;i<10;i++){
	    	   
	    	   x = x *(1+0.06);
	    	   
	    	   sum =sum + x;  
	    	   
	       }
	       
	       System.out.println("第10年的年薪为"+sum);*/
	}
}
