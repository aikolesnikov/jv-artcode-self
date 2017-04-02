import java.util.Scanner;


class acb23_1_1{

	public static void SayHello(String str){
		System.out.println("Hi, " + str);
	}

	public static void main (String[] args){
		
	        Scanner input = new Scanner (System.in);   

		System.out.println("Кто ты ?:");      
		SayHello(input.next());

		int age = 0;
		System.out.println("Скока тибе?:");
		
		try { 
			age = input.nextInt();

			if ((age <= 0) || (age >=140))
				System.out.println("you are wizard");
			else
				if (age < 16)
					System.out.println("иди домой");
			else
				if (age < 30)
					System.out.println("иди бухай");
			else
				System.out.println("иди танцуй");
		}	

                catch (java.util.InputMismatchException e){                                                                                                                  
                        System.out.println("wrong");                                                                                                                         
                }  

	}

}
