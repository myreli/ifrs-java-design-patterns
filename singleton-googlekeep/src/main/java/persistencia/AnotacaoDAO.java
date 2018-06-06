package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Anotacao;

public class AnotacaoDAO implements DAO<Anotacao> {

    public ArrayList<Anotacao> listar() throws SQLException {
        ArrayList<Anotacao> anotacoes = new ArrayList<Anotacao>();
        Connection connection = ConexaoPostgreSQL.getConnection();

        String sql = "SELECT * FROM anotacao;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Anotacao anotacao = new Anotacao();
            anotacao.setId(rs.getInt("id"));
            anotacao.setTitulo(rs.getString("titulo"));
            anotacao.setDescricao(rs.getString("descricao"));
            anotacao.setLixeira(rs.getBoolean("lixeira"));
            anotacoes.add(anotacao);
        }
        ps.close();
        return anotacoes;
    }

    public void inserir(Anotacao anotacao) throws SQLException {
        Connection connection = ConexaoPostgreSQL.getConnection();

        String sql = "INSERT INTO anotacao (titulo, descricao) VALUES (?,?);";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, anotacao.getTitulo());
        ps.setString(2, anotacao.getDescricao());
        ps.execute();
        ps.close();
    }

    public void alterar(Anotacao anotacao) throws SQLException {
        Connection connection = ConexaoPostgreSQL.getConnection();

        String sql = "UPDATE anotacao SET titulo = ?, descricao = ? WHERE id = ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, anotacao.getTitulo());
        ps.setString(2, anotacao.getDescricao());
        ps.setInt(3, anotacao.getId());
        ps.execute();
    }
}
