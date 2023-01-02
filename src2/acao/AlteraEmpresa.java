package acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Banco;
import modelo.Empresa;

public class AlteraEmpresa implements Acao{
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeempresa = request.getParameter("nome");
		String dataabertura = request.getParameter("data");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date data;
		try {
			data = sdf.parse(dataabertura);
		} catch (ParseException e) {
			
			throw new ServletException(e);
		}
		 Banco banco = new Banco();
	        Empresa empresa = banco.buscaEmpresaPelaId(id);
	        empresa.setNome(nomeempresa);
	        empresa.setDataAbertura(data);
		
	        return "redirect:entrada?acao=ListaEmpresas";
		
	}
	
}
