package ma.sir.labo.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.labo.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "department")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="department_seq",sequenceName="department_seq",allocationSize=1, initialValue = 1)
public class DepartmentHistory extends HistBusinessObject  {


    public DepartmentHistory() {
    super();
    }

    public DepartmentHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="department_seq")
    public Long getId() {
    return id;
    }
}

