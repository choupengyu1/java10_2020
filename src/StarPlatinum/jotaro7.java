package StarPlatinum;

public class jotaro7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ����ݣ��ж��������Ƿ������ꡣ
		int year = 2020;
		if(year%400 ==0){
			System.out.println("������");
		}
		else if(year%4==0 && year%100 !=0){
			System.out.println("������");
		}
		else{
			System.out.println("��������");
		}
	}

}
