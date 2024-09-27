package view;

import java.awt.EventQueue;

import produto.Produtos;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Add_prod extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField INome;
	private JTextField IValidade;
	private JTextField ICod;
	private JTextField IPreço;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_prod frame = new Add_prod();
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
	public Add_prod() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Adicionar Produto");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(10, 11, 172, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(10, 72, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Validade");
		lblNewLabel_2.setBounds(121, 72, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo prod");
		lblNewLabel_3.setBounds(241, 72, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Codigo");
		lblNewLabel_4.setBounds(10, 132, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Preço");
		lblNewLabel_5.setBounds(121, 132, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		INome = new JTextField();
		INome.setBounds(10, 97, 86, 20);
		contentPane.add(INome);
		INome.setColumns(10);
		
		IValidade = new JTextField();
		IValidade.setBounds(121, 97, 86, 20);
		contentPane.add(IValidade);
		IValidade.setColumns(10);
		
		ICod = new JTextField();
		ICod.setBounds(10, 157, 86, 20);
		contentPane.add(ICod);
		ICod.setColumns(10);
		
		IPreço = new JTextField();
		IPreço.setBounds(121, 157, 86, 20);
		contentPane.add(IPreço);
		IPreço.setColumns(10);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(195, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Alimentação", "Farmácia", "Limpeza"}));
		comboBox.setBounds(241, 96, 112, 22);
		contentPane.add(comboBox);
		
		JButton btnCriar = new JButton("Criar");
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produtos produtos = new Produtos(INome.getText(),ICod.getText(),IPreço.getText(),comboBox.getSelectedItem(),IValidade.getText());
				
				System.out.println("Nome do produto: " +produtos.getNome());
				System.out.println("Codigo do prod: " +produtos.getCod());
				System.out.println("Preço prod: " +produtos.getPreço());
				System.out.println("Tip_prod: " +produtos.getTip_prod());
				System.out.println("Validade do produto: " +produtos.getValidade());
			}
		});
		btnCriar.setBounds(317, 227, 89, 23);
		contentPane.add(btnCriar);
	}
}
