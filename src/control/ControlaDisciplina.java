/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import model.bean.Disciplina;

/**
 *
 * @author Alexandre
 */
public class ControlaDisciplina {
    
    public boolean insereDisciplina(int codigo, String disciplina, String professor) throws SQLException {
        Disciplina disc = new Disciplina();
        
        disc.setCodigo(codigo);
        disc.setDisciplina(disciplina);
        disc.setProfessor(professor);
        
        return true;
    }
    
    public boolean excluiDisciplina(int codigo) throws SQLException, MySQLIntegrityConstraintViolationException {
        Disciplina disc = new Disciplina();
        
        disc.setCodigo(codigo);
        
        return true;
    }
    
    public ArrayList<Disciplina> buscaDisciplina(int busca, boolean alfab) throws SQLException {
        ArrayList<Disciplina> listaDisciplina = new ArrayList<Disciplina>();
        
        return listaDisciplina;
    }
    
    public void preencheTabela(DefaultTableModel model, ArrayList lista) {
        model.setNumRows(0);
        
        Iterator it = lista.iterator();
            
            while(it.hasNext()) {
                Disciplina disc = (Disciplina) it.next();
                model.addRow(new Object[]{disc.getCodigo(),disc.getDisciplina(),disc.getProfessor()});
            }
    }
}
