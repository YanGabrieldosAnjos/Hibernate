import org.hibernate.Session;
import org.hibernate.Transaction;

public class NotaBD {
    public static int createNota(Nota notaObj) {
        Factory factory = new Factory();
        Session sessionObj = factory.getSessionFactory().openSession();

        //Creating Transaction Object
        Transaction transObj = sessionObj.beginTransaction();
        sessionObj.save(notaObj);

        // Transaction Is Committed To Database
        transObj.commit();

        // Closing The Session Object
        sessionObj.close();

        return notaObj.getCodigo();
    }
}
