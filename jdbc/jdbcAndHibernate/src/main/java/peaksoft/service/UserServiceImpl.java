package peaksoft.service;

import peaksoft.dao.UserDao;
import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {

    UserDao userDao=new UserDaoJdbcImpl();

    public void createUsersTable() {
     userDao.createUsersTable();
    }

    public void dropUsersTable() {
      userDao.dropUsersTable();
    }


    public void saveUser(long testId, String first_name, String last_name, byte age) {
     userDao.saveUser(4L,"Muktarali","Kurbanov", (byte) 28);
    }
    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() throws SQLException {
        return userDao.getAllUsers();
    }

    public void cleanUsersTable() {
        userDao.cleanUsersTable();
    }
}
