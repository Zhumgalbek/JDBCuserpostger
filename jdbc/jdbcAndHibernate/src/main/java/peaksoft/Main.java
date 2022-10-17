package peaksoft;

import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.model.User;

import java.sql.SQLException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserDaoJdbcImpl userDaoJdbc = new UserDaoJdbcImpl();
        userDaoJdbc.createUsersTable();
//        userDaoJdbc.dropUsersTable();
//        userDaoJdbc.saveUser("argen ","gena",(byte)8 );
//        userDaoJdbc.saveUser("syimyk ","mena",(byte)8 );
//        userDaoJdbc.saveUser("Kanat ","Subanov",(byte)13 );
//        userDaoJdbc.removeUserById(1);
//        for (User u: userDaoJdbc.getAllUsers()) {
//            System.out.println(u);
//        }
//        userDaoJdbc.cleanUsersTable();



    }
}
