class PrimeNumTest
{
	public static void main(String[] args){
		int N = 10000;
		int primeNum = 0;
		Boolean isPrime = true;
		long begin = System.currentTimeMillis();
		for (int i=2;i<N ;i++ )
		{
			for (int j=3;j<Math.sqrt(i);j++)
			{
				if (i%j==0)
				{
					isPrime = false;
					break;
				}
			}
			if (isPrime)
			{
				primeNum +=1;
			}
			isPrime = true;
			
		}
		long end = System.currentTimeMillis();
		System.out.println(end-begin);
		System.out.println(primeNum);
	}
}