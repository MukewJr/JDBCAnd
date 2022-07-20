package peaksoft;

import peaksoft.dao.UserDao;
import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.service.UserService;
import peaksoft.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь

        UserDao userDao=new UserDaoJdbcImpl();

        //userDao.createUsersTable();

//        userDao.saveUser(5L,"Nak","Sh", (byte) 26);
//        userDao.saveUser(1L,"Mukesh","Kurbanov",(byte) 28);
//        userDao.saveUser(2L,"Nak","Sh", (byte) 26);
//        userDao.saveUser(4L,"Mukesh","Kurbanov",(byte) 28);

        //System.out.println(userDao.getAllUsers());

        //userDao.cleanUsersTable();

        //userDao.removeUserById(5);

        //userDao.dropUsersTable();
    }
}
