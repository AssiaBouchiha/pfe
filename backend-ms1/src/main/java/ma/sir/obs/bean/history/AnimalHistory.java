package ma.sir.obs.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.obs.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "animal")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="animal_seq",sequenceName="animal_seq",allocationSize=1, initialValue = 1)
public class AnimalHistory extends HistBusinessObject  {


    public AnimalHistory() {
    super();
    }

    public AnimalHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="animal_seq")
    public Long getId() {
    return id;
    }
}

