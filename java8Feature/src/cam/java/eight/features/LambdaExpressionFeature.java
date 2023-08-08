package cam.java.eight.features;


interface Calculator {
//	void switchOn();
//	void sum(int input);
	int substract(int i1, int i2);
}

public class LambdaExpressionFeature  {

	public static void main(String[] args) {
		
		
//		Calculator calculator = ()-> {
//			System.out.println("inside switchOn method");
//			   };
//			calculator.switchOn();
		
		
		
//		Calculator calculator = (int input)->{
//			System.out.println(("sum: "+input));
//		};
//		calculator.sum(20);
		
		
//		Calculator calculator = (int i1, int i2) -> {
//			return i1 - i2;
//		};
//		System.out.println(calculator.substract(20, 7)); 
		
		
		
		Calculator calculator = (int i1, int i2) -> {
			if(i1 < i2) {
				throw new RuntimeException("cant do it");
				
			}else {
				return i1 -i2;
			}
		};
		System.out.println(calculator.substract(2, 7)); 
		

		
		
		
		
		//Parameter     expression     method-body
		// ()              ->            {body};  
	}

}
