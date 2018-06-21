package model;

public class SQL {

	private String query;

	public SQL(String query) {
		this.setQuery(query);
	}

	public static class Builder {

		private String table;
		private String query;
		private Kind kind;

		public Builder() throws Exception {
			if (this.query != null)
				throw new Exception("must start building in an empty SQL statement.");
			query = "";
		}

		public Builder select() throws Exception {
			if (this.kind != null)
				throw new Exception("cannot select already " + this.kind + " started statement.");

			this.kind = Kind.SELECT;
			this.query += "SELECT";
			return this;
		}

		public Builder insert(String table) throws Exception {
			if (this.kind != null)
				throw new Exception("cannot insert in already " + this.kind + " started statement.");

			this.kind = Kind.INSERT;
			this.table = table;
			this.query += "INSERT INTO " + table;
			return this;
		}

		public Builder update(String table) throws Exception {
			if (this.kind != null)
				throw new Exception("cannot update already " + this.kind + " started statement.");
			this.kind = Kind.UPDATE;
			this.table = table;
			this.query += "UPDATE " + table;
			return this;
		}

		public Builder delete() throws Exception {
			if (this.kind != null)
				throw new Exception("cannot delete already " + this.kind + " started statement.");
			this.kind = Kind.DELETE;
			this.query += "DELETE";
			return this;
		}

		public Builder from(String table) throws Exception {
			if (this.kind != Kind.SELECT && this.kind != Kind.DELETE)
				throw new Exception("must SELECT or DELETE from something... not " + this.kind);

			this.table = table;
			this.query += " FROM " + table;
			return this;
		}
		
		public Builder as(String alias) {
			this.query += " AS " + alias;
			return this;
		}

		public Builder where(String condition) {
			this.query += " WHERE " + condition;
			return this;
		}
		
		public Builder and(String condition) {
			this.query += " AND " + condition;
			return this;
		}
		
		public Builder or(String condition) {
			this.query += " OR " + condition;
			return this;
		}
		
		public Builder having(String condition) {
			this.query += " HAVING " + condition;
			return this;
		}
		
		public Builder limit(int limit) {
			this.query += " LIMIT " + limit;
			return this;
		}
		
		public Builder join(String table) {
			this.query += " JOIN " + table;
			return this;
		}
		
		public Builder on(String c) {
			this.query += " ON " + c;
			return this;
		}
		
		public Builder columns(String columns) {
			this.query += " (" + columns + ")";
			return this;
		}
		
		public Builder values(String values) {
			this.query += " VALUES (" + values + ")";
			return this;
		}
		
		public Builder value(String value) {
			this.query += ", (" + value + ")";
			return this;
		}
		
		public Builder set(String name, String value) {
			this.query += " SET " + name + " = " + value;
			return this;
		}
		
		public Builder column(String name, String value) {
			this.query += ", " + name + " = " + value;
			return this;
		}

		public SQL build() {
			return new SQL(this);
		}

	}

	private SQL(Builder builder) {
		this.setQuery(builder.query);
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

}
