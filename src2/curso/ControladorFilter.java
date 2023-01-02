package curso;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import acao.Acao;

@WebFilter("/entrada")
public class ControladorFilter extends HttpFilter implements Filter {
       
   @Override
   public void init() {
}
   @Override
   public void destroy() {
}
	public void doFilter(ServletRequest servletrequest, ServletResponse servletresponse, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletrequest;
		HttpServletResponse response = (HttpServletResponse) servletresponse;
		String paramAcao = request.getParameter("acao");

		
		
		String nome;
	      String nomeDaClasse = "acao." + paramAcao;
	      try {
	          Class classe = Class.forName(nomeDaClasse);//carrega a classe com o nome 
	          Acao acao = (Acao) classe.newInstance(); 
	          nome = acao.executa(request, response);
	      } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
	          throw new ServletException(e);
	      }
	        

	     
	      String[] tipoEEndereco = nome.split(":");
	      
	      if(tipoEEndereco[0].equals("forward")) {
	      RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEEndereco[1]);
			rd.forward(request, response);
			}else{
				response.sendRedirect(tipoEEndereco[1]);
			}
	     
	    }
	}

	


