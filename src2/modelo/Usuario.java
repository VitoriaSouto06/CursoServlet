package modelo;

public class Usuario {
	private String login;
	private String senha;
	
	public String getLogin() {
		return this.login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return this.senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean eIgual(String login, String senha) {
		if(!this.login.equals(login)) {
			return false;
		}
		if(!this.senha.equals(senha)) {
			return false;
		}
		
		return true;
	
	}
}
