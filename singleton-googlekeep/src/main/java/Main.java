import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import modelo.Anotacao;
import modelo.Configuracao;
import persistencia.AnotacaoDAO;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;
import spark.TemplateEngine;
import spark.TemplateViewRoute;
import spark.template.mustache.MustacheTemplateEngine;

public class Main {
	public static void main(String[] args) {

		Spark.staticFileLocation("/public");
		
		final TemplateEngine mustache = new MustacheTemplateEngine();
		
		final AnotacaoDAO anotacaoDAO = new AnotacaoDAO();
		
		final Map<String, Object> params = new HashMap<String, Object>();
			
		Spark.get("/", new TemplateViewRoute() {
			
			public ModelAndView handle(Request req, Response res) throws Exception {
				
				params.clear();
				params.put("configuracao", Configuracao.getUniqueInstance());
				
		        return new ModelAndView(params, "index.html");
			}
			
		}, mustache);
		
		Spark.post("/edit", new Route() {
			
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
		
		Spark.get("/notas", new TemplateViewRoute() {
			
			public ModelAndView handle(Request req, Response res) throws Exception {
				ArrayList<Anotacao> notas = anotacaoDAO.listar();
				
				params.clear();
				params.put("anotacoes", notas);
				
		        return new ModelAndView(params, "notas.html");
			}
			
		}, mustache);
		
		Spark.get("/notas/:id", new Route() {
			
			public Object handle(Request req, Response res) throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
		});
		
		Spark.post("/notas", new Route() {
			
			public Object handle(Request req, Response res) throws Exception {
				
				anotacaoDAO.inserir(new Anotacao(req.queryParams("titulo"), req.queryParams("descricao")));
				
				res.redirect("/notas");
				return null;
			}
		});
		
		Spark.put("/notas/:id", new Route() {
			
			public Object handle(Request req, Response res) throws Exception {
				
				anotacaoDAO.alterar(new Anotacao(req.queryParams("titulo"), req.queryParams("descricao"), Integer.parseInt(req.queryParams("id"))));
				
				res.redirect("/notas");
				return null;
			}
		});
		
		Spark.delete("/notas/:id", new Route() {
			
			public Object handle(Request req, Response res) throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
		});
	}
}