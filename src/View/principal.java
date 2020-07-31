package View;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListResourceBundle;

import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import TableModel.TableModel;

public class principal {

	private JFrame frame;
	private JTextField tfPosX1;
	private JTextField tfPosX2;
	private JTextField tfPosY2;
	private JTextField tfRaio1;
	private JTextField tfVelocidade;
	private JTextField tfPosY1;
	private JTextField tfAngulo1;
	private JTextField tfDirecao;
	private JTextField tfPosX3;
	private JTextField tfPosY3;
	private JTextField tfPosX4;
	private JTextField tfPosy4;
	private JTextField tfAngulo4;
	private JTextField tfDistanciaMinima;
	private JTextField tfDistanciaMinima2;
	private JTextField tfTempoMin;
	private String[] colunas = new String[] { "id", "X", "Y", "R", "A", "V", "D" };
	private TableModel model;
	private GridPanel panelRadar = new GridPanel();
	private ArrayList<Plane> listPlanes = new ArrayList<Plane>();
	private Plane plane;
	private int id = 0;
	private int idSelecionado = -100;
	private int ids[] = null;
	private int auxIds[] = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal window = new principal();
					window.frame.setVisible(true);
					Double angle = new Double(0);

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
		frame.setTitle("Aircraft Controller!");
		frame.getContentPane().setFont(new Font("Arial", Font.PLAIN, 12));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1205, 769);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);

		JPanel panelEntradaDados = new JPanel();
		panelEntradaDados.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelEntradaDados.setBackground(Color.WHITE);
		panelEntradaDados.setBounds(26, 42, 334, 150);
		frame.getContentPane().add(panelEntradaDados);
		panelEntradaDados.setLayout(null);

		// JLabel lbl400 = new JLabel("400 x 400");
		// lbl400.setFont(new Font("arial", Font.PLAIN, 12));
		// lbl400.setBounds(600, 600, 50, 50);
		// lbl400.setBounds(x, y, width, height);
		// panelEntradaDados.add(lbl400);

		JLabel lbl400 = new JLabel("400x400");
		lbl400.setFont(new Font("Arial", Font.PLAIN, 16));
		lbl400.setBounds(710, 443, 192, 14);
		frame.getContentPane().add(lbl400);

		JLabel lblPosX1 = new JLabel("X:");
		lblPosX1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPosX1.setBounds(77, 21, 11, 14);
		panelEntradaDados.add(lblPosX1);

		JLabel lblRaio = new JLabel("Raio:");
		lblRaio.setFont(new Font("Arial", Font.PLAIN, 12));
		lblRaio.setBounds(59, 46, 29, 14);
		panelEntradaDados.add(lblRaio);

		JLabel lblVelocidade = new JLabel("Velocidade:");
		lblVelocidade.setFont(new Font("Arial", Font.PLAIN, 12));
		lblVelocidade.setBounds(23, 71, 65, 14);
		panelEntradaDados.add(lblVelocidade);

		JLabel lblPosY1 = new JLabel("Y:");
		lblPosY1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPosY1.setBounds(234, 21, 12, 14);
		panelEntradaDados.add(lblPosY1);

		JLabel lblAngulo1 = new JLabel("\u00C2ngulo:");
		lblAngulo1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAngulo1.setBounds(204, 46, 42, 14);
		panelEntradaDados.add(lblAngulo1);

		JLabel lblDirecao = new JLabel("Dire\u00E7\u00E3o:");
		lblDirecao.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDirecao.setBounds(198, 71, 48, 14);
		panelEntradaDados.add(lblDirecao);

		tfPosX1 = new JTextField();
		tfPosX1.setFont(new Font("Arial", Font.PLAIN, 12));
		tfPosX1.setBounds(98, 18, 58, 20);
		panelEntradaDados.add(tfPosX1);
		tfPosX1.setColumns(10);

		tfRaio1 = new JTextField();
		tfRaio1.setFont(new Font("Arial", Font.PLAIN, 12));
		tfRaio1.setColumns(10);
		tfRaio1.setBounds(98, 43, 58, 20);
		panelEntradaDados.add(tfRaio1);

		tfVelocidade = new JTextField();
		tfVelocidade.setFont(new Font("Arial", Font.PLAIN, 12));
		tfVelocidade.setColumns(10);
		tfVelocidade.setBounds(98, 68, 58, 20);
		panelEntradaDados.add(tfVelocidade);

		tfPosY1 = new JTextField();
		tfPosY1.setFont(new Font("Arial", Font.PLAIN, 12));
		tfPosY1.setColumns(10);
		tfPosY1.setBounds(256, 18, 58, 20);
		panelEntradaDados.add(tfPosY1);

		tfAngulo1 = new JTextField();
		tfAngulo1.setFont(new Font("Arial", Font.PLAIN, 12));
		tfAngulo1.setColumns(10);
		tfAngulo1.setBounds(256, 43, 58, 20);
		panelEntradaDados.add(tfAngulo1);

		tfDirecao = new JTextField();
		tfDirecao.setFont(new Font("Arial", Font.PLAIN, 12));
		tfDirecao.setColumns(10);
		tfDirecao.setBounds(256, 68, 58, 20);
		panelEntradaDados.add(tfDirecao);

		JLabel lblEntradaDeDados = new JLabel("Entrada de Dados");
		lblEntradaDeDados.setFont(new Font("Arial", Font.PLAIN, 16));
		lblEntradaDeDados.setBounds(126, 17, 129, 14);
		frame.getContentPane().add(lblEntradaDeDados);

		panelRadar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelRadar.setBackground(Color.WHITE);
		panelRadar.setBounds(376, 42, 400, 400);
		frame.getContentPane().add(panelRadar);

		JPanel panelFuncTT = new JPanel();
		panelFuncTT.setLayout(null);
		panelFuncTT.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelFuncTT.setBackground(Color.WHITE);
		panelFuncTT.setBounds(26, 228, 162, 97);
		frame.getContentPane().add(panelFuncTT);

		JLabel lbPosX2 = new JLabel("X:");
		lbPosX2.setFont(new Font("Arial", Font.PLAIN, 12));
		lbPosX2.setBounds(20, 20, 11, 14);
		panelFuncTT.add(lbPosX2);

		JLabel lbPosY2 = new JLabel("Y:");
		lbPosY2.setFont(new Font("Arial", Font.PLAIN, 12));
		lbPosY2.setBounds(86, 20, 12, 14);
		panelFuncTT.add(lbPosY2);

		tfPosX2 = new JTextField();
		tfPosX2.setFont(new Font("Arial", Font.PLAIN, 12));
		tfPosX2.setColumns(10);
		tfPosX2.setBounds(41, 17, 35, 20);
		panelFuncTT.add(tfPosX2);

		tfPosY2 = new JTextField();
		tfPosY2.setFont(new Font("Arial", Font.PLAIN, 12));
		tfPosY2.setColumns(10);
		tfPosY2.setBounds(108, 17, 35, 20);
		panelFuncTT.add(tfPosY2);

		JLabel lblFunoDeTransformao = new JLabel("Fun\u00E7\u00E3o de Transforma\u00E7\u00E3o");
		lblFunoDeTransformao.setFont(new Font("Arial", Font.PLAIN, 16));
		lblFunoDeTransformao.setBounds(107, 203, 192, 14);
		frame.getContentPane().add(lblFunoDeTransformao);

		JPanel panelFuncTE = new JPanel();
		panelFuncTE.setLayout(null);
		panelFuncTE.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelFuncTE.setBackground(Color.WHITE);
		panelFuncTE.setBounds(198, 228, 162, 97);
		frame.getContentPane().add(panelFuncTE);

		JLabel lbPosX3 = new JLabel("X:");
		lbPosX3.setFont(new Font("Arial", Font.PLAIN, 12));
		lbPosX3.setBounds(20, 20, 11, 14);
		panelFuncTE.add(lbPosX3);

		JLabel lbPosY3 = new JLabel("Y:");
		lbPosY3.setFont(new Font("Arial", Font.PLAIN, 12));
		lbPosY3.setBounds(86, 20, 12, 14);
		panelFuncTE.add(lbPosY3);

		tfPosX3 = new JTextField();
		tfPosX3.setFont(new Font("Arial", Font.PLAIN, 12));
		tfPosX3.setColumns(10);
		tfPosX3.setBounds(41, 17, 35, 20);
		panelFuncTE.add(tfPosX3);

		tfPosY3 = new JTextField();
		tfPosY3.setFont(new Font("Arial", Font.PLAIN, 12));
		tfPosY3.setColumns(10);
		tfPosY3.setBounds(108, 17, 35, 20);
		panelFuncTE.add(tfPosY3);

		JPanel panelFuncTR = new JPanel();
		panelFuncTR.setLayout(null);
		panelFuncTR.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelFuncTR.setBackground(Color.WHITE);
		panelFuncTR.setBounds(26, 345, 334, 97);
		frame.getContentPane().add(panelFuncTR);

		JLabel lbPosX4 = new JLabel("X:");
		lbPosX4.setFont(new Font("Arial", Font.PLAIN, 12));
		lbPosX4.setBounds(171, 48, 11, 14);
		panelFuncTR.add(lbPosX4);

		JLabel lbPosy4 = new JLabel("Y:");
		lbPosy4.setFont(new Font("Arial", Font.PLAIN, 12));
		lbPosy4.setBounds(237, 48, 12, 14);
		panelFuncTR.add(lbPosy4);

		tfPosX4 = new JTextField();
		tfPosX4.setFont(new Font("Arial", Font.PLAIN, 12));
		tfPosX4.setColumns(10);
		tfPosX4.setBounds(192, 45, 35, 20);
		panelFuncTR.add(tfPosX4);

		tfPosy4 = new JTextField();
		tfPosy4.setFont(new Font("Arial", Font.PLAIN, 12));
		tfPosy4.setColumns(10);
		tfPosy4.setBounds(259, 45, 35, 20);
		panelFuncTR.add(tfPosy4);

		JLabel lblAngulo4 = new JLabel("\u00C2ngulo:");
		lblAngulo4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAngulo4.setBounds(20, 17, 47, 14);
		panelFuncTR.add(lblAngulo4);

		JLabel lblCentroDeRotao = new JLabel("Centro de Rota\u00E7\u00E3o:");
		lblCentroDeRotao.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCentroDeRotao.setBounds(170, 17, 124, 14);
		panelFuncTR.add(lblCentroDeRotao);

		tfAngulo4 = new JTextField();
		tfAngulo4.setFont(new Font("Arial", Font.PLAIN, 12));
		tfAngulo4.setColumns(10);
		tfAngulo4.setBounds(77, 14, 58, 20);
		panelFuncTR.add(tfAngulo4);

