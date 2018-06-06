package persistencia;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author iapereira
 */
interface DAO<T> {
    ArrayList<T> listar() throws SQLException;
    void inserir(T t) throws SQLException;
    void alterar(T t) throws SQLException;  
}
