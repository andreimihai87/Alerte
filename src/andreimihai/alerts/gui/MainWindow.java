/**
 * 
 */
package andreimihai.alerts.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 */
public class MainWindow extends JFrame {
	
	private JMenuBar menuBar;
	private JMenu menu;
	
	private JPanel current = null;

	public MainWindow() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension dimension = new Dimension(600, 400);
		
		setPreferredSize(dimension);
		setMaximumSize(dimension);
		setMinimumSize(dimension);

		setLayout(new BorderLayout());
		
		createMenu();
		
		loadSomething();
		
		pack();
	}
	
	private void createMenu() {
		// 
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//
		menu = new JMenu("Options");
		menuBar.add(menu);
		
		//
		JMenuItem openCategories = new JMenuItem("Categories");
		
		
		JMenuItem openAbout = new JMenuItem("About");
		openAbout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				loadWindowAbout();
			}
		});
		
		JMenuItem openAddAlert = new JMenuItem("Add Alert");
		openAddAlert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				loadWindowAddAlert();
			}
		});
		
		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		menu.add(openCategories);
		menu.add(openAddAlert);
		menu.addSeparator();
		menu.add(openAbout);
		menu.add(exit);
	}

	private void loadWindowAbout() {
		if (current != null) {
			remove(current);
		}
		current = new WindowAbout();
		add(current, BorderLayout.CENTER);
		revalidate();
		repaint();
	}
	
	private void loadWindowAddAlert() {
		if (current != null) {
			remove(current);
		}
		current = new WindowAddAlert();
		add(current, BorderLayout.CENTER);
		revalidate();
		repaint();
	}
	
	private void loadSomething() {
		current = new WindowAddAlert();
		add(current, BorderLayout.CENTER);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MainWindow().setVisible(true);
			}
		});

	}

}
