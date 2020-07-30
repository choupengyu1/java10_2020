package TheWorld;

public class Dio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12345;
		for(int i=0;;i++){
			a = a/10;
			if(a==0){
				System.out.println(i);
				break;
			}
		}
	}

}
