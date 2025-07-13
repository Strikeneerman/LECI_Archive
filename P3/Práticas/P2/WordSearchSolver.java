
import java.io.File;
import java.util.Scanner;

public class WordSearchSolver {
	private String[] puzzle;
	private String[] words;
	
	public WordSearchSolver(String filePath) {
		try {
			File file = new File(filePath);
			Scanner sc = new Scanner(file);

			String firstLine = sc.nextLine();
			int puzzleSize = firstLine.length();
			
			puzzle = new String[puzzleSize];
			puzzle[0] = firstLine;
			
	        for (int i = 1; i < puzzleSize; i++) {
	        		puzzle[i] = sc.nextLine();
	        }

	        String temp = "";
	        while(sc.hasNextLine()) {
	        		temp += sc.nextLine() + " ";
	        }
	        words = temp.toUpperCase().split(", |; | |,|;");
	        
	        sc.close();
			
		} catch (Exception e) {
	        System.out.println("O path fornecido não é valido ,ou é impossivel ler o ficheiro");
		}
	}
	
	public void listWordPuzzle() {
		
		System.out.println("Puzzle: ");
		for(String s : puzzle) {
			System.out.println("\t"+ s);
		}
		System.out.println("Palavras: ");
		for(String s : words) {
			System.out.println("\t"+ s + "\t|   " + solveWord(s));
		}
	}
	
	private WordPosition solveWord(String word) {
		int x = 0, y = 0;
		Direction wordDirection = Direction.notFound;
		
		 do {

			if (puzzle[y].charAt(x) == word.charAt(0)) {
				wordDirection = checkWord(word, x, y);
			}
				
			if (x+1 >= puzzle.length) {
				x = 0;
				y++;
			} else {
				x++;
			}
			
			if (y >= puzzle.length) break;
			
		}  while (wordDirection.equals(Direction.notFound));
		
		return new WordPosition(y+1, x, wordDirection); 
	}
	
	private Direction checkWord(String word, int x, int y) {
		int[] possibleDirection = {-1, 0, 1};
		int j = 0, k = 0;
		int currentY = y, currentX = x;
		for (int i = 1; i < word.length(); i++) {
			
			int newYCoord = currentY+possibleDirection[j], newXCoord = currentX+possibleDirection[k];
			
			if ((newXCoord < 0 || newYCoord < 0) || (newXCoord >= puzzle.length || newYCoord >= puzzle.length) 
					|| (puzzle[newYCoord].charAt(newXCoord) != word.charAt(i))) { 
				i = 0; 
				currentY = y; 
				currentX = x;
				
				if (k < possibleDirection.length-1) {
					k++;
				} else if (j < possibleDirection.length-1) {
					j++; 
					k = 0;
				} else {
					return Direction.notFound;
				}
				
			} else {
				currentY = newYCoord;
				currentX = newXCoord;
			}
		}
		return Direction.coordsToDirection(possibleDirection[k], -possibleDirection[j]); 
	}

}
