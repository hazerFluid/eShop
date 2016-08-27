package dao.api;

import dao.exceptions.EntityException;

import java.util.List;

public interface GenericDAO<T, PK> {

    /**Get all objects from database*/
    List<T> getAll();

    /** Save object to database */
    T create(T t) throws EntityException;

    /** Get object from database by primary key*/
    T read(PK id) throws EntityException;

    /** Delete object from database by primary key */
    void delete(T t) throws EntityException;

    /** Save changes made on the object */
    T update(T t) throws EntityException;

}
