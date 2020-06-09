package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Filme;
/**
 *
 * @author Fernando Xavier
 */
public class FilmeDAO {
    
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Filme> lista = new ArrayList<Filme>();
    
    public FilmeDAO() {
        /* Conecta no banco */
        conn = new ConnectionFactory().getConexao();
    }
    
    /* Insere registro no banco */
    public void inserir(Filme filme) {
        String sql = "INSERT INTO filme (id, titulo, genero, produtora, diretor, ano) VALUES (?,?,?,?,?,?)";
        try {
            
            System.out.print(filme.getId());
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, filme.getId());
            stmt.setString(2, filme.getTitulo());
            stmt.setString(3, filme.getGenero());
            stmt.setString(4, filme.getProdutora());
            stmt.setString(5, filme.getDiretor());
            stmt.setString(6, filme.getAno());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Filme inserido com sucesso!");
            
        } catch (SQLException erro) {
            if (erro instanceof SQLIntegrityConstraintViolationException) {
                JOptionPane.showMessageDialog(null, "Id já cadastrado!");
            } else {
                throw new RuntimeException("Erro 2: "+ erro);
            }
        }
    }
    
    /* Atualiza registro no banco */
    public void alterar(Filme filme) {
        String sql = "UPDATE filme SET titulo = ?, genero = ?, produtora = ?, diretor = ?, ano = ? WHERE id = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, filme.getTitulo());
            stmt.setString(2, filme.getGenero());
            stmt.setString(3, filme.getProdutora());
            stmt.setString(4, filme.getDiretor());
            stmt.setString(5, filme.getAno());
            stmt.setInt(6, filme.getId());
            stmt.execute();
            stmt.close();
         } catch (SQLException erro) {
            if (erro instanceof SQLIntegrityConstraintViolationException) {
                JOptionPane.showMessageDialog(null, "Id já cadastrado!");
            } else {
                throw new RuntimeException("Erro 3: "+ erro);
            }
        }
    }
    
    /* Exclui registro no banco */
    public void excluir(int valor) {
        String sql = "DELETE FROM filme WHERE id = "+valor;
        try {
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } catch (Exception erro) {
            throw new RuntimeException("Erro 4: "+ erro);
        }
    }
    
    /* Retorna lista de todos os registros */
    public ArrayList<Filme> listarTodos() {
        String sql = "SELECT * FROM filme";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                Filme filme = new Filme();
                filme.setId(rs.getInt("id"));
                filme.setTitulo(rs.getString("titulo"));
                filme.setGenero(rs.getString("genero"));
                filme.setProdutora(rs.getString("produtora"));
                filme.setDiretor(rs.getString("diretor"));
                filme.setAno(rs.getString("ano"));
                lista.add(filme);
            }
        } catch (Exception erro) {
            throw new RuntimeException("Erro 5: "+ erro);
        }
        return lista;
    }
    
    /* Retorna lista de registros de acordo com filtro de pesquisa */
    public ArrayList<Filme> listarTodosDescricao(String valor) {
        String sql = "SELECT * FROM filme WHERE titulo LIKE '%"+valor+"%' OR id = '"+valor+"' ";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                Filme filme = new Filme();
                filme.setId(rs.getInt("id"));
                filme.setTitulo(rs.getString("titulo"));
                filme.setGenero(rs.getString("genero"));
                filme.setProdutora(rs.getString("produtora"));
                filme.setDiretor(rs.getString("diretor"));
                filme.setAno(rs.getString("ano"));
                lista.add(filme);
            }
        } catch (Exception erro) {
            throw new RuntimeException("Erro 5: "+ erro);
        }
        return lista;
    }
    
    /* Deleta todos os registros no banco */
    public void esvaziarTabela() {
        String sql = "DELETE FROM filme";
        try {
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } catch (Exception erro) {
            throw new RuntimeException("Erro 6: "+ erro);
        }
    }
    
    /* Retorna número de registros no banco */
    public int getNumRegistros() {
        String sql = "SELECT COUNT(*) FROM filme;";
        int numRegistros = 0;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                 numRegistros = rs.getInt("count(*)");
            }
        } catch (Exception erro) {
            throw new RuntimeException("Erro 7: "+ erro);
        }
        
        return numRegistros;
    }
    
    
    
}
