package produto;

import javax.swing.JFrame;

public class Produtos extends JFrame {
	
	private String nome;
	private String cod;
	private String preço;
	private Object tip_prod;
	public String validade;
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getPreço() {
		return preço;
	}
	public void setPreço(String preço) {
		this.preço = preço;
	}
	public Object getTip_prod() {
		return tip_prod;
	}
	public void setTip_prod(String tip_prod) {
		this.tip_prod = tip_prod;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public Produtos(String nome, String cod, String preço, Object tip_prod, String validade) {
		super();
		this.nome = nome;
		this.cod = cod;
		this.preço = preço;
		this.tip_prod = tip_prod;
		this.validade = validade;
	}
	

	
}
