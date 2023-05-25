package ma.sir.labo.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.labo.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "age_category")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="age_category_seq",sequenceName="age_category_seq",allocationSize=1, initialValue = 1)
public class AgeCategoryHistory extends HistBusinessObject  {


    public AgeCategoryHistory() {
    super();
    }

    public AgeCategoryHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="age_category_seq")
    public Long getId() {
    return id;
    }
}

