import java.util.Scanner;
class Butterfly 
{
	public static void main(String[] args) 
	{
			//int num,i,j;
			String ms;
			/*Scanner sc = new Scanner(System.in);  
			 
			System.out.println("Enter your number: ");
			ms = sc.next();
			num = sc.nextInt();  */
			for(int j = 0; j < 2; j++){
				System.out.print("A");
			}
			System.out.println();
			for(int i = 1;i < 4; i++){
				for(int j = 0; j < 4; j++){

					if(i%2 == 0){
						System.out.print("B");
					}else{
						if( j % 3 == 0){
							System.out.print("B");
						}else{
							System.out.print(".");
						}
					}
					
				}

				System.out.println();
			}

			System.out.println();
			for(int i = 1;i <= 5; i++){
				for(int j = 0; j < 6; j++){

					if(i == 3){
						System.out.print("C");
					}else{
			
						if( i % 2 == 0 ){
							if( j % 3 == 2){
								System.out.print(".");
							}else{
								System.out.print("C");
							}						
						}else{
							if( j % 5 == 0){
								System.out.print("C");
							}else{
								System.out.print(".");
							}					
						}


					}
					
				}

				System.out.println();
			}
			//sc.close();  
	}
}
