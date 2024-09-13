package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class TelaInicial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaInicial() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrador\\Downloads\\mercado.png"));
		setTitle("MercadoJG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Contas");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Criar conta");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroUsuario cadastrousuario = new CadastroUsuario();
				cadastrousuario.setVisible(true);
				
			}
		});
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Contas");
		mnNewMenu_1.add(mntmNewMenuItem_5);
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_2 = new JMenu("Estoque");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_5 = new JMenu("Produtos");
		mnNewMenu_2.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Ver");
		mnNewMenu_5.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Editar");
		mnNewMenu_5.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("add_prod");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_prod add_prod = new Add_prod();
				add_prod.setVisible(true);
			}
		});
		mnNewMenu_5.add(mntmNewMenuItem_7);
		
		JMenu mnNewMenu_3 = new JMenu("Suporte");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Contato");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contato contato = new Contato();
				contato.setVisible(true);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_4 = new JMenu("Sair");
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Sair");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Cancelar");
		mnNewMenu_4.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
