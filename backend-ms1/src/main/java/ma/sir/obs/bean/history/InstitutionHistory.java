package ma.sir.obs.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.obs.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "institution")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="institution_seq",sequenceName="institution_seq",allocationSize=1, initialValue = 1)
public class InstitutionHistory extends HistBusinessObject  {


    public InstitutionHistory() {
    super();
    }

    public InstitutionHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="institution_seq")
    public Long getId() {
    return id;
    }
}

