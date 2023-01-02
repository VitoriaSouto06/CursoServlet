package acao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NovaEmpresaForm implements Acao {
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		return "forward:formNovaEmpresa.jsp";
	}
}
