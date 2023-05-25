package ma.sir.labo.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.labo.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "data_import_export")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="data_import_export_seq",sequenceName="data_import_export_seq",allocationSize=1, initialValue = 1)
public class DataImportExportHistory extends HistBusinessObject  {


    public DataImportExportHistory() {
    super();
    }

    public DataImportExportHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="data_import_export_seq")
    public Long getId() {
    return id;
    }
}

