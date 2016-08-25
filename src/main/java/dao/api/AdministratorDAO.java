package dao.api;

import dao.entity.Visitor;

public interface AdministratorDAO {

    Visitor getVisitorById(int id);
    Visitor getVisitorByMail(String mail);
    boolean isAdministrator(Visitor visitor);
}
