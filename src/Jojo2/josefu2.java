package Jojo2;

public class josefu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��дһ���������������200����С��������
		minzhi(200);
		
	}
	public static int minzhi(int n)
	{
		for(int i=n;;i++){
			boolean a = true;
			for(int j=2;j<=i-1;j++){
				if(i%j==0){
					a = false;
					break;
				}
			}
			if(a){
				return i;
			}
			System.out.println();
		}
	}
}
