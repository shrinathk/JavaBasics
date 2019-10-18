import java.util.ArrayList;

public class FibonacciSequence {

	public static void main(String[] args) {
		
		
		FibonacciSequence fs = new FibonacciSequence();
		System.out.println(fs.sequenceGenerator(0));
		

	}
	

	public ArrayList<Integer> sequenceGenerator(int count) {
		
		ArrayList<Integer> sequence = new ArrayList<Integer>();
		int firstNumber = 0;		
		int secondNumber = 1;		
		int thirdNumber = 1;		
		
		if(count <= 0 )
		{
			System.out.println(("Count MUST BE greater than 0."));
			return new ArrayList<Integer>();
		}
		
		if(count == 1)
		{
			sequence.add(firstNumber);
			return  sequence;
		}
		
		if(count == 2)
		{
			sequence.add(firstNumber);
			sequence.add(secondNumber);
			return  sequence;
		}
		
		if(count == 3)
		{
			sequence.add(firstNumber);
			sequence.add(secondNumber);
			sequence.add(thirdNumber);
			return  sequence;
		}
			
		sequence.add(firstNumber);
		sequence.add(secondNumber);
		sequence.add(thirdNumber);
		
		
		for(int i = 4 ; i <= count ; i++) {
			
			int sum = secondNumber + thirdNumber;
			
			sequence.add(sum);
			
			secondNumber = thirdNumber;
			thirdNumber = sum;
			
		}
		
		return sequence;
		
	}

}
