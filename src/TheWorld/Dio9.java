package TheWorld;

public class Dio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������������һ��4λ�������󽫸�����ת�Ժ������
		// ��ԭ��Ϊ1234����ת�����λ4321��
		
		 /* int a =5678; int i= a/1000;
		  int j= a/100%10;
		  int x= a/10%10; 
		  int y=a%10;
		  System.out.println(y+""+x+""+j+""+i);
		 */
		int a = 1234;
		for(int i =0;i<=3;i++){
			int b = a%10;
			System.out.print(b);
			a/=10;
		}
	}

}
