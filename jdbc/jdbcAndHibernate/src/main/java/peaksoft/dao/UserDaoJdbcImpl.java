package peaksoft.dao;

import peaksoft.model.User;
import peaksoft.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJdbcImpl implements UserDao {

   public final Util util=new Util();
    public UserDaoJdbcImpl() {

    }

    public void createUsersTable() {

        String createTable = "create table if not exists Users(" +
                "id int primary key,"+
                "first_name varchar," +
                "last_name varchar," +
                "age int);";

        try(Connection connection = util.getConnection();
            Statement statement = connection.createStatement()) {
            statement.executeUpdate(createTable);
            System.out.println("table created!");
        } catch (SQLException e) {
            System.out.println("!!!");
        }

    }

    public void dropUsersTable() {
        String dropTable = "drop table if exists Users";
        try(Connection connection = util.getConnection();
            Statement statement = connection.createStatement()) {
            statement.executeUpdate(dropTable);
            System.out.println("table drop");
        } catch (SQLException e) {
            System.out.println("!!!");
        }
    }

    @Override
    public void saveUser(long id,String first_name, String last_name, byte age) {
        String save = "insert into users (id,first_name,last_name,age)" +
                "values (?,?,?,?)";
        try (Connection connection = util.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(save)) {
            preparedStatement.setLong(1, id);
            preparedStatement.setString(2, first_name);
            preparedStatement.setString(3, last_name);
            preparedStatement.setInt(4, age);
            preparedStatement.executeUpdate();
            System.out.println("New student added: "+ first_name);
        }catch (SQLException e){
            System.out.println("!!!");
        }

    }
    public void removeUserById(long id ) {

String sql="delete from users where id=?";
       try (Connection connection= util.getConnection();
           PreparedStatement ps= connection.prepareStatement(sql)){

            ps.setLong(1, 4);
             ps.executeUpdate();
           System.out.println("this user is removed");

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("!!!");
        }

    }

    public List<User> getAllUsers() throws SQLException {
        String values = "select * from users";
        try(Connection connection = util.getConnection();
            Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(values);
            List<User> users = new ArrayList<>();
            while (resultSet.next()){
                users.add(new User(resultSet.getLong("id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getByte("age")));
            }
            return users;
        } catch (SQLException e) {
            System.out.println("!!!");
            throw new SQLException();
        }
    }

    public void cleanUsersTable() {
        String dropTable = "delete from users";
        try(Connection connection = util.getConnection();
            Statement statement = connection.createStatement()) {
            statement.executeUpdate(dropTable);
            System.out.println("table cleaned");
        } catch (SQLException e) {
            System.out.println("!!!");
        }

    }
}