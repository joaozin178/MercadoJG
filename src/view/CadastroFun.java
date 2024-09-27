package view;

import java.awt.EventQueue;
import pessoa.Funcionarios;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToggleButton;

public class CadastroFun extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField INome;
	private JTextField ICpf;
	private JTextField IRg;
	private JTextField IIdade;
	private JTextField IEmail;
	private JTextField ITelefone;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFun frame = new CadastroFun();
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
	public CadastroFun() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(10, 73, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cpf");
		lblNewLabel_2.setBounds(144, 73, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Idade");
		lblNewLabel_3.setBounds(10, 133, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Rg");
		lblNewLabel_4.setBounds(138, 133, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setBounds(10, 202, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Telefone");
		lblNewLabel_6.setBounds(138, 202, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		INome = new JTextField();
		INome.setColumns(10);
		INome.setBounds(10, 89, 86, 20);
		contentPane.add(INome);
		
		ICpf = new JTextField();
		ICpf.setColumns(10);
		ICpf.setBounds(139, 89, 86, 20);
		contentPane.add(ICpf);
		
		IRg = new JTextField();
		IRg.setColumns(10);
		IRg.setBounds(139, 158, 86, 20);
		contentPane.add(IRg);
		
		IIdade = new JTextField();
		IIdade.setColumns(10);
		IIdade.setBounds(10, 158, 86, 20);
		contentPane.add(IIdade);
		
		IEmail = new JTextField();
		IEmail.setColumns(10);
		IEmail.setBounds(10, 227, 86, 20);
		contentPane.add(IEmail);
		
		ITelefone = new JTextField();
		ITelefone.setColumns(10);
		ITelefone.setBounds(139, 227, 86, 20);
		contentPane.add(ITelefone);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(144, 269, 128, 23);
		contentPane.add(btnNewButton);
		
		
		JLabel lblCadastroFun = new JLabel("Cadastro funcionario");
		lblCadastroFun.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblCadastroFun.setBounds(10, 29, 227, 33);
		contentPane.add(lblCadastroFun);
		
		JLabel lblNewLabel = new JLabel("Escolaridade");
		lblNewLabel.setBounds(282, 202, 97, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Fundamental", "Medio", "Superior"}));
		comboBox.setBounds(282, 226, 128, 22);
		contentPane.add(comboBox);
		
		JLabel ISenha = new JLabel("Senha");
		ISenha.setBounds(282, 73, 128, 14);
		contentPane.add(ISenha);
		
		textField = new JTextField();
		textField.setBounds(282, 89, 131, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Conf_senha");
		lblNewLabel_7.setBounds(282, 133, 97, 14);
		contentPane.add(lblNewLabel_7);
		
		textField_1 = new JTextField();
		textField_1.setBounds(282, 158, 131, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("ver");
		tglbtnNewToggleButton.setBounds(282, 38, 121, 23);
		contentPane.add(tglbtnNewToggleButton);
		
		JButton btnNewButton_1 = new JButton("Criar conta");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionarios funcionario = new Funcionarios(INome.getText(), IIdade.getText(), ICpf.getText(), IRg.getText(), IEmail.getText(), ITelefone.getText(), comboBox.getSelectedItem().toString(), ISenha.getText());
				
				System.out.println("Nome do funcionario: " + funcionario.getNome());
				System.out.println("Idade: " + funcionario.getIdade());
				System.out.println("Cpf: " + funcionario.getCpf());
				System.out.println("RG: " + funcionario.getRg());
				System.out.println("Email/login: " + funcionario.getEmail());
				System.out.println("Telefone: " + funcionario.getTelefone());
				System.out.println("Profissão:" + funcionario.getEscolaridade());
				System.out.println("Senha: " + funcionario.getSenha());
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(btnNewButton_1, "Usuario cadastrado com sucesso", "Mensagem", JOptionPane.QUESTION_MESSAGE);
			}
		});
		btnNewButton_1.setBounds(282, 269, 128, 23);
		contentPane.add(btnNewButton_1);
		
	
		
	}
}
