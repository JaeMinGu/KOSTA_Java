class OperatorExample {
	public static void main(String[] args)	{
		
		int x = 50, y = 20;
		
		// ��������� 
		System.out.println("��� : " + (x + y));  
		System.out.println("��� : " + x + y);
		
		System.out.println("��� : " + (x % y));
		System.out.println("��� : " + x % y);


		// ���մ��Կ����� 
		x += x + y;

		System.out.println(x);


		// �� ��ȯ ������ 
		double weight = 47.8475; 

		System.out.println(weight);
		System.out.println((int)weight);


		// ���������� 
		x = 100; 
		//System.out.println(x++); //100
		//System.out.println(++x); //102

		System.out.println(--x); //99
		System.out.println(x--); //99
		

		// ��Ʈ������ 
		x = 10; 
		System.out.println(x * 2 * 2 * 2);

		x=10; 
		System.out.println(x << 3); //80

		x=10; 
		System.out.println(x << 5); //320


		// ���ǻ��׿����� 
		int a = 7, b = 83, c = 8, max;
		
		max = (a > b) ? a : b; 
		max = (max > c) ? max : c;
		
		System.out.println(max);
		


	}
}