import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import modelo.Anotacao;
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
		
		final MustacheTemplateEngine mustache = new MustacheTemplateEngine();
		
		final AnotacaoDAO anotacaoDAO = new AnotacaoDAO();
	
		Spark.get("/", new TemplateViewRoute() {

			public ModelAndView handle(Request req, Response res) throws Exception {
				ArrayList<Anotacao> notas = anotacaoDAO.listar();
				
				Map<String, Object> map = new HashMap<String, Object>();
		        if (req.session().attribute("email") != null) map.put("email", req.session().attribute("email").toString());
		        if (req.session().attribute("codigo") != null) map.put("codigo", req.session().attribute("codigo").toString());
		        
		        map.put("anotacoes", notas);

		        return new ModelAndView(map, "index.html");
			}
			
		}, new MustacheTemplateEngine());
		
		Spark.get("/notas", new Route() {
			
			public Object handle(Request req, Response res) throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
		});
		
		Spark.get("/notas/:id", new Route() {
			
			public Object handle(Request req, Response res) throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
		});
		
		Spark.post("/notas", new Route() {
			
			public Object handle(Request req, Response res) throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
		});
		
		Spark.put("/notas/:id", new Route() {
			
			public Object handle(Request req, Response res) throws Exception {
				// TODO Auto-generated method stub
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