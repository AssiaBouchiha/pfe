package ma.sir.labo.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.labo.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "serotype")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="serotype_seq",sequenceName="serotype_seq",allocationSize=1, initialValue = 1)
public class SerotypeHistory extends HistBusinessObject  {


    public SerotypeHistory() {
    super();
    }

    public SerotypeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="serotype_seq")
    public Long getId() {
    return id;
    }
}

