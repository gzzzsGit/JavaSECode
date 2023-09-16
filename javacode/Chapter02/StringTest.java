/*
1. 基本数据类型和String的运算
2. 使用一对""进行赋值
3. String 内部可以是0个，1个或多个字符
4. String与基本数据类型(包括boolean)只能做连接运算，即"+"
*/
class StringTest
{
	public static void main(String[] args){
		String str1 = "hellow";
		System.out.println("str1:"+str1);
		
		String str2 = "";
		String str3 = "a";//跟char c1 = 'a'不是一个概念
		
		int num = 10;
		boolean b1 = true;
		System.out.println(str1+num+b1);
		
		float f1 = 14.22f;
		String res = str1 + f1 + true + num;//需要用String来存储结果
		System.out.println(res);
		
		//编译报错,二元运算符 '+' 的操作数类型错误
		//boolean类型和其他基本类型不能直接运算
		//String error = f1 + b1 +str1;

	}
}