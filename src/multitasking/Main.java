	package multitasking;

	import java.util.Scanner;
	import java.util.ArrayList;

	public class Main {
	
	private static ArrayList players = new ArrayList();  
			
	public static void main(String[] args) {

		Scanner nameScanner = new Scanner(System.in);
		System.out.println("enter your characters name");
		Player player1 = new Player(nameScanner.nextLine());
		
		players.add(player1);
		
		Player player2 = new Player("player2");
		Player player3 = new Player("player3");
		Player player4 = new Player("player4");	
		Player player5 = new Player("player5");
		
		
		players.add(player2);
		players.add(player3);
		players.add(player4);
		players.add(player5);
		
		System.out.println(players.size());
		
		System.out.println(player1.getName());
		
		
		System.out.println(player2.getFistdamage());
		player2.setFistDamage(100);
		System.out.println(player4.getFistdamage());
		
		System.out.println();

	}

}
