class WhileExample {
	public static void main(String[] args)	{
		
		int i = 0; // i : index
		
		while(i < 10){
			System.out.println(i + " " + "KOSTA 187�� ȭ����!");
			i++;
		}


		// ���� �� ���ϱ� 
		i = 0;
		int sum = 0, oddSum = 0, evenSum = 0; 

		while(i <= 100){
			
			if(i %2 != 0){ //Ȧ�� 
				oddSum += i; 
			}else{ //¦��
				evenSum += i; 
			} 
			i++;
		}

		System.out.println("\n��ü �� : " + (oddSum + evenSum));
		System.out.println("Ȧ�� �� : " + oddSum);
		System.out.println("¦�� �� : " + evenSum);
		
		


		
	
	}
}
