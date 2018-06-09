class LoopFormats 
{
	public static void main(String[] args) 
	{
		System.out.println("LoopStarExample1");
		System.out.println();
		LoopStarExample1();
		System.out.println("LoopStarExample2");
		System.out.println();
		LoopStarExample2();
		System.out.println();
		System.out.println("LoopStarExample3");
		System.out.println();
		LoopStarExample3();
		System.out.println();
		System.out.println("LoopStarExample4");
		System.out.println();
		LoopStarExample4();
		System.out.println();
		System.out.println("LoopStarExample5");
		System.out.println();
		LoopStarExample5();
		System.out.println();
		System.out.println("LoopStarExample6");
		System.out.println();
		LoopStarExample6();
	}

	public static void LoopStarExample1(){
		int num = 5;
		for(int i = 1; i <= num; i++ ){
			
			for(int j = 1; j <= i; j++){
				System.out.println("*");
			}
			System.out.println();
		}	
	}

	public static void LoopStarExample2(){
		int num = 5;
		for(int i = 1; i <= num; i++ ){
		
			for(int j = num; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void LoopStarExample3(){
		for (int i = 5; i > 0; i--) {
            for (int j = i; j > 1; j--) {       
                System.out.print(" ");                        
            }
            for (int j = i; j < 5; j++) {       
                System.out.print("*");
            }
			
            for (int j = i; j <= 5; j++) {      
                System.out.print("*");
            }

			for (int j = i; j > 1; j--) {
                System.out.print(" ");
            }

			System.out.println();
		}
	}

	public static void LoopStarExample4(){
        for (int i = 5; i > 0; i--) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }                   
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }               
            for (int j = i; j > 1; j--) {
                System.out.print("*");
            }            
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }	
	}
	public static void LoopStarExample5(){
		for (int i = 5; i > 0; i--) {
            for (int j = i; j > 1; j--) {       
            	System.out.print(" ");	                      
            }
            for (int j = i; j < 5; j++) {       
            	System.out.print("*");
            }
            for (int j = i; j <= 5; j++) {      
            	System.out.print("*");
            }  
            for (int j = i; j > 1; j--) {
            	System.out.print(" ");
            }	
            System.out.print("n"); 		
		}

		for (int i = 5; i > 0; i--) {

			for (int j = i; j <= 5; j++) {
            	System.out.print(" ");
            }

			for (int j = i; j >= 2; j--) {
            	System.out.print("*");
            }

			for (int j = i; j > 2; j--) {
            	System.out.print("*");
            }

			for (int j = i; j <= 5; j++) {
            	System.out.print(" ");
            }

			System.out.println();
		}
	}

	public static void LoopStarExample6(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=(5-i); j++){
                System.out.print(" ");
            }
            for(int k=1; k<i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
	}
}
