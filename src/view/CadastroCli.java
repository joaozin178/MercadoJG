package view;

import java.awt.EventQueue;
import pessoa.Clientes;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JToggleButton;

public class CadastroCli extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField INome;
	private JTextField ICpf;
	private JTextField IRg;
	private JTextField IIdade;
	private JTextField IEmail;
	private JTextField ITelefone;
	private JTextField ISenha;
	private JTextField ICon_card;
	private JTextField INum_card;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCli frame = new CadastroCli();
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
	public CadastroCli() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro cliente");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(10, 11, 174, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(10, 55, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cpf");
		lblNewLabel_2.setBounds(144, 55, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Idade");
		lblNewLabel_3.setBounds(10, 115, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Rg");
		lblNewLabel_4.setBounds(138, 115, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email/Login");
		lblNewLabel_5.setBounds(10, 184, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Telefone");
		lblNewLabel_6.setBounds(138, 184, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		INome = new JTextField();
		INome.setBounds(10, 71, 86, 20);
		contentPane.add(INome);
		INome.setColumns(10);
		
		ICpf = new JTextField();
		ICpf.setBounds(139, 71, 86, 20);
		contentPane.add(ICpf);
		ICpf.setColumns(10);
		
		IRg = new JTextField();
		IRg.setBounds(139, 140, 86, 20);
		contentPane.add(IRg);
		IRg.setColumns(10);
		
		IIdade = new JTextField();
		IIdade.setBounds(10, 140, 86, 20);
		contentPane.add(IIdade);
		IIdade.setColumns(10);
		
		IEmail = new JTextField();
		IEmail.setBounds(10, 209, 86, 20);
		contentPane.add(IEmail);
		IEmail.setColumns(10);
		
		ITelefone = new JTextField();
		ITelefone.setBounds(139, 209, 86, 20);
		contentPane.add(ITelefone);
		ITelefone.setColumns(10);
		
		ISenha = new JTextField();
		ISenha.setBounds(282, 71, 104, 20);
		contentPane.add(ISenha);
		ISenha.setColumns(10);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Ver");
		tglbtnNewToggleButton.setBounds(282, 20, 104, 23);
		contentPane.add(tglbtnNewToggleButton);
		
		JLabel lblNewLabel_8 = new JLabel("Conf_senha");
		lblNewLabel_8.setBounds(282, 115, 104, 14);
		contentPane.add(lblNewLabel_8);
		
		ICon_card = new JTextField();
		ICon_card.setBounds(282, 140, 104, 20);
		contentPane.add(ICon_card);
		ICon_card.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Num_Cartao");
		lblNewLabel_9.setBounds(282, 184, 104, 14);
		contentPane.add(lblNewLabel_9);
		
		INum_card = new JTextField();
		INum_card.setBounds(282, 209, 104, 20);
		contentPane.add(INum_card);
		INum_card.setColumns(10);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		
		JLabel lblNewLabel_7 = new JLabel("Senha");
		lblNewLabel_7.setBounds(282, 55, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(160, 281, 128, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Criar conta");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Clientes cliente = new Clientes(INome.getText(), IIdade.getText(), ICpf.getText(), IRg.getText(), IEmail.getText(), ITelefone.getText(), ISenha.getText() , INum_card.getText());
				System.out.println("Nome do cliente: " + cliente.getNome());
				System.out.println("Idade: " + cliente.getIdade());
				System.out.println("Cpf: " + cliente.getCpf());
				System.out.println("RG: " + cliente.getRg());
				System.out.println("Email/login: " + cliente.getEmail());
				System.out.println("Telefone: " + cliente.getTelefone());
				System.out.println("Senha: " + cliente.getSenha());
				System.out.println("Numero cartao: " + cliente.getNumCartao());

			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(298, 281, 128, 23);
		contentPane.add(btnNewButton_1);
		
		
		
	}
}
