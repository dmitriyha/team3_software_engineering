package applications;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import threads.MainListenerThread;

public class ApplicationServerMain {
	JButton btnStopServer = null;
	JButton btnStartServer = null;
	MainListenerThread mainListenerThread;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationServerMain window = new ApplicationServerMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ApplicationServerMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Application Server");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		btnStartServer = new JButton("Start Server");
		btnStartServer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				System.out.println("Starting Application Server");
				// Add logging here; preferably using a proxy
				
				mainListenerThread = new MainListenerThread();
				btnStartServer.setEnabled(false);
				btnStopServer.setEnabled(true);
			}
		});
		GridBagConstraints gbc_btnStartServer = new GridBagConstraints();
		gbc_btnStartServer.insets = new Insets(0, 0, 0, 5);
		gbc_btnStartServer.gridx = 1;
		gbc_btnStartServer.gridy = 1;
		frame.getContentPane().add(btnStartServer, gbc_btnStartServer);

		btnStopServer = new JButton("Stop Server");
		btnStopServer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				mainListenerThread.interrupt();
				btnStartServer.setEnabled(true);
				btnStopServer.setEnabled(false);
				
			}
		});

		GridBagConstraints gbc_btnStopServer = new GridBagConstraints();
		gbc_btnStopServer.insets = new Insets(0, 0, 0, 5);
		gbc_btnStopServer.gridx = 3;
		gbc_btnStopServer.gridy = 1;
		frame.getContentPane().add(btnStopServer, gbc_btnStopServer);
	}
}
