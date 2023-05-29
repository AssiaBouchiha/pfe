package ma.sir.obs.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.obs.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "location")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="location_seq",sequenceName="location_seq",allocationSize=1, initialValue = 1)
public class LocationHistory extends HistBusinessObject  {


    public LocationHistory() {
    super();
    }

    public LocationHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="location_seq")
    public Long getId() {
    return id;
    }
}

