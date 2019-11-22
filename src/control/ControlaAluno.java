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
import model.bean.Aluno;

/**
 *
 * @author Alexandre
 */
public class ControlaAluno {
    
    public boolean insereAluno(int ra, String nome, String status) throws SQLException {
        Aluno aln = new Aluno();
        
        aln.setRa(ra);
        aln.setNome(nome);
        aln.setStatus(status);
        
        return true;
    }
    
    public boolean excluiAluno(int ra) throws SQLException, MySQLIntegrityConstraintViolationException {
        Aluno aln = new Aluno();
        
        aln.setRa(ra);
        
        return true;
    }
    
    public ArrayList<Aluno> buscaAluno(int busca, boolean alfab) throws SQLException {
        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
        
        return listaAlunos;
    }
    
    public void preencheTabela(DefaultTableModel model, ArrayList lista) {
        model.setNumRows(0);
        
        Iterator it = lista.iterator();
            
            while(it.hasNext()) {
                Aluno al = (Aluno) it.next();
                model.addRow(new Object[]{al.getRa(),al.getNome(),al.getStatus()});
            }
    }
}
