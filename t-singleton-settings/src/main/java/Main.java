import static spark.Spark.*;

import spark.Request;
import spark.Response;
import spark.Route;

public class Main {
	
	public static void main(String[] args) {
		
		staticFiles.location("/public");
		
		Configuracao c  = Configuracao.getUniqueInstance();
	
		c.setFrase("unique instance sentence");
		c.setTitulo("unique instance titulo");
		c.setNome("unique instance nome");
		c.setTamanhoTituloMax(15);
		c.setTamanhoTituloMin(2);
		
		// impossível:
		// c = new Configuracao();
		 
		get("/", (req, res) -> "Pagina 1 " + c.toString());
		
		get("/outra", (req, res) -> "Pagina 2 " + c.toString());
		
		post("/seta", new Route() {
			
			public Object handle(Request req, Response res) throws Exception {
		        
				Configuracao.getUniqueInstance().setNome(req.queryParams("nome"));
				Configuracao.getUniqueInstance().setTitulo(req.queryParams("titulo"));
				Configuracao.getUniqueInstance().setFrase(req.queryParams("frase"));
				Configuracao.getUniqueInstance().setTamanhoTituloMax(Integer.parseInt(req.queryParams("tamanhoTituloMax")));
				Configuracao.getUniqueInstance().setTamanhoTituloMin(Integer.parseInt(req.queryParams("tamanhoTituloMin")));
				
				res.redirect("/");
				
				return null;
			}
			
		});
		
		
		
	}
}
