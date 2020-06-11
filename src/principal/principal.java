package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.ImageIcon;

public class principal {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_15;
	private JTextField textField_13;
	private JTextField textField_14;

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
		frame.getContentPane().setFont(new Font("Arial", Font.PLAIN, 12));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1146, 769);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(Color.WHITE);
		panel.setBounds(26, 42, 334, 150);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("X:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(77, 21, 11, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblRaio = new JLabel("Raio:");
		lblRaio.setFont(new Font("Arial", Font.PLAIN, 12));
		lblRaio.setBounds(59, 46, 29, 14);
		panel.add(lblRaio);
		
		JLabel lblVelocidade = new JLabel("Velocidade:");
		lblVelocidade.setFont(new Font("Arial", Font.PLAIN, 12));
		lblVelocidade.setBounds(23, 71, 65, 14);
		panel.add(lblVelocidade);
		
		JLabel lblY = new JLabel("Y:");
		lblY.setFont(new Font("Arial", Font.PLAIN, 12));
		lblY.setBounds(234, 21, 12, 14);
		panel.add(lblY);
		
		JLabel lblngulo = new JLabel("\u00C2ngulo:");
		lblngulo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblngulo.setBounds(204, 46, 42, 14);
		panel.add(lblngulo);
		
		JLabel lblDireo = new JLabel("Dire\u00E7\u00E3o:");
		lblDireo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDireo.setBounds(198, 71, 48, 14);
		panel.add(lblDireo);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 12));
		textField.setBounds(98, 18, 58, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Inserir");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.setBounds(224, 99, 90, 32);
		panel.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(98, 43, 58, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(98, 68, 58, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(256, 18, 58, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(256, 43, 58, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_5.setColumns(10);
		textField_5.setBounds(256, 68, 58, 20);
		panel.add(textField_5);
		
		JLabel lblNewLabel = new JLabel("Entrada de Dados");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel.setBounds(126, 17, 129, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(376, 42, 400, 400);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(26, 228, 162, 97);
		frame.getContentPane().add(panel_2);
		
		JLabel label = new JLabel("X:");
		label.setFont(new Font("Arial", Font.PLAIN, 12));
		label.setBounds(20, 20, 11, 14);
		panel_2.add(label);
		
		JLabel label_3 = new JLabel("Y:");
		label_3.setFont(new Font("Arial", Font.PLAIN, 12));
		label_3.setBounds(86, 20, 12, 14);
		panel_2.add(label_3);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_6.setColumns(10);
		textField_6.setBounds(41, 17, 35, 20);
		panel_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_7.setColumns(10);
		textField_7.setBounds(108, 17, 35, 20);
		panel_2.add(textField_7);
		
		JButton btnTraslandar = new JButton("Traslandar");
		btnTraslandar.setForeground(Color.BLACK);
		btnTraslandar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnTraslandar.setBackground(Color.BLACK);
		btnTraslandar.setBounds(20, 45, 123, 29);
		panel_2.add(btnTraslandar);
		
		JLabel lblFunoDeTransformao = new JLabel("Fun\u00E7\u00E3o de Transforma\u00E7\u00E3o");
		lblFunoDeTransformao.setFont(new Font("Arial", Font.PLAIN, 16));
		lblFunoDeTransformao.setBounds(107, 203, 192, 14);
		frame.getContentPane().add(lblFunoDeTransformao);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(198, 228, 162, 97);
		frame.getContentPane().add(panel_3);
		
		JLabel label_1 = new JLabel("X:");
		label_1.setFont(new Font("Arial", Font.PLAIN, 12));
		label_1.setBounds(20, 20, 11, 14);
		panel_3.add(label_1);
		
		JLabel label_2 = new JLabel("Y:");
		label_2.setFont(new Font("Arial", Font.PLAIN, 12));
		label_2.setBounds(86, 20, 12, 14);
		panel_3.add(label_2);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_8.setColumns(10);
		textField_8.setBounds(41, 17, 35, 20);
		panel_3.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_9.setColumns(10);
		textField_9.setBounds(108, 17, 35, 20);
		panel_3.add(textField_9);
		
		JButton btnEscalonar = new JButton("Escalonar");
		btnEscalonar.setForeground(Color.BLACK);
		btnEscalonar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnEscalonar.setBackground(Color.BLACK);
		btnEscalonar.setBounds(20, 45, 123, 29);
		panel_3.add(btnEscalonar);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(26, 345, 334, 97);
		frame.getContentPane().add(panel_4);
		
		JLabel label_4 = new JLabel("X:");
		label_4.setFont(new Font("Arial", Font.PLAIN, 12));
		label_4.setBounds(171, 48, 11, 14);
		panel_4.add(label_4);
		
		JLabel label_5 = new JLabel("Y:");
		label_5.setFont(new Font("Arial", Font.PLAIN, 12));
		label_5.setBounds(237, 48, 12, 14);
		panel_4.add(label_5);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_10.setColumns(10);
		textField_10.setBounds(192, 45, 35, 20);
		panel_4.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_11.setColumns(10);
		textField_11.setBounds(259, 45, 35, 20);
		panel_4.add(textField_11);
		
		JButton button = new JButton("Traslandar");
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Arial", Font.PLAIN, 12));
		button.setBackground(Color.BLACK);
		button.setBounds(20, 45, 123, 29);
		panel_4.add(button);
		
		JLabel lblngulo_1 = new JLabel("\u00C2ngulo:");
		lblngulo_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblngulo_1.setBounds(20, 17, 47, 14);
		panel_4.add(lblngulo_1);
		
		JLabel lblCentroDeRotao = new JLabel("Centro de Rota\u00E7\u00E3o:");
		lblCentroDeRotao.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCentroDeRotao.setBounds(170, 17, 124, 14);
		panel_4.add(lblCentroDeRotao);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_12.setColumns(10);
		textField_12.setBounds(77, 14, 58, 20);
		panel_4.add(textField_12);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(796, 42, 324, 318);
		frame.getContentPane().add(panel_5);
		
		JLabel lblRelatorio = new JLabel("Relat\u00F3rio");
		lblRelatorio.setFont(new Font("Arial", Font.PLAIN, 16));
		lblRelatorio.setBounds(922, 371, 65, 14);
		frame.getContentPane().add(lblRelatorio);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(796, 399, 324, 247);
		frame.getContentPane().add(panel_6);
		
		JLabel lblFunesDeRastreamento = new JLabel("Fun\u00E7\u00F5es de Rastreamento");
		lblFunesDeRastreamento.setFont(new Font("Arial", Font.PLAIN, 16));
		lblFunesDeRastreamento.setBounds(294, 453, 192, 14);
		frame.getContentPane().add(lblFunesDeRastreamento);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(26, 478, 251, 97);
		frame.getContentPane().add(panel_7);
		
		JButton btnAviesPrximoAo = new JButton("Avi\u00F5es Pr\u00F3ximo ao Aeroporto");
		btnAviesPrximoAo.setForeground(Color.BLACK);
		btnAviesPrximoAo.setFont(new Font("Arial", Font.PLAIN, 12));
		btnAviesPrximoAo.setBackground(Color.BLACK);
		btnAviesPrximoAo.setBounds(20, 45, 214, 29);
		panel_7.add(btnAviesPrximoAo);
		
		JLabel lblDistanciaMinima = new JLabel("Dist\u00E2ncia M\u00EDnima:");
		lblDistanciaMinima.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDistanciaMinima.setBounds(20, 17, 97, 14);
		panel_7.add(lblDistanciaMinima);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_15.setColumns(10);
		textField_15.setBounds(127, 14, 60, 20);
		panel_7.add(textField_15);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(294, 478, 210, 97);
		frame.getContentPane().add(panel_8);
		
		JButton btnAviesPrximos = new JButton("Avi\u00F5es Pr\u00F3ximos");
		btnAviesPrximos.setForeground(Color.BLACK);
		btnAviesPrximos.setFont(new Font("Arial", Font.PLAIN, 12));
		btnAviesPrximos.setBackground(Color.BLACK);
		btnAviesPrximos.setBounds(20, 45, 167, 29);
		panel_8.add(btnAviesPrximos);
		
		JLabel label_7 = new JLabel("Dist\u00E2ncia M\u00EDnima:");
		label_7.setFont(new Font("Arial", Font.PLAIN, 12));
		label_7.setBounds(20, 17, 97, 14);
		panel_8.add(label_7);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_13.setColumns(10);
		textField_13.setBounds(127, 14, 60, 20);
		panel_8.add(textField_13);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(516, 478, 192, 97);
		frame.getContentPane().add(panel_9);
		
		JButton btnEmRotaDe = new JButton("Em Rota de Colis\u00E3o");
		btnEmRotaDe.setForeground(Color.BLACK);
		btnEmRotaDe.setFont(new Font("Arial", Font.PLAIN, 12));
		btnEmRotaDe.setBackground(Color.BLACK);
		btnEmRotaDe.setBounds(20, 45, 154, 29);
		panel_9.add(btnEmRotaDe);
		
		JLabel lblTempoMnimo = new JLabel("Tempo M\u00EDnimo:");
		lblTempoMnimo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTempoMnimo.setBounds(20, 17, 84, 14);
		panel_9.add(lblTempoMnimo);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_14.setColumns(10);
		textField_14.setBounds(114, 14, 60, 20);
		panel_9.add(textField_14);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(210, 586, 447, 133);
		frame.getContentPane().add(panel_10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 447, 133);
		panel_10.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\eduar\\Desktop\\Capturara.PNG"));
		
		JLabel lblRadar = new JLabel("Radar");
		lblRadar.setFont(new Font("Arial", Font.PLAIN, 16));
		lblRadar.setBounds(563, 17, 52, 14);
		frame.getContentPane().add(lblRadar);
		
		JLabel lblDataGrid = new JLabel("Data Grid");
		lblDataGrid.setFont(new Font("Arial", Font.PLAIN, 16));
		lblDataGrid.setBounds(922, 17, 68, 14);
		frame.getContentPane().add(lblDataGrid);
	}
}

