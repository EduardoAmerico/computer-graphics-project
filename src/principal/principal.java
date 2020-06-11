package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class principal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal window = new principal();
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
	public principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1043, 712);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(Color.WHITE);
		panel.setBounds(26, 42, 259, 170);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("X:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(67, 21, 11, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblRaio = new JLabel("Raio:");
		lblRaio.setFont(new Font("Arial", Font.PLAIN, 11));
		lblRaio.setBounds(53, 46, 25, 14);
		panel.add(lblRaio);
		
		JLabel lblVelocidade = new JLabel("Velocidade:");
		lblVelocidade.setBounds(20, 71, 58, 14);
		panel.add(lblVelocidade);
		
		JLabel lblY = new JLabel("Y:");
		lblY.setFont(new Font("Arial", Font.PLAIN, 12));
		lblY.setBounds(134, 21, 20, 14);
		panel.add(lblY);
		
		JLabel lblngulo = new JLabel("\u00C2ngulo:");
		lblngulo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblngulo.setBounds(134, 46, 42, 29);
		panel.add(lblngulo);
		
		JLabel lblDireo = new JLabel("Dire\u00E7\u00E3o:");
		lblDireo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDireo.setBounds(134, 71, 48, 14);
		panel.add(lblDireo);
		
		JLabel lblNewLabel = new JLabel("Entrada de Dados");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel.setBounds(26, 17, 183, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(401, 42, 400, 400);
		frame.getContentPane().add(panel_1);
	}
}

