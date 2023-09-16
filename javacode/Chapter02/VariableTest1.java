/*
测试基本数据类型间的运算规则，这里不包含boolean类型
运算规则包括：
1.自动类型提升
2.强制类型转换
*/

class VariableTest1
{
	public static void main(String[] args){
		//byte、short、char-> int-> long-> float-> double
		byte b1 = 2;
		short s1 = b1;
		int i1 = s1;
		long l1 = i1;
		float f1 = l1;
		double d1 = f1;
		System.out.println(d1);

		//特殊情况1：byte、short之间做运算，
		//编译不通过,从int转换到short可能会有损失
		//short s2 = b1+s1;
		int i2 = b1+s1;
		System.out.println(i2);

		//编译不通过,从int转换到short可能会有损失
		//byte b2 = b1+b1;
		int i3 = b1+b1;
		System.out.println(i3);
		
		//特殊情况2:char
		char c1 = 'a';
		//编译不通过,从int转换到char可能会有损失
		//char c2 = c1+b1;
		int i4 = c1+b1;;
		System.out.println(i4);//99

		//*************************************
		long l2 = 132L;
		long l3 = 132;//理解为自动类型提升(int->long)
		
		//编译不通过,132132132132超出了int类型范围
		//long l4 = 132132132132;
		long l4 = 132132132132L;
		
		//编译不通过,不满足自动类型提升的规则(double->float)
		//float = 1.32;
		

		//强制类型转换
		short s2 = (short)l3;
		System.out.println(s2);

		//精度损失1:
		float f3 = 3.3f;
		int i5 = (int)f3;
		System.out.println(i5);//3

		//精度损失2:
		long l5 = 128;
		byte b2 = (byte)l5;
		System.out.println(b2);//1000 0000 的补码是-128

		//函数调用：
		short s3 = 13;
		calculate((int)s3);

	}
	public static void calculate(int num){
		System.out.println("this num is:"+num);
	}
}