package ma.sir.labo.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.labo.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "alert")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="alert_seq",sequenceName="alert_seq",allocationSize=1, initialValue = 1)
public class AlertHistory extends HistBusinessObject  {


    public AlertHistory() {
    super();
    }

    public AlertHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="alert_seq")
    public Long getId() {
    return id;
    }
}

