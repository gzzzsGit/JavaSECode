class CharTest
{
	public static void main(String[] args){
		//表示形式1：使用一对''表示，内部有仅有一个字符
		char c1 = 'γ';
		System.out.println("char1="+c1);

		//编译不通过
		//char c1 = '';
		
		//表示形式2：直接通过Unicode编码值来表示
		char c2 = '\u0036';
		System.out.println("char2="+c2);
		
		//表示形式3：通过转义字符表示\+其他字符
		char c3 = '\''; //单引号
		System.out.println("char3="+c3);
		char c4 = '\\';
		System.out.println("char4="+c4);

		//表示形式4：使用具体字符对应的数值(ASCII码)
		char c5 = 97;
		char c6 = '9';
		System.out.println("char5="+c5);
		System.out.println("char6="+c6);
	}	
}