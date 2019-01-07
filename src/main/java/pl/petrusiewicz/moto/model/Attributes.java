package pl.petrusiewicz.moto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attributes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    private String it_IT;
    private String en_GB;
    private String en_IE;
    private String pl_PL;
    private String nl_NL;
    private String nl_BE;
    private String nb_NO;
    private String fi_FI;
    private String en_US;
    private String es_ES;
    private String de_DE;
    private String de_CH;
    private String de_AT;
    private String da_DK;
    private String fr_FR;
    private String sv_SE;
    private String cs_CZ;

    //======================================================

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIt_IT() {
        return it_IT;
    }

    public void setIt_IT(String it_IT) {
        this.it_IT = it_IT;
    }

    public String getEn_GB() {
        return en_GB;
    }

    public void setEn_GB(String en_GB) {
        this.en_GB = en_GB;
    }

    public String getEn_IE() {
        return en_IE;
    }

    public void setEn_IE(String en_IE) {
        this.en_IE = en_IE;
    }

    public String getPl_PL() {
        return pl_PL;
    }

    public void setPl_PL(String pl_PL) {
        this.pl_PL = pl_PL;
    }

    public String getNl_NL() {
        return nl_NL;
    }

    public void setNl_NL(String nl_NL) {
        this.nl_NL = nl_NL;
    }

    public String getNl_BE() {
        return nl_BE;
    }

    public void setNl_BE(String nl_BE) {
        this.nl_BE = nl_BE;
    }

    public String getNb_NO() {
        return nb_NO;
    }

    public void setNb_NO(String nb_NO) {
        this.nb_NO = nb_NO;
    }

    public String getFi_FI() {
        return fi_FI;
    }

    public void setFi_FI(String fi_FI) {
        this.fi_FI = fi_FI;
    }

    public String getEn_US() {
        return en_US;
    }

    public void setEn_US(String en_US) {
        this.en_US = en_US;
    }

    public String getEs_ES() {
        return es_ES;
    }

    public void setEs_ES(String es_ES) {
        this.es_ES = es_ES;
    }

    public String getDe_DE() {
        return de_DE;
    }

    public void setDe_DE(String de_DE) {
        this.de_DE = de_DE;
    }

    public String getDe_CH() {
        return de_CH;
    }

    public void setDe_CH(String de_CH) {
        this.de_CH = de_CH;
    }

    public String getDe_AT() {
        return de_AT;
    }

    public void setDe_AT(String de_AT) {
        this.de_AT = de_AT;
    }

    public String getDa_DK() {
        return da_DK;
    }

    public void setDa_DK(String da_DK) {
        this.da_DK = da_DK;
    }

    public String getFr_FR() {
        return fr_FR;
    }

    public void setFr_FR(String fr_FR) {
        this.fr_FR = fr_FR;
    }

    public String getSv_SE() {
        return sv_SE;
    }

    public void setSv_SE(String sv_SE) {
        this.sv_SE = sv_SE;
    }

    public String getCs_CZ() {
        return cs_CZ;
    }

    public void setCs_CZ(String cs_CZ) {
        this.cs_CZ = cs_CZ;
    }

    //=================================================

    @Override
    public String toString() {
        return "Attributes{" +
                "code='" + code + '\'' +
                ", it_IT='" + it_IT + '\'' +
                ", en_GB='" + en_GB + '\'' +
                ", en_IE='" + en_IE + '\'' +
                ", pl_PL='" + pl_PL + '\'' +
                ", nl_NL='" + nl_NL + '\'' +
                ", nl_BE='" + nl_BE + '\'' +
                ", nb_NO='" + nb_NO + '\'' +
                ", fi_FI='" + fi_FI + '\'' +
                ", en_US='" + en_US + '\'' +
                ", es_ES='" + es_ES + '\'' +
                ", de_DE='" + de_DE + '\'' +
                ", de_CH='" + de_CH + '\'' +
                ", de_AT='" + de_AT + '\'' +
                ", da_DK='" + da_DK + '\'' +
                ", fr_FR='" + fr_FR + '\'' +
                ", sv_SE='" + sv_SE + '\'' +
                ", cs_CZ='" + cs_CZ + '\'' +
                '}';
    }
}
