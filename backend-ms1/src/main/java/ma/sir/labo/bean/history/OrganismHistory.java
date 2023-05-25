package ma.sir.labo.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.labo.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "organism")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="organism_seq",sequenceName="organism_seq",allocationSize=1, initialValue = 1)
public class OrganismHistory extends HistBusinessObject  {


    public OrganismHistory() {
    super();
    }

    public OrganismHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="organism_seq")
    public Long getId() {
    return id;
    }
}

