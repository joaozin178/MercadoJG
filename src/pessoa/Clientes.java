package pessoa;

public class Clientes extends Pessoa{
	
	private String login;
	private String senha;
	private String numCartao;
	
	
	public Clientes(int idade, String cpf, String nome, int rg, String email, String telefone, String login,
			String senha, String numCartao) {
		super(idade, cpf, nome, rg, email, telefone);
		this.login = login;
		this.senha = senha;
		this.numCartao = numCartao;
	}
	
	
    	
}
	