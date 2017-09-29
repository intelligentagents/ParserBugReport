package br.edu.ufal.parserbugreport.control;

import br.edu.ufal.parserbugreport.model.Bug;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by gabrielnunes on 29/09/17.
 */
public class App {

    public static void run(String folderPath){
        File folder = new File(folderPath);
        File[] listOfFiles = folder.listFiles();
        Gson gson = new Gson();

        int user = 0;
        int date = 0;
        int listSize = 0;
        try {
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    BufferedReader br = new BufferedReader(new FileReader(folder + "/" + file.getName()));
                    Bug obj = gson.fromJson(br, Bug.class);

//                    obj.getTitle(); //Titulo da issue
//                    obj.getCommitFix(); //Lista de objetos commits de Fix
//                    obj.getCommitReport(); //Obj commit report
//                    obj.getTypeFix(); //Tipo de Fix
//                    obj.getIssueID(); //Issue ID;
//                    obj.getAuthor(); //Author da issue
//                    obj.getComments(); //comentários da issue
//                    obj.getFixDate(); //Data do commit de fix
//                    obj.getReportDate(); //Data do commit de report
//                    obj.getLabels(); //Labels da issue
//                    listSize = GetInformation.sizeFix(obj,listSize); //Tamanho da lista de commits de fix
//                    user = GetInformation.getTypeUser(obj,user); //Quantidade de issues que foram fechadas pelo usuário
//                    date = GetInformation.getTypeDate(obj,date); //Quantidade de issues que foram fechadas por data
//                    GetInformation.output(obj); //Output em tela IssueID,CommitReport,CommitFix
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
