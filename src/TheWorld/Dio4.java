package TheWorld;

public class Dio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 8,b = 12,result = 0;
		for(int i = 1;i<=b;i++){
			if(b%i==0 && a%i==0){
				result = i;
			}
		}
		System.out.println(result);
	}

}
