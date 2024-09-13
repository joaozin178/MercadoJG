package produto;

public class Produtos {
	
	private String nome;
	private int cod;
	private int preço;
	private String tip_prod;
	public String validade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public int getPreço() {
		return preço;
	}
	public void setPreço(int preço) {
		this.preço = preço;
	}
	public String getTip_prod() {
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
	@Override
	public String toString() {
		return "Produtos [nome=" + nome + ", cod=" + cod + ", preço=" + preço + ", tip_prod=" + tip_prod + ", validade="
				+ validade + "]";
	}
	
}
