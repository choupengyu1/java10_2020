package javaSE;

public class Test2 {

	public static void main(String[] args) {
		// 基本数据类型的整数
		//byte(1个字节),short（两个字节）,int（四个字节）,long（八个字节）
        
		//-128 ~ 127
		//此处有类型转换
		byte a = 127;
		
		//-2^15 ~ 2^15-1
		//此处有类型转换
		short b = 32767;
		
		//-2^31 ~ 2^31-1
		int c = 2147483647;
		
		//-2^63 ~ 2^63-1
		//对于long型数据，如果超过int范围，后面加上L,建议用大写
		long d = 2147483647123L;
	}

}
