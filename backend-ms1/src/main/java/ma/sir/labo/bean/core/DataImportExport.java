package ma.sir.labo.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.labo.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "data_import_export")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="data_import_export_seq",sequenceName="data_import_export_seq",allocationSize=1, initialValue = 1)
public class DataImportExport   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;

    private LocationData locationData ;
    
    private Specimen specimen ;
    
    private Microbiology microbiology ;
    


    public DataImportExport(){
        super();
    }

    public DataImportExport(Long id,String code){
        this.id = id;
        this.code = code ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="data_import_export_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public LocationData getLocationData(){
        return this.locationData;
    }
    public void setLocationData(LocationData locationData){
        this.locationData = locationData;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Specimen getSpecimen(){
        return this.specimen;
    }
    public void setSpecimen(Specimen specimen){
        this.specimen = specimen;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Microbiology getMicrobiology(){
        return this.microbiology;
    }
    public void setMicrobiology(Microbiology microbiology){
        this.microbiology = microbiology;
    }

    @Transient
    public String getLabel() {
        label = code;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataImportExport dataImportExport = (DataImportExport) o;
        return id != null && id.equals(dataImportExport.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

