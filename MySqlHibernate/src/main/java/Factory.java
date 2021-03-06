import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Factory {

    //public final static Logger logger = Logger.getLogger(AlunoBD.class);

    // Method Used To Create The Hibernate's SessionFactory Object
    public static SessionFactory getSessionFactory() {
        // Creating Configuration Instance & Passing Hibernate Configuration File
        Configuration configObj = new Configuration();
        configObj.configure("hibernate.cfg.xml");

        // Since Hibernate Version 4.x, Service Registry Is Being Used
        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build();

        // Creating Hibernate Session Factory Instance
        SessionFactory factoryObj = configObj.buildSessionFactory(serviceRegistryObj);
        return factoryObj;
    }
}
