package ma.sir.labo.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.labo.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "location_data")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="location_data_seq",sequenceName="location_data_seq",allocationSize=1, initialValue = 1)
public class LocationDataHistory extends HistBusinessObject  {


    public LocationDataHistory() {
    super();
    }

    public LocationDataHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="location_data_seq")
    public Long getId() {
    return id;
    }
}

