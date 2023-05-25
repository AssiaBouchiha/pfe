package ma.sir.labo.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.labo.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "specimen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="specimen_seq",sequenceName="specimen_seq",allocationSize=1, initialValue = 1)
public class SpecimenHistory extends HistBusinessObject  {


    public SpecimenHistory() {
    super();
    }

    public SpecimenHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="specimen_seq")
    public Long getId() {
    return id;
    }
}

