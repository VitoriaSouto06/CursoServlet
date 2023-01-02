package acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Banco;
import modelo.Empresa;

public class NovaEmpresa implements Acao{

	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {

		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataabertura=null;
		
		String nomeempresa = request.getParameter("nome");
		
		try {
			dataabertura = sdf.parse(request.getParameter("data"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Empresa empresa = new Empresa();
		empresa.setNome(nomeempresa);
		empresa.setDataAbertura(dataabertura);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		return "redirect:entrada?acao=ListaEmpresas";
		
		
	
		
	}
	
}
