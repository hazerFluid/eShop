package dao.api;

import dao.exceptions.EntityException;

import java.util.List;


/**
 * Generic interface for Data Access Object.
 * To be implemented.
 * Contains basic CRUD operations.
 */

public interface GenericDAO<T, PK> {

    /**
     * Gets all objects of T type from Database
     */
    List<T> findAll();

    /**
     * Save object to database
     */
    T save(T t) throws EntityException;

    /**
     * Get object from database by primary key
     */
    T findById(PK id) throws EntityException;

    /**
     * Delete object from database by primary key
     */
    void delete(T t) throws EntityException;

    /**
     * Save changes made on the object
     */
    T update(T t) throws EntityException;

}
