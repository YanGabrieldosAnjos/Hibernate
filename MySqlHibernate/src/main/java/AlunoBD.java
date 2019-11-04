import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AlunoBD {
    public static String createAluno(Aluno alunoObj) {
        Factory factory = new Factory();
        Session sessionObj = factory.getSessionFactory().openSession();

        //Creating Transaction Object
        Transaction transObj = sessionObj.beginTransaction();
        sessionObj.save(alunoObj);

        // Transaction Is Committed To Database
        transObj.commit();

        // Closing The Session Object
        sessionObj.close();

        return alunoObj.getMatricula();
    }

    public static void insertAlunoWithNotas(Aluno alunoObj, Nota notas[]){
        createAluno(alunoObj);
        NotaBD bd = new NotaBD();
        for (Nota nota : notas) {
            bd.createNota(nota);
        }
    }
}
