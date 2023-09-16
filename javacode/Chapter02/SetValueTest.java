class SetValueTest
{
	public static void main(String[] args){
		
		//连续赋值
		int a1,b1;
		a1 = b1 = 10;
		System.out.println("a1:"+a1+"\tb1:"+b1);

		//操作方式2：
		int a2 = 10,b2 =10;
		System.out.println("a2:"+a2+"\tb2:"+b2);
		
		//+= -= *= /=
		int i = 5;
		i += 5;//类似于i=i+5
		System.out.println(i);

		//区别:+= -= *= /=运算不会改变数据类型
		byte j = 5;
		j += 5;
		//j =j+5 编译不通过
		System.out.println(j);

		int x = 1;
		x*=0.1;//相当于x = (int)(x*0.1)
		System.out.println(x);//0

		//练习：
		int i1 = 10;
		i1 += i++ + ++i;
		System.out.println(i1);//32
	}
}