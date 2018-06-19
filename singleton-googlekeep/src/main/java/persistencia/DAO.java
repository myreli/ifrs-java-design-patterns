package persistencia;

import java.sql.SQLException;
import java.util.List;

interface DAO<T> {
    List<T> listar() throws SQLException;
    void inserir(T t) throws SQLException;
    void alterar(T t) throws SQLException;  
}
