package ma.sir.obs.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.obs.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "laboratory")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="laboratory_seq",sequenceName="laboratory_seq",allocationSize=1, initialValue = 1)
public class LaboratoryHistory extends HistBusinessObject  {


    public LaboratoryHistory() {
    super();
    }

    public LaboratoryHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="laboratory_seq")
    public Long getId() {
    return id;
    }
}

