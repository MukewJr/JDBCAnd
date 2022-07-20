package peaksoft.service;

import peaksoft.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {

    void createUsersTable();

    void dropUsersTable();

    void saveUser(long testId, String first_name, String last_name, byte age);

    void removeUserById(long id);

    List<User> getAllUsers() throws SQLException;

    void cleanUsersTable();
}

