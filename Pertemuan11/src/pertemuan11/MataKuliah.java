/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan11;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Faiq
 */
@Entity
@Table(name = "mata_kuliah")
@NamedQueries({
    @NamedQuery(name = "MataKuliah.findAll", query = "SELECT m FROM MataKuliah m ORDER BY m.kodeMatkul ASC"),
    @NamedQuery(name = "MataKuliah.findByKodeMatkul", query = "SELECT m FROM MataKuliah m WHERE m.kodeMatkul = :kodeMatkul"),
    @NamedQuery(name = "MataKuliah.findByNamaMatkul", query = "SELECT m FROM MataKuliah m WHERE m.namaMatkul = :namaMatkul"),
    @NamedQuery(name = "MataKuliah.findBySksMatkul", query = "SELECT m FROM MataKuliah m WHERE m.sksMatkul = :sksMatkul"),
    @NamedQuery(name = "MataKuliah.findByDosenPengajar", query = "SELECT m FROM MataKuliah m WHERE m.dosenPengajar = :dosenPengajar")})
public class MataKuliah implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode_matkul")
    private String kodeMatkul;
    @Column(name = "nama_matkul")
    private String namaMatkul;
    @Column(name = "sks_matkul")
    private Integer sksMatkul;
    @Column(name = "dosen_pengajar")
    private String dosenPengajar;

    public MataKuliah() {
    }

    public MataKuliah(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }

    public String getKodeMatkul() {
        return kodeMatkul;
    }

    public void setKodeMatkul(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public Integer getSksMatkul() {
        return sksMatkul;
    }

    public void setSksMatkul(Integer sksMatkul) {
        this.sksMatkul = sksMatkul;
    }

    public String getDosenPengajar() {
        return dosenPengajar;
    }

    public void setDosenPengajar(String dosenPengajar) {
        this.dosenPengajar = dosenPengajar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodeMatkul != null ? kodeMatkul.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MataKuliah)) {
            return false;
        }
        MataKuliah other = (MataKuliah) object;
        if ((this.kodeMatkul == null && other.kodeMatkul != null) || (this.kodeMatkul != null && !this.kodeMatkul.equals(other.kodeMatkul))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pertemuan11.MataKuliah[ kodeMatkul=" + kodeMatkul + " ]";
    }
    
}
