package lesson.switchs;

import java.util.ArrayList;

public class MainMaze {

	private final static String MAZE = 
			              "##############################\n"
						+ "#         #             ######\n"
						+ "##  # ##    #  # #      ######\n" 
						+ "#   ##   #  #      #    ######\n"
						+ "#   # #    #  #   #  #  # ####\n"
						+ "#   # #    #  #   #  #  # ####\n"
						+ "#   # #    #  #   #  #  # ####\n"
						+ "#   # #    #  #   #  #  # ####\n"
						+ "#   # #    #  #   #  #  # ####\n" 
						+ "#   # #    #  #           ####\n"
						+ "S   #              #  #      G\n"
						+ "##############################\n";
	private static int startx;
	private static int startY;
	
	private static int endX;
	private static int endY;
	private static ArrayList<ArrayList<Character>> arrayMaze;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MAZE);
		parsMaze();
		drawMaze();

	}

	public static void parsMaze() {
		int x = 0;
		int y = 0;
		ArrayList<Character> row = new ArrayList<>();
		arrayMaze = new ArrayList<>();
		for (char cell : MAZE.toCharArray()) {
			switch (cell) {
			case '#':
				row.add(cell);
				x++;
				break;
			case ' ':
				row.add(' ');
				x++;
				break;
			case 'S':
				row.add('S');
				startx = x;
				startY = y;
				x++;
				break;
			case 'G':
				row.add('G');
				endX = x;
				endY = y;
				x++;
				break;
			case '\n':
				arrayMaze.add(row);
				row = new ArrayList<>();
				y++;
				x = 0;
				break;
			}
		}

	}
	
	public static void drawMaze() {
		for(ArrayList<Character> row : arrayMaze) {
			for(char cell : row) {
				if (cell =='#') {
					cell = '\u2588';
			}
				System.out.print(cell);
				System.out.print(cell);
		}
		System.out.println();	
	}
	
}
}	