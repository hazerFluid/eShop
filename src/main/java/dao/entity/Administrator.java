package dao.entity;

import javax.persistence.*;

@Entity //ready
@Table(name = "administrator")
@PrimaryKeyJoinColumn(name = "administrator_id", referencedColumnName = "visitor_id")
public class Administrator extends Visitor {

    @Id
    @Column(name = "administrator_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int administratorId;


    public int getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(int administratorId) {
        this.administratorId = administratorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Administrator that = (Administrator) o;

        if (administratorId != that.administratorId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return administratorId;
    }
}
