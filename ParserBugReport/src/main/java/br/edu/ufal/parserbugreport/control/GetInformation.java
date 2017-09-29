package br.edu.ufal.parserbugreport.control;

import br.edu.ufal.parserbugreport.model.Bug;
import br.edu.ufal.parserbugreport.model.CommitFix;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by gabrielnunes on 29/09/17.
 */
public class GetInformation {

    /**
     * Retorna o tamanho ta lista de commits de fix
     *
     * @param obj
     * @param listSize
     * @return
     */
    protected static int sizeFix(Bug obj, int listSize) {
        ArrayList<CommitFix> listFix = obj.getCommitFix();

        if (listFix.size() > 1) {
            listSize++;
        }
        return listSize;
    }

    /**
     * Imprime na tela IssueID,CommitReport,CommitFix de cada issue
     *
     * @param obj
     */
    protected static void output(Bug obj) {
        ArrayList<CommitFix> listFix = obj.getCommitFix();

        for (CommitFix fix : listFix) {
            System.out.println(obj.getIssueID() + "," + obj.getCommitReport().getCommitReport() + "," + fix.getCommitFix());
        }
    }

    /**
     * Retorna a quantidade de commits de fix que foram feitos pelo usuário
     *
     * @param obj
     * @param user
     * @return
     */
    protected static int getTypeUser(Bug obj, int user) {
        if (Objects.equals(obj.getTypeFix(), "By user")) {
            user++;
        }
        return user;
    }

    /**
     * Reporta a quantidade de commits de fix que foram feitos pela data
     *
     * @param obj
     * @param date
     * @return
     */
    protected static int getTypeDate(Bug obj, int date) {
        if (Objects.equals(obj.getTypeFix(), "By date")) {
            date++;
        }
        return date;
    }
}
