package pessoa;

public class Clientes extends Pessoa{
	
	private String senha;
	private String numCartao;
	
	
	public Clientes(String nome, String idade, String cpf, String rg, String email, String telefone, String senha,
			 String numCartao) {
		super(nome, idade, cpf, rg, email, telefone);
		this.senha = senha;
		
		this.numCartao = numCartao;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getNumCartao() {
		return numCartao;
	}


	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}
	
	
	
}
	