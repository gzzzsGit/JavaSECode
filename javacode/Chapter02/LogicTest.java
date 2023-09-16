class LogicTest
{
	public static void main(String[] args){
		//相同点：都是表示与
		boolean b1 = true;
		int num1 = 1;
		if (b1 & num1++>0)
			System.out.println("我爸是李刚");//我爸是李刚
		else
			System.out.println("西红柿蛋汤");
		System.out.println(num1);//2
		boolean b2 = true;
		int num2 = 1;
		if (b2 && num2++>0)
			System.out.println("我爸是李刚");//我爸是李刚	
		else
			System.out.println("西红柿蛋汤");
		System.out.println(num2);//2

		//不同点：&&第一个条件不满足后就跳出了，后面的不会执行
		b1 = false;
		num1 = 1;
		if (b1 & num1++>0)
			System.out.println("我爸是李刚");
		else
			System.out.println("西红柿蛋汤");//西红柿蛋汤
		System.out.println(num1);//2
		b2 = false;
		num2 = 1;
		if (b2 && num2++>0)
			System.out.println("我爸是李刚");	
		else
			System.out.println("西红柿蛋汤");//西红柿蛋汤
		System.out.println(num2);//1


		//******************************************
		//不同点：||第一个满足后就跳出了不会执行后面的	
		boolean b3 = true;
		int num3 = 1;
		if (b3 | num3++>0)
			System.out.println("我爸是李刚");//我爸是李刚
		else
			System.out.println("西红柿蛋汤");
		System.out.println(num3);//2
		boolean b4 = true;
		int num4 = 1;
		if (b4 || num4++>0)
			System.out.println("我爸是李刚");//我爸是李刚	
		else
			System.out.println("西红柿蛋汤");
		System.out.println(num4);//1
		
		//相同点：
		b3 = false;
		num3 = 1;
		if (b3 | num3++>0)
			System.out.println("我爸是李刚");//我爸是李刚
		else
			System.out.println("西红柿蛋汤");
		System.out.println(num3);//2
		b4 = false;
		num4 = 1;
		if (b4 || num4++>0)
			System.out.println("我爸是李刚");//我爸是李刚	
		else
			System.out.println("西红柿蛋汤");
		System.out.println(num4);//2
	}
}