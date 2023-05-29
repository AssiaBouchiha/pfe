package ma.sir.obs.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.obs.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "data_analysis")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="data_analysis_seq",sequenceName="data_analysis_seq",allocationSize=1, initialValue = 1)
public class DataAnalysisHistory extends HistBusinessObject  {


    public DataAnalysisHistory() {
    super();
    }

    public DataAnalysisHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="data_analysis_seq")
    public Long getId() {
    return id;
    }
}

