class MethodExample {
	
	//method1 - instance method 
	static void printMessage(String name, String message){
		System.out.println("[" + name + "] : " + message); 
	}

	//method2 - instance method 
	static int sum(int x, int y, int z){
		return x + y + z; 
	}
	

	//method3 - instance method 
	static void printGugudan(int dan){
		
		for(int i=1; i<=9; i++){ 
			for(int j=2; j<=dan; j++){
				System.out.print(j + "*" + i + "=" + (i*j) + "  ");
			}
			System.out.println();
			
		}
	}



	//entry point - static method, class method
	public static void main(String[] args)	{
		String name = "최재민";
		String message = "안녕하세요.";

		printMessage(name, message); //method1, method2에 static 붙여야 실행됨
		
		
		int result = sum(85, 75, 94);	//결과를 담기위한 int result 필요 
		System.out.println(result);
		System.out.println(sum(85, 75, 94)); //결과 같음 
		
		printGugudan(5);
		printGugudan(9);	
		
		

	}//main


}//class
