package table;

import model.Filme;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

/**
 *
 * @author Fernando Xavier
 */
public class FilmeTableModel extends AbstractTableModel {
    
    public static final int COL_ID = 0;
    public static final int COL_TITULO = 1;
    public static final int COL_GENERO = 2;
    public static final int COL_PRODUTORA = 3;
    public static final int COL_DIRETOR = 4;
    public static final int COL_ANO = 5;
    public ArrayList<Filme> lista;
    
    public FilmeTableModel(ArrayList<Filme>l) {
        lista = new ArrayList<Filme>(l);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Filme filme = lista.get(linhas);
        if (colunas == COL_ID) return filme.getId();
        if (colunas == COL_TITULO) return filme.getTitulo();
        if (colunas == COL_GENERO) return filme.getGenero();
        if (colunas == COL_PRODUTORA) return filme.getProdutora();
        if (colunas == COL_DIRETOR) return filme.getDiretor();
        if (colunas == COL_ANO) return filme.getAno();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas) {
        if (colunas == COL_ID) return "Id";
        if (colunas == COL_TITULO) return "Titulo";
        if (colunas == COL_GENERO) return "Genero";
        if (colunas == COL_PRODUTORA) return "Produtora";
        if (colunas == COL_DIRETOR) return "Diretor";
        if (colunas == COL_ANO) return "Ano";
        return "";
    }
    
}
