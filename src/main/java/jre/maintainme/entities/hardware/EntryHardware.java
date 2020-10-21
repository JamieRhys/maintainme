package jre.maintainme.entities.hardware;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import jre.maintainme.entities.base.EntryBase;
import jre.maintainme.utils.strings.Types;

@MappedSuperclass
public class EntryHardware extends EntryBase {

    @Column(name = "entry_hasBarcode")
    private boolean hasBarcode;

    @Column(name = "entry_barcode", unique = true)
    private String barcode;

    public EntryHardware(
        Types.Physical.Type physicalType,
        LocalDate dateAcquired,
        boolean isRetired,
        LocalDate dateRetired,
        boolean hasBarcode,
        String barcode
    ) {
        super(physicalType, dateAcquired, isRetired, dateRetired);
        this.setHasBarcode(hasBarcode);
        this.setBarcode(barcode);
    }

    public boolean getHasBarcode() { return this.hasBarcode; }

    public void setHasBarcode(boolean hasBarcode) { this.hasBarcode = hasBarcode; }

    public String getBarcode() { return this.barcode; }

    public void setBarcode(String barcode) { this.barcode = barcode; }
    
}
