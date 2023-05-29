package ma.sir.obs.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.obs.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "food")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="food_seq",sequenceName="food_seq",allocationSize=1, initialValue = 1)
public class FoodHistory extends HistBusinessObject  {


    public FoodHistory() {
    super();
    }

    public FoodHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="food_seq")
    public Long getId() {
    return id;
    }
}