//		JPanel panel_5 = new JPanel();
//		panel_5.setLayout(null);
//		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
//		panel_5.setBackground(Color.WHITE);
//		panel_5.setBounds(796, 42, 324, 318);
//		frame.getContentPane().add(panel_5);

		model = new TableModel();

		JLabel lblRelatorio = new JLabel("Relat\u00F3rio");
		lblRelatorio.setFont(new Font("Arial", Font.PLAIN, 16));
		lblRelatorio.setBounds(953, 418, 65, 14);
		frame.getContentPane().add(lblRelatorio);

		JTextPane panelRelatorio = new JTextPane();
		panelRelatorio.setLayout(null);

		JScrollPane barraRolagemRelatorio = new JScrollPane(panelRelatorio);
		barraRolagemRelatorio.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		barraRolagemRelatorio.setBackground(Color.WHITE);
		barraRolagemRelatorio.setBounds(796, 443, 377, 247);
		frame.getContentPane().add(barraRolagemRelatorio);

		JLabel lblFunesDeRastreamento = new JLabel("Fun\u00E7\u00F5es de Rastreamento");
		lblFunesDeRastreamento.setFont(new Font("Arial", Font.PLAIN, 16));
		lblFunesDeRastreamento.setBounds(294, 453, 192, 14);
		frame.getContentPane().add(lblFunesDeRastreamento);

		JPanel panelFuncRAPA = new JPanel();
		panelFuncRAPA.setLayout(null);
		panelFuncRAPA.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelFuncRAPA.setBackground(Color.WHITE);
		panelFuncRAPA.setBounds(26, 478, 251, 97);
		frame.getContentPane().add(panelFuncRAPA);

		JButton btnAviProxA = new JButton("Avi\u00F5es Pr\u00F3ximo ao Aeroporto");
		btnAviProxA.setForeground(Color.BLACK);
		btnAviProxA.setFont(new Font("Arial", Font.PLAIN, 12));
		btnAviProxA.setBackground(Color.ORANGE);
		btnAviProxA.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int j = 0;
				NumberFormat formatter = new DecimalFormat("#0.00");
				if (!tfDistanciaMinima.getText().isEmpty()) {
					panelRelatorio.setText(null);
					panelRelatorio.replaceSelection(
							"Aviões com distancia minima de " + tfDistanciaMinima.getText() + " com o aeroporto: \n");
					for (int i = 0; i < listPlanes.size(); i++) {
						if (listPlanes.get(i).getRaio() <= Double.valueOf(tfDistanciaMinima.getText())) {
							panelRelatorio.replaceSelection("Avião> " + String.valueOf(listPlanes.get(i).getId()
									+ " Distância>" + formatter.format(listPlanes.get(i).getRaio())) + "\n");
							// "Avião com id: " + String.valueOf(listPlanes.get(i).getId() + "\n"));
							System.out.println("é menor");
							j++;
						}
					}
					if (j == 0) {
						panelRelatorio.replaceSelection("Nenhum avião com uma distancia de "
								+ tfDistanciaMinima.getText() + " foi encontrado proximo ao aeroporto!");
					}
					panelRelatorio.replaceSelection("\n\n");
				} else {
					JOptionPane.showMessageDialog(null, "Informe a distância minima!");
				}
			}
		});
		btnAviProxA.setBounds(20, 45, 214, 29);
		panelFuncRAPA.add(btnAviProxA);

		JLabel lblDistanciaMinima = new JLabel("Dist\u00E2ncia M\u00EDnima:");
		lblDistanciaMinima.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDistanciaMinima.setBounds(20, 17, 97, 14);
		panelFuncRAPA.add(lblDistanciaMinima);

		tfDistanciaMinima = new JTextField();
		tfDistanciaMinima.setFont(new Font("Arial", Font.PLAIN, 12));
		tfDistanciaMinima.setColumns(10);
		tfDistanciaMinima.setBounds(127, 14, 60, 20);
		panelFuncRAPA.add(tfDistanciaMinima);

		JPanel panelFuncRAP = new JPanel();
		panelFuncRAP.setLayout(null);
		panelFuncRAP.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelFuncRAP.setBackground(Color.WHITE);
		panelFuncRAP.setBounds(294, 478, 210, 97);
		frame.getContentPane().add(panelFuncRAP);

		JButton btnAviProx = new JButton("Avi\u00F5es Pr\u00F3ximos");
		btnAviProx.setForeground(Color.BLACK);
		btnAviProx.setFont(new Font("Arial", Font.PLAIN, 12));
		btnAviProx.setBackground(Color.ORANGE);
		btnAviProx.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				double x1, x2;
				double y1, y2;
				NumberFormat formatter = new DecimalFormat("#0.00");
				int k = 0;
				if (tfDistanciaMinima2.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Informe a distância minima!");
				} else {
					panelRelatorio.setText(null);
					panelRelatorio.replaceSelection(
							"Aviões com distancia minima de " + tfDistanciaMinima2.getText() + " com outro avião\n");
					for (int i = 0; i < listPlanes.size(); i++) {
						x1 = listPlanes.get(i).getX();
						y1 = listPlanes.get(i).getY();
						for (int j = 0; j < listPlanes.size(); j++) {
							if (i != j && j > i) {
								System.out.println("testou o avião " + i + " com o avião " + j);
								double dist;
								x2 = listPlanes.get(j).getX();
								y2 = listPlanes.get(j).getY();
								// calc dist
								dist = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
								if (dist <= Double.valueOf(tfDistanciaMinima2.getText())) {
									panelRelatorio.replaceSelection(
											"Ids(" + listPlanes.get(i).getId() + "," + listPlanes.get(j).getId()
													+ ") Distancia " + formatter.format(dist) + "\n");
									k++;
								}
							}
						}
					}
					if (k == 0) {
						panelRelatorio.replaceSelection("Nenhum avião com uma distancia de "
								+ tfDistanciaMinima2.getText() + " proximo a outro avião foi encontrado!\n\n");
					} else {
						panelRelatorio.replaceSelection("\n\n");
					}
				}
			}
		});
		btnAviProx.setBounds(20, 45, 167, 29);
		panelFuncRAP.add(btnAviProx);

		JLabel lblDistanciaMinima2 = new JLabel("Dist\u00E2ncia M\u00EDnima:");
		lblDistanciaMinima2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDistanciaMinima2.setBounds(20, 17, 97, 14);
		panelFuncRAP.add(lblDistanciaMinima2);

		tfDistanciaMinima2 = new JTextField();
		tfDistanciaMinima2.setFont(new Font("Arial", Font.PLAIN, 12));
		tfDistanciaMinima2.setColumns(10);
		tfDistanciaMinima2.setBounds(127, 14, 60, 20);
		panelFuncRAP.add(tfDistanciaMinima2);

		JPanel panelFuncRRC = new JPanel();
		panelFuncRRC.setLayout(null);
		panelFuncRRC.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelFuncRRC.setBackground(Color.WHITE);
		panelFuncRRC.setBounds(516, 478, 192, 97);
		frame.getContentPane().add(panelFuncRRC);

		JButton btnEmRotaColi = new JButton("Em Rota de Colis\u00E3o");
		btnEmRotaColi.setForeground(Color.BLACK);
		btnEmRotaColi.setFont(new Font("Arial", Font.PLAIN, 12));
		btnEmRotaColi.setBackground(Color.ORANGE);
		btnEmRotaColi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double x1, x2;
				double value1;
				double y1, y2;
				double value2;
				double m1, m2;
				double x, y;
				double D1, D2;
				double V1, V2;
				double T1, T2;
				double DIF;

				NumberFormat formatter = new DecimalFormat("#0.00");
				if (tfTempoMin.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Informe o tempo minimo!");
				} else {
					panelRelatorio.setText(null);
					panelRelatorio.replaceSelection(
							"Aviões em rota de colisão com tempo minimo de " + tfTempoMin.getText() + "s com outro avião:\n");
					for (int i = 0; i < listPlanes.size(); i++) {
						x1 = listPlanes.get(i).getX();
						y1 = listPlanes.get(i).getY();
						m1 = Math.tan(Math.toRadians(listPlanes.get(i).getDirection()));
						System.out.println("M1: " +m1);
						V1 = listPlanes.get(i).getVelocidade();
						for (int j = 0; j < listPlanes.size(); j++) {
							if (i != j && j > i) {
								System.out.println("testou o avião " + i + " com o avião " + j);
								x2 = listPlanes.get(j).getX();
								y2 = listPlanes.get(j).getY();
								m2 = Math.tan(Math.toRadians(listPlanes.get(j).getDirection()));
								System.out.println("M2: " + m2);
								V2 = listPlanes.get(j).getVelocidade();
								if(m1==m2 || (m1>0 && m2>0) || (m1<0 && m2<0)) {
									System.out.println("não a ponto de intersecção");
								}
								else {
									//find first equation
									//y2 = m*(x2-x1)+y1
									//y2 = m1*(x2-x1)+y1
									value1 = m1*(-x1) + y1;
									//y = +-x+value
									
									//find second equation
									//y2 = m*(x2-x1)+y1
									//y2 = m1*(x2-x1)+y1
									value2 = m2*(-x2) + y2;
							
									System.out.println("value1 :" + value1 + "value2: " + value2);
									
									//ponto intersecção
									//+-x + value1 = +-x + value 2
									//ponto x
									x = (value2 -(value1))/2;
									System.out.println("X:" + x);
									//ponto y
									//y = x+value
									y = x + value1;
									System.out.println("Y:" + y);
									
									//achar T1
									// t = s/v
									// D = S;
									// D = Math.srt(math.pow(x-x1) + math.pow(y-y1))
									D1 = Math.sqrt(Math.pow((x-x1), 2) + Math.pow((y-y1), 2));
									T1 = (D1/V1) * 3600;
									
									//achar T2
									// t = s/v
									// D = S;
									// D = Math.srt(math.pow(x-x2) + math.pow(y-y2))
									D2 = Math.sqrt(Math.pow((x-x2), 2) + Math.pow((y-y2), 2));
									T2 = (D2/V2) * 3600;
									DIF = Math.abs(T1-T2);
									if(DIF <= Double.valueOf(tfTempoMin.getText())){
										panelRelatorio.replaceSelection(
												"Ids(" + listPlanes.get(i).getId() + "," + listPlanes.get(j).getId()
														+ ") Tempo Minimo " + formatter.format(DIF) + "s\n");
									}
								}
							}
						}
					}
				}
			}
		});
		btnEmRotaColi.setBounds(20, 45, 154, 29);
		panelFuncRRC.add(btnEmRotaColi);

		JLabel lblTempoMin = new JLabel("Tempo M\u00EDnimo:");
		lblTempoMin.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTempoMin.setBounds(20, 17, 84, 14);
		panelFuncRRC.add(lblTempoMin);

		tfTempoMin = new JTextField();
		tfTempoMin.setFont(new Font("Arial", Font.PLAIN, 12));
		tfTempoMin.setColumns(10);
		tfTempoMin.setBounds(114, 14, 60, 20);
		panelFuncRRC.add(tfTempoMin);

		JPanel panelDescricao = new JPanel();
		panelDescricao.setLayout(null);
		panelDescricao.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelDescricao.setBackground(Color.WHITE);
		panelDescricao.setBounds(210, 586, 447, 133);
		frame.getContentPane().add(panelDescricao);

		JLabel lblFoto = new JLabel("");
		lblFoto.setBounds(0, 0, 447, 133);
		panelDescricao.add(lblFoto);
		lblFoto.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\img\\projeto.PNG"));

		JLabel lblRadar = new JLabel("Radar");
		lblRadar.setFont(new Font("Arial", Font.PLAIN, 16));
		lblRadar.setBounds(563, 17, 52, 14);
		frame.getContentPane().add(lblRadar);

		JLabel lblDataGrid = new JLabel("Data Grid");
		lblDataGrid.setFont(new Font("Arial", Font.PLAIN, 16));
		lblDataGrid.setBounds(953, 17, 68, 14);
		frame.getContentPane().add(lblDataGrid);

		JTable tabela = new JTable(model);
		tabela.setRowSelectionAllowed(true);
		tabela.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		tabela.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent event) {
				// System.out.println("////////");
				ids = tabela.getSelectedRows();
				// System.out.println("ids selecionados");
				for (int i = 0; i < ids.length; i++) {
					// System.out.println(ids[i]);
				}
				// System.out.println("ids selecionados fim");
				panelRadar.mudacor(ids);
				// System.out.println("//////");
				// if (tabela.getSelectedRows() != -1) {
				// idSelecionado = (int) tabela.getValueAt(tabela.getSelectedRow(), 0);
				// }

			}
		});
		JScrollPane barraRolagemDataGrid = new JScrollPane(tabela);
		barraRolagemDataGrid.setBounds(800, 72, 373, 314);
		frame.getContentPane().add(barraRolagemDataGrid);

		JButton btnTranslandar = new JButton("Translandar");
		btnTranslandar.setForeground(Color.BLACK);
		btnTranslandar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnTranslandar.setBackground(Color.ORANGE);
		btnTranslandar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ids = tabela.getSelectedRows();
				if (!tfPosX2.getText().isEmpty() && !tfPosY2.getText().isEmpty()) {
					if (ids != null) {
						for (int i = 0; i < ids.length; i++) {

							Plane p = new Plane();
							p = listPlanes.get(ids[i]);
							p.setX(p.getX() + Double.valueOf(tfPosX2.getText()));
							p.setY(p.getY() + Double.valueOf(tfPosY2.getText()));
							p.setAngle(Math.toDegrees(Math.atan2(p.getX(), p.getY())));
							p.setRaio(Math.sqrt((Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2))));
							listPlanes.set(ids[i], p);
							panelRadar.transform(p, ids[i]);

						}
						auxIds = ids;
						reescreverTabela();

						for (int i = 0; i < auxIds.length; i++) {
							if (i == 0) {
								tabela.setRowSelectionInterval(auxIds[i], auxIds[i]);
							} else {
								tabela.addRowSelectionInterval(auxIds[i], auxIds[i]);
							}

						}

					} else {
						JOptionPane.showMessageDialog(null, "Selecione um avião na tabela!");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Preencha os campos!");
				}
