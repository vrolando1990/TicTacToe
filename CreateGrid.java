import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CreateGrid implements ActionListener {

	int x = 1;
	JFrame frame = new JFrame("Tic-Tac-Toe"); // Creates a window NAMED: Tic-Tac-Toe
	JButton[][] grid; // 2D array of buttons - Will function as our grid

	public CreateGrid(int width, int length) {

		frame.setLayout(new GridLayout(width, length));
		// GridLayout - Used to make a grid of columns and rows of equal length and
		// width
		// SetLayout - Adds the grid layout to the JFrame window

		grid = new JButton[width][length]; // allocate the size of grid

		for (int y = 0; y < length; y++) {
			for (int x = 0; x < width; x++) {
				grid[x][y] = new JButton("OPEN");
				grid[x][y].addActionListener(this);
				grid[x][y].setBackground(Color.decode("#7FB3D5"));
				frame.add(grid[x][y]); // adds button to grid
			}
		}

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // What to do when the window is closed
		frame.setSize(500, 500); // Sets the size of the window
		frame.setLocationRelativeTo(null); // Makes the screen open in the center of the display
		frame.setVisible(true); // Makes the window open/visible

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		boolean winner = false;

		while (!winner) {
			if (x == 0) {
				((JButton) e.getSource()).setBackground(Color.decode("#48C9B0"));
				System.out.println((JButton) e.getSource());
				x = 1;
				break;
			} else if (x == 1) {
				((JButton) e.getSource()).setBackground(Color.decode("#EC7063"));
				x = 0;
				break;
			}
		}

	}
}