class FloatDouble
{
	public static void main(String[] args){
		//����Բ���ʵı���
		double pi = 3.14;
		
		//��������Բ��ֱ��
		double radius1 = 1.2;
		double radius2 = 2.5;
		int radius3 = 6;
		
		System.out.println("Բ1�İ뾶="+radius1+",���Ϊ��"+pi*radius1*radius1);
		System.out.println("Բ2�İ뾶="+radius2+",���Ϊ��"+pi*radius2*radius2);
		System.out.println("Բ3�İ뾶="+radius3+",���Ϊ��"+pi*radius3*radius3);

		//�����float
		float radius4 = 2.5f, p = 3.14f;
		System.out.println("Բ3�İ뾶="+radius4+",���Ϊ��"+p*radius4*radius4);
	}	
}