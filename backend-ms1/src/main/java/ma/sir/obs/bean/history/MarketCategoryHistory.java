package ma.sir.obs.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.obs.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "market_category")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="market_category_seq",sequenceName="market_category_seq",allocationSize=1, initialValue = 1)
public class MarketCategoryHistory extends HistBusinessObject  {


    public MarketCategoryHistory() {
    super();
    }

    public MarketCategoryHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="market_category_seq")
    public Long getId() {
    return id;
    }
}

