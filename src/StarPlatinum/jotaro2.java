package StarPlatinum;

public class jotaro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ĳԱ���������н��30000Ԫ����н����������6%��
		//��дһ��JavaӦ�ó�������Ա��10������н����ͳ��δ��10�꣨�ӽ������������롣
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
	       
	       System.out.println("��10�����нΪ"+sum);*/
	}
}
