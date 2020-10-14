package jre.maintainme.entities.base;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.format.annotation.DateTimeFormat;

import jre.maintainme.utils.strings.Types;

@MappedSuperclass
public class EntryBase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "entry_id")
    private long id;

    @Column(name = "entry_physical_type")
    private Types.Physical.Type physicalType;

    @Column(name = "entry_date_acquired")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateAcquired;

    @Column(name = "entry_is_retired")
    private boolean isRetired;

    @Column(name = "entry_date_retired")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateRetired;

    public long getId() { return this.id; }

    public void setId(long id) { this.id = id; }

    public String getPhysicalType() { return physicalType.getDisplayString(); }

    public void setPhysicalType(Types.Physical.Type type) { this.physicalType = type; }

    public LocalDate getDateAcquired() { return this.dateAcquired; }

    public void setDateAcquired(LocalDate date) { this.dateAcquired = date; }

    public boolean getIsRetired() { return this.isRetired; }

    public void setIsRetired(boolean isRetired) { this.isRetired = isRetired; }

    public LocalDate getDateRetired() { return this.dateRetired; }

    public void setDateRetired(LocalDate date) { this.dateRetired = date; }
}
