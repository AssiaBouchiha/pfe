package ma.sir.labo.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.labo.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "location_type")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="location_type_seq",sequenceName="location_type_seq",allocationSize=1, initialValue = 1)
public class LocationTypeHistory extends HistBusinessObject  {


    public LocationTypeHistory() {
    super();
    }

    public LocationTypeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="location_type_seq")
    public Long getId() {
    return id;
    }
}

