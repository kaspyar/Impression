import Hotel.Client.Client;
import Model.ManagerDAO;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


/**
 * Created by Slavko_O on 03.02.2015.
 */
public class Main {
    private static Logger LOG = Logger.getLogger(Main.class.toString());
    public static void main(String [] args){
        BasicConfigurator.configure();
        LOG.info("Hello world");
        Client client = new Client(1, "Yaroslav","Kaspryshyn","kaspyar@yahoo.com","0678762423", "Ukraine");
        LOG.info(client.toString());
        ManagerDAO managerDAO = new ManagerDAO();
        ManagerDAO managerDAO1 = new ManagerDAO();
    }
}
