package ma.sir.labo.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.labo.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "antibiotic")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="antibiotic_seq",sequenceName="antibiotic_seq",allocationSize=1, initialValue = 1)
public class AntibioticHistory extends HistBusinessObject  {


    public AntibioticHistory() {
    super();
    }

    public AntibioticHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="antibiotic_seq")
    public Long getId() {
    return id;
    }
}

