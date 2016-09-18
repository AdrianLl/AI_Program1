import java.io.BufferedReader;
import java.io.FileReader;

public class PuzzleSolver {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileReader file = new FileReader("res/puzzle.txt");
		BufferedReader reader = new BufferedReader(file);
		int values = 0;

		String text = "";

		String line = reader.readLine();
		while (line != null) {
			text += line;
			line = reader.readLine();
		}

		System.out.println(text);

		String[] numberStrs = text.split(" ");
		int[] numbers = new int[numberStrs.length];
		for (int i = 0; i < numberStrs.length; i++) {
			numbers[i] = Integer.parseInt(numberStrs[i]);
			values++;
		}
		
		int lineLength = (int)Math.sqrt(values-1);
		int numCount = 0;
		
		for(int i = 0;i<numbers.length;i++){
			for(int j=0;j<lineLength;j++){
				System.out.print(numbers[j]);
			}
			for(int j=numCount;j<(numCount+lineLength);j++){
				System.out.print(numbers[j]);
			}
			for(int j=numCount;j<(numCount+lineLength);j++){
				System.out.print(numbers[j]);
			}
		}
		

		
		

		System.out.println("This is your input: " + values + lineLength);

	}

}
