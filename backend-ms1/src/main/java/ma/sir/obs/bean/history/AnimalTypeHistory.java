package ma.sir.obs.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.obs.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "animal_type")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="animal_type_seq",sequenceName="animal_type_seq",allocationSize=1, initialValue = 1)
public class AnimalTypeHistory extends HistBusinessObject  {


    public AnimalTypeHistory() {
    super();
    }

    public AnimalTypeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="animal_type_seq")
    public Long getId() {
    return id;
    }
}

