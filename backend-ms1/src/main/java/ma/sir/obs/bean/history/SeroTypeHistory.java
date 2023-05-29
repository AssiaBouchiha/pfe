package ma.sir.obs.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.obs.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "sero_type")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="sero_type_seq",sequenceName="sero_type_seq",allocationSize=1, initialValue = 1)
public class SeroTypeHistory extends HistBusinessObject  {


    public SeroTypeHistory() {
    super();
    }

    public SeroTypeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="sero_type_seq")
    public Long getId() {
    return id;
    }
}

