import java.util.Scanner;
class ScannerTest
{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的网名：");
		String name = scanner.next();
		System.out.println("请输入你的身高：");
		double height = scanner.nextDouble();
		System.out.println("请输入你的体重：");
		int weight = scanner.nextInt();	
		System.out.println("请输入你是否单身：");
		boolean isSingle = scanner.nextBoolean();
		System.out.println("请输入你的性别：");
		char gender = scanner.next().charAt(0);//charAt(0)读取字符串的第一个字符
		System.out.println("name = "+name+" height = "+height+" weight = "+weight+" isSingle = "+isSingle+" gender = "+gender);
		scanner.close();
	}	
}