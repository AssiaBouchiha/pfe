package ma.sir.labo.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.labo.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "reason")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="reason_seq",sequenceName="reason_seq",allocationSize=1, initialValue = 1)
public class ReasonHistory extends HistBusinessObject  {


    public ReasonHistory() {
    super();
    }

    public ReasonHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="reason_seq")
    public Long getId() {
    return id;
    }
}

