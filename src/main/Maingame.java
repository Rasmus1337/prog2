/**
 * 
 */
package main;

import javax.swing.JFrame;

/**
 * @author rasmus.johansson11
 *
 */
public class Maingame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		creatAndShowGuI();
	}

	private static void creatAndShowGuI() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new GamePanel());
		frame.pack();
		frame.setVisible(true);
}
	
}
