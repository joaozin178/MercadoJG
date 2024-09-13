package pessoa;

import java.util.ArrayList;


public class Pessoa {

	private int idade;
	private String cpf;
	private String nome;
	public int rg;
	public String email;
	public String telefone;
	
	public Pessoa(int idade, String cpf, String nome, int rg, String email, String telefone) {
		super();
		this.idade = idade;
		this.cpf = cpf;
		this.nome = nome;
		this.rg = rg;
		this.email = email;
		this.telefone = telefone;
		
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
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
	@Override
	public String toString() {
		return "Pessoa [idade=" + idade + ", cpf=" + cpf + ", nome=" + nome + ", rg=" + rg + ", email=" + email
				+ ", telefone=" + telefone + "]";
	}
	
	
	
}
