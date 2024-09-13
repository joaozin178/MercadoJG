package pessoa;

public class Funcionarios extends Pessoa{
	
	public String escolaridade;

	public Funcionarios(int idade, String cpf, String nome, int rg, String email, String telefone,
			String escolaridade) {
		super(idade, cpf, nome, rg, email, telefone);
		this.escolaridade = escolaridade;
	}

	
	
	

}
