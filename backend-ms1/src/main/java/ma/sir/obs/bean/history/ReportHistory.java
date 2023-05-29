package ma.sir.obs.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.obs.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "report")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="report_seq",sequenceName="report_seq",allocationSize=1, initialValue = 1)
public class ReportHistory extends HistBusinessObject  {


    public ReportHistory() {
    super();
    }

    public ReportHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="report_seq")
    public Long getId() {
    return id;
    }
}

