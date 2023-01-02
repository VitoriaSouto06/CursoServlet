package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList();
	private static List<Usuario> listaUsuario = new ArrayList();
	
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa1 = new Empresa();
		
		empresa1.setNome("Empresa Teste 1");
		empresa1.setId(chaveSequencial++);
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Empresa Teste 2");
		empresa2.setId(chaveSequencial++);
		lista.add(empresa1);
		lista.add(empresa2);
		
		Usuario u1 = new Usuario();
		u1.setLogin("UsuarioTeste");
		u1.setSenha("123456");
		
		Usuario u2 = new Usuario();
		u2.setLogin("UsuarioTeste2");
		u2.setSenha("123456");
	
		listaUsuario.add(u1);
		listaUsuario.add(u2);
	}
   
	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
		empresa.setId(chaveSequencial++);
		System.out.println("Esta adicionando corretamente");
		
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}


	public void removeEmpresa(Integer id) { 

	    Iterator<Empresa> it = lista.iterator();

	    while(it.hasNext()) { 
	        Empresa emp = it.next();

	        if(emp.getId() == id ) {
	            it.remove();
	        }
	    }
	}

	

	public Empresa buscaEmpresaPelaId(Integer id) {
		for(Empresa empresa: lista) {
			if(empresa.getId() ==id) {
				return empresa;
			}
		}
		return null;
	}

	public Usuario eUsuario(String login, String senha) {
		for(Usuario usuario:listaUsuario) {
			if(usuario.eIgual(login, senha)) {
				return usuario;
			}
			else {
				return null;
			}
		}
		return null;
	}
	}




