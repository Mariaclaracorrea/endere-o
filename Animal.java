package Atividades;

class Animal {
	private String nome;
	private String cor;
	private String tamanho;
	private String peso;
	private String raça;
	
	protected String getNome() {
		return nome;
	}
	protected  void setNome(String nome) {
		this.nome = nome;
	}
	protected  String getCor() {
		return cor;
	}
	protected void setCor(String cor) {
		this.cor = cor;
	}
	protected String getTamanho() {
		return tamanho;
	}
	protected void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	protected String getPeso() {
		return peso;
	}
	protected void setPeso(String peso) {
		this.peso = peso;
	}
	protected String getRaca() {
		return raça;
	}
	protected void setRaca(String raça) {
		this.raça = raça;
	}

}
