class FloatDouble
{
	public static void main(String[] args){
		//定义圆周率的变量
		double pi = 3.14;
		
		//定义三个圆的直径
		double radius1 = 1.2;
		double radius2 = 2.5;
		int radius3 = 6;
		
		System.out.println("圆1的半径="+radius1+",面积为："+pi*radius1*radius1);
		System.out.println("圆2的半径="+radius2+",面积为："+pi*radius2*radius2);
		System.out.println("圆3的半径="+radius3+",面积为："+pi*radius3*radius3);

		//如果用float
		float radius4 = 2.5f, p = 3.14f;
		System.out.println("圆3的半径="+radius4+",面积为："+p*radius4*radius4);
	}	
}