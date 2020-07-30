package javaSE;

public class Test3 {

	public static void main(String[] args) {
	  int a = 0xb51;
      System.out.println(a);
      
      //十进制转换其他进制
      System.out.println(Integer.toBinaryString(100));
      System.out.println(Integer.toHexString(100));
      System.out.println(Integer.toOctalString(100));
      
      System.out.println("\"我没有单引号\"");
	}

}
