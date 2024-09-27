package pessoa;

public class Funcionarios extends Pessoa{
	
	public Object escolaridade;
	public String senha;

	public Funcionarios( String nome, String idade, String cpf, String rg, String email, String telefone,
			String escolaridade, String senha) {
		super( nome, idade, cpf, rg, email, telefone);
		this.escolaridade = escolaridade;
		this.senha = senha;
	}

	public Object getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(Object escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	

	
	
	

}
