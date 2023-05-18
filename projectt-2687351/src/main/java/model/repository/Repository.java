package model.repository;

import model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface Repository {
    List<User> listAllobj() throws SQLException;

    User byIdObj(Integer id) throws SQLException;

    Integer saveObj(User user) throws SQLException;

    void deleteObj(Integer id) throws SQLException;

    User createObj(ResultSet rs) throws SQLException;

    public interface Repository <T>{
        List<T> listAllObj() throws SQLException;

        T byIdOBj(Integer id)throws  SQLException;

        Integer saveObj(T t) throws SQLException;

        Void deleteObj(Integer id) throws SQLException;

        T createObj(ResultSet rs) throws SQLException;
    }
}