//				panelRadar.change();
//				panelRadar.repaint();
			}
		});
		btnTranslandar.setBounds(20, 45, 123, 29);
		panelFuncTT.add(btnTranslandar);

		JButton btnEscalonar = new JButton("Escalonar");
		btnEscalonar.setForeground(Color.BLACK);
		btnEscalonar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnEscalonar.setBackground(Color.ORANGE);
		btnEscalonar.setBounds(20, 45, 123, 29);
		btnEscalonar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ids = tabela.getSelectedRows();
				if (!tfPosX3.getText().isEmpty() && !tfPosY3.getText().isEmpty()) {
					if (ids != null) {
						for (int i = 0; i < ids.length; i++) {
							Plane p = new Plane();
							p = listPlanes.get(ids[i]);
							p.setX(p.getX() * (Double.valueOf(tfPosX3.getText()) / 100));
							p.setY(p.getY() * (Double.valueOf(tfPosY3.getText()) / 100));
							p.setAngle(Math.toDegrees(Math.atan2(p.getX(), p.getY())));
							p.setRaio(Math.sqrt((Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2))));
							listPlanes.set(ids[i], p);
							panelRadar.transform(p, ids[i]);

						}

						auxIds = ids;
						reescreverTabela();

						for (int i = 0; i < auxIds.length; i++) {
							if (i == 0) {
								tabela.setRowSelectionInterval(auxIds[i], auxIds[i]);
							} else {
								tabela.addRowSelectionInterval(auxIds[i], auxIds[i]);
							}

						}

					} else {
						JOptionPane.showMessageDialog(null, "Selecione um avião na tabela!");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Preencha os campos!");
				}
