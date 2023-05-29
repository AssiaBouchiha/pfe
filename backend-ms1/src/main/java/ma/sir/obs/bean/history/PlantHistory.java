package ma.sir.obs.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.obs.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "plant")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="plant_seq",sequenceName="plant_seq",allocationSize=1, initialValue = 1)
public class PlantHistory extends HistBusinessObject  {


    public PlantHistory() {
    super();
    }

    public PlantHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="plant_seq")
    public Long getId() {
    return id;
    }
}

