package ma.sir.labo.bean.core;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.labo.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "specimen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="specimen_seq",sequenceName="specimen_seq",allocationSize=1, initialValue = 1)
public class Specimen   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    private LocalDateTime date ;
    @Column(length = 500)
    private String type;

    private Reason reason ;
    
    private DataImportExport dataImportExport ;
    


    public Specimen(){
        super();
    }

    public Specimen(Long id,String code){
        this.id = id;
        this.code = code ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="specimen_seq")
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
    public LocalDateTime getDate(){
        return this.date;
    }
    public void setDate(LocalDateTime date){
        this.date = date;
    }
    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Reason getReason(){
        return this.reason;
    }
    public void setReason(Reason reason){
        this.reason = reason;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public DataImportExport getDataImportExport(){
        return this.dataImportExport;
    }
    public void setDataImportExport(DataImportExport dataImportExport){
        this.dataImportExport = dataImportExport;
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
        Specimen specimen = (Specimen) o;
        return id != null && id.equals(specimen.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

