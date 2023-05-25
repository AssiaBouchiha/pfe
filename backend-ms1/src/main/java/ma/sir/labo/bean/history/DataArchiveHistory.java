package ma.sir.labo.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.labo.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "data_archive")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="data_archive_seq",sequenceName="data_archive_seq",allocationSize=1, initialValue = 1)
public class DataArchiveHistory extends HistBusinessObject  {


    public DataArchiveHistory() {
    super();
    }

    public DataArchiveHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="data_archive_seq")
    public Long getId() {
    return id;
    }
}

