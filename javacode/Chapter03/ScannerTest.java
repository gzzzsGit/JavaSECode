import java.util.Scanner;
class ScannerTest
{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������������");
		String name = scanner.next();
		System.out.println("�����������ߣ�");
		double height = scanner.nextDouble();
		System.out.println("������������أ�");
		int weight = scanner.nextInt();	
		System.out.println("���������Ƿ���");
		boolean isSingle = scanner.nextBoolean();
		System.out.println("����������Ա�");
		char gender = scanner.next().charAt(0);//charAt(0)��ȡ�ַ����ĵ�һ���ַ�
		System.out.println("name = "+name+" height = "+height+" weight = "+weight+" isSingle = "+isSingle+" gender = "+gender);
		scanner.close();
	}	
}