//				panelRadar.change();
//				panelRadar.repaint();
			}
		});
		panelFuncTE.add(btnEscalonar);

		JButton btnRotacionar = new JButton("Rotacionar");
		btnRotacionar.setForeground(Color.BLACK);
		btnRotacionar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnRotacionar.setBackground(Color.ORANGE);
		btnRotacionar.setBounds(20, 45, 123, 29);
		btnRotacionar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ids = tabela.getSelectedRows();
				if (!tfPosX4.getText().isEmpty() && !tfPosy4.getText().isEmpty() && !tfAngulo4.getText().isEmpty()) {
					if (ids != null) {
						for (int i = 0; i < ids.length; i++) {

							Plane p = new Plane();
							p = listPlanes.get(ids[i]);
							double x1, y1, inputx, inputy, sin, cos;
							// cos + sin angle
							sin = Math.sin(Double.valueOf(tfAngulo4.getText()) / (180 / Math.PI));
							cos = Math.cos(Double.valueOf(tfAngulo4.getText()) / (180 / Math.PI));
							// inputs
							inputx = Double.valueOf(tfPosX4.getText());
							inputy = Double.valueOf(tfPosy4.getText());
							// new x and y
							x1 = p.getX() - inputx;
							y1 = p.getY() - inputy;
							// calc
							p.setX((x1 * cos) - (y1 * sin));
							p.setY((y1 * cos) + (x1 * sin));

							p.setX(p.getX() + inputx);
							p.setY(p.getY() + inputy);
							p.setAngle(Math.toDegrees(Math.atan2(p.getX(), p.getY())));
							p.setRaio(Math.sqrt((Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2))));
							listPlanes.set(ids[i], p);
							panelRadar.transform(p, ids[i]);

						}

						auxIds = ids;
						reescreverTabela();

						for (int i = 0; i < auxIds.length; i++) {
							if (i == 0) {
								tabela.setRowSelectionInterval(auxIds[i], auxIds[i]);
							} else {
								tabela.addRowSelectionInterval(auxIds[i], auxIds[i]);
							}

						}

					} else {
						JOptionPane.showMessageDialog(null, "Por favor selecione primeiro na lista");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Preencha os campos!");
				}
			}
		});

		panelFuncTR.add(btnRotacionar);

		JButton btnInserir = new JButton("Inserir");
		btnInserir.setForeground(Color.BLACK);
		btnInserir.setBackground(Color.ORANGE);
		btnInserir.setFont(new Font("Arial", Font.PLAIN, 12));
		btnInserir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double x, y, angle, raio, velocidade, direction;
				ids = tabela.getSelectedRows();

				if (!tfPosX1.getText().isEmpty() && !tfPosY1.getText().isEmpty()
						|| !tfRaio1.getText().isEmpty() && !tfAngulo1.getText().isEmpty()) {
					if (!tfVelocidade.getText().isEmpty() && !tfDirecao.getText().isEmpty()) {
						velocidade = Double.valueOf(tfVelocidade.getText());
						direction = Double.valueOf(tfDirecao.getText());
						if (tfAngulo1.getText().isEmpty() && tfRaio1.getText().isEmpty()) {
							x = Double.valueOf(tfPosX1.getText());
							y = Double.valueOf(tfPosY1.getText());
							// calc angulo
							angle = Math.toDegrees(Math.atan2(y, x));
							// System.out.println("angulo>>>>" + Math.toDegrees(angle));
							// calc raio
							raio = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
							// System.out.println("Raio>>>>" + raio);
						} else {
							angle = Double.valueOf(tfAngulo1.getText());
							raio = Double.valueOf(tfRaio1.getText());
							// calc x
							x = raio * Math.cos(Math.toRadians(angle));
							// System.out.println("x>>>>" + x);
							// calc y
							y = raio * Math.sin(Math.toRadians(angle));
							// System.out.println("y>>>>" + y);
						}
						listPlanes.add(new Plane(id, x, y, raio, angle, direction, velocidade));

						panelRadar.setList(listPlanes);
						panelRadar.repaint();
						id++;
						zerarCampos();
						if (ids != null) {
							auxIds = ids;
							reescreverTabela();

							for (int i = 0; i < auxIds.length; i++) {
								// System.out.println(auxIds[i]);
								if (i == 0) {
									tabela.setRowSelectionInterval(auxIds[i], auxIds[i]);
								} else {
									tabela.addRowSelectionInterval(auxIds[i], auxIds[i]);
								}

							}
						} else {
							reescreverTabela();
						}

					} else {
						JOptionPane.showMessageDialog(null, "Preencha os campos de Velocidade e Direção");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Preencha os campos de X e Y ou Angulo e Raio!");
				}
			}
		});
		btnInserir.setBounds(224, 99, 90, 32);
		panelEntradaDados.add(btnInserir);

		JPanel painelDataGrid = new JPanel();
		barraRolagemDataGrid.setColumnHeaderView(painelDataGrid);
		painelDataGrid.setBackground(Color.WHITE);
		painelDataGrid.setLayout(new GridLayout(1, 1));
		painelDataGrid.setBorder(new LineBorder(new Color(0, 0, 0), 2));

		JButton btnZerarTabela = new JButton("Zerar Tabela");
		btnZerarTabela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				zerarTabela();
			}
		});
		btnZerarTabela.setForeground(Color.BLACK);
		btnZerarTabela.setFont(new Font("Arial", Font.PLAIN, 12));
		btnZerarTabela.setBackground(Color.ORANGE);
		btnZerarTabela.setBounds(796, 42, 106, 23);
		frame.getContentPane().add(btnZerarTabela);

		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ids = tabela.getSelectedRows();

				if (ids != null) {

					for (int i = ids.length - 1; i >= 0; i--) {
						listPlanes.remove(ids[i]);
					}
					Plane p = new Plane();
					for (int i = 0; i < listPlanes.size(); i++) {
						p = listPlanes.get(i);
						p.setId(i);
					}
					id = listPlanes.size();

					reescreverTabela();
					panelRadar.repaint();
				}

			}
		});
		btnDeletar.setForeground(Color.BLACK);
		btnDeletar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnDeletar.setBackground(Color.ORANGE);
		btnDeletar.setBounds(912, 42, 106, 23);
		frame.getContentPane().add(btnDeletar);

		JButton btnExemplo = new JButton("Exemplo");
		btnExemplo.setForeground(Color.BLACK);
		btnExemplo.setFont(new Font("Arial", Font.PLAIN, 12));
		btnExemplo.setBackground(Color.ORANGE);
		btnExemplo.setBounds(1030, 42, 106, 23);
		btnExemplo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exemplo();
			}
		});
		frame.getContentPane().add(btnExemplo);

		tabela.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 1) {
					// panelRadar.mudacor(ids);
					// panelRadar.repaint();
					// System.out.println("id selecionado>" + idSelecionado);
					// System.out.println("SELECIONA COR");
				}
			}
		});
	}

	public void reescreverTabela() {
		if (!model.isEmpty()) {
			model.limpar();
		}

		if (!listPlanes.isEmpty()) {

			model.addListaDePlanes(listPlanes);
		}
	}

	public void zerarTabela() {

		model.limpar();
		listPlanes.clear();
		panelRadar.repaint();
		id = 0;
		ids = null;
		auxIds = null;

	}

	public void zerarCampos() {
		tfPosX1.setText("");
		tfPosY1.setText("");
		tfAngulo1.setText("");
		tfRaio1.setText("");
		tfVelocidade.setText("");
		tfDirecao.setText("");
	}

	public void exemplo() {
		double x, y, angle, raio, velocidade, direction;
		zerarTabela();
		for (int i = 0; i < 15; i++) {
			x = generatRandomXY();
			y = generatRandomXY();
			direction = generatRandomD();
			velocidade = generatRandomV();
			angle = Math.toDegrees(Math.atan2(y, x));
			raio = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
			listPlanes.add(new Plane(id, x, y, raio, angle, direction, velocidade));
			id++;
		}

		panelRadar.setList(listPlanes);
		panelRadar.repaint();
		id++;
		zerarCampos();
		reescreverTabela();
	}

	public static int generatRandomXY() {
		// Random Rand = new Random();
		int ii = -150 + (int) (Math.random() * ((100 - (-150)) + 1));
		return ii;
	}

	public static int generatRandomV() {
		// Random Rand = new Random();
		int ii = 0 + (int) (Math.random() * ((100 - 0) + 1));
		return ii;
	}

	public static int generatRandomD() {
		// Random Rand = new Random();
		int ii = 0 + (int) (Math.random() * ((360 - 0) + 1));
		return ii;
	}
}