package ma.sir.obs.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.obs.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "animal_specie")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="animal_specie_seq",sequenceName="animal_specie_seq",allocationSize=1, initialValue = 1)
public class AnimalSpecieHistory extends HistBusinessObject  {


    public AnimalSpecieHistory() {
    super();
    }

    public AnimalSpecieHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="animal_specie_seq")
    public Long getId() {
    return id;
    }
}

