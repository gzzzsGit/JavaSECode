class AriTest
{
	public static void main(String[] args){
			//除法
			int num1 = 12;
			int num2 = 5;
			System.out.println(num1/num2);//2
			System.out.println(num1/num2*num2);//10
			
			//取模
			int i1 = -12;
			int j1 = 5;
			System.out.println(i1%j1);//-2

			int i2 = 12;
			int j2 = -5;
			System.out.println(i2%j2);//2

			int i3 = -12;
			int j3 = -5;
			System.out.println(i3%j3);//-2
			
			//自增
			int a1 = 10;
			//两者编译结果完全相同
			a1++;
			++a1;
			System.out.println(a1);

			//方法一：
			short s1 = 10;
			s1 = (short)(s1 + 1);
			System.out.println(s1);

			//方法二：
			short s2 = 10;
			s2++;
			System.out.println(s2);
			
			//练习一：溢出
			byte b1 = 127;
			b1++;
			System.out.println(b1);//-128

			//练习二：自增
			int i = 1;
			int j = i++ + ++i * i++;
			System.out.println(j);//1+3*3 
	}
}