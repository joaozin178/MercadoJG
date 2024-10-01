package pessoa;

import java.util.ArrayList;


public class Pessoa {

//comentário apenas para salvar alguma coisa no git, não mexi em nada do código

	private String nome;
	private String idade;
	private String cpf;
	private String rg;
	private String email;
	public String telefone;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Pessoa(String nome, String idade, String cpf, String rg, String email, String telefone) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.rg = rg;
		this.email = email;
		this.telefone = telefone;
	}
	
	
	

}
