import java.io.BufferedReader;
import java.io.FileReader;

public class PuzzleSolver {

	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("res/puzzle.txt");
		@SuppressWarnings("resource")
		BufferedReader reader = new BufferedReader(file);
		int values = 0;

		String text = "";

		String line = reader.readLine();
		while (line != null) {
			text += line;
			line = reader.readLine();
		}

		String[] numberStrs = text.split(" ");
		int[] numbers = new int[numberStrs.length];
		for (int i = 0; i < numberStrs.length; i++) {
			numbers[i] = Integer.parseInt(numberStrs[i]);
			values++;
		}
		int lineLength = (int) Math.sqrt(values);

		int numCount = 0;

		System.out.println("This is your input: ");

		for (int i = 0; i < lineLength; i++) {
			for (int j = numCount; j < (numCount + lineLength); j++) {
				System.out.print(numbers[j] + " ");
			}
			System.out.print("\n");
			numCount += lineLength;

		}
		
		System.out.println( "\nWhich search would you like to us? ");
		System.out.println("1. BFS\n2. DFS\n3. A*\n4. IDA*");

	}

}
