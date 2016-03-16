import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 * Created by Benki on 16.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        DBWorker dbWorker = new DBWorker();

        String query ="SELECT * FROM bdcustоmer";

        try {
            Statement statement = dbWorker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                Customer customer = new Customer();
                customer.setId(resultSet.getInt(1));
                customer.setName(resultSet.getString(2));
                customer.setQuad(resultSet.getInt(3));
                customer.setNmuber(resultSet.getInt(4));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
