package dao.api;

import org.hibernate.Session;

public interface DAO<T> {

    public void create(T object);

    public T get(Class<T> clazz, int id);

    public void update(T object);

    public void delete(T object);

}
