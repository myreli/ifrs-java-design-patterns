package test;

import model.SQL;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("testing sql builder design pattern...");
		
		try {
			SQL stmt;
			
			stmt = new SQL.Builder().select().from("teste").where("1 = 1").limit(3).build();
			System.out.println(stmt.getQuery());
			
			stmt = new SQL.Builder().select().from("teste").where("1 = 1").and("2 = 2").having("condicao").build();
			System.out.println(stmt.getQuery());
			
			stmt = new SQL.Builder().select().from("teste").join("teste2").on("testeid = teste2id").where("teste1id > 2").build();
			System.out.println(stmt.getQuery());
			
			stmt = new SQL.Builder().delete().from("teste").where("id = 1").build();
			System.out.println(stmt.getQuery());
			
			stmt = new SQL.Builder().insert("teste").columns("um, dois").values("1, 2").build();
			System.out.println(stmt.getQuery());
			
			stmt = new SQL.Builder().insert("teste").columns("um, dois").values("1, 2").value("3, 4").build();
			System.out.println(stmt.getQuery());
		
			stmt = new SQL.Builder().insert("teste").values("1, 2").value("3, 4").build();
			System.out.println(stmt.getQuery());
			
			stmt = new SQL.Builder().update("teste").set("um", "unm").column("dois", "doix").where("um = 1").build();
			System.out.println(stmt.getQuery());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end of tests.");
		
	}
	
}
