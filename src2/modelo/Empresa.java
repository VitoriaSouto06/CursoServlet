package modelo;

import java.util.Date;

public class Empresa {
	private Integer id;
	private String nome;
	private Date dataAbertura = new Date();
	
	public void setDataAbertura(Date data) {
		this.dataAbertura = data;
	}
	
	public Date getDataAbertura() {
		return this.dataAbertura;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return this.id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
}
