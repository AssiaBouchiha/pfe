package ma.sir.labo.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.labo.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "environment")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="environment_seq",sequenceName="environment_seq",allocationSize=1, initialValue = 1)
public class EnvironmentHistory extends HistBusinessObject  {


    public EnvironmentHistory() {
    super();
    }

    public EnvironmentHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="environment_seq")
    public Long getId() {
    return id;
    }
}

