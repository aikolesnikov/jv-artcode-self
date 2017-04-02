class acb_1_2{

	public static void main (String[] args){

		double a = 7;
		double b = 10;
		double c = 5;

		double area = 0;
		double p = 0;
		
		p = (a + b + c)/2;
		area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		System.out.print("Triangle area is:");
		System.out.println(area);
		
	}



}
