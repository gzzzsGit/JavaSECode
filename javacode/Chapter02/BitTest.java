class BitTest
{
	public static void main(String args[]){
		//����
		int num = 11;
		System.out.println(num<<1);//22
		System.out.println(num>>1);//5
		
		//����
		int num1 = -11;
		//1000 1011->1111 0101
		System.out.println(num1<<1);//-22
		//1111 1010->1000 0101
		System.out.println(num1>>1);//-6
		System.out.println(num1/2);//-5
	}
}