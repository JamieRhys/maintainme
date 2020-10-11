package jre.maintainme.entities.hardware;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import jre.maintainme.entities.base.EntryBase;
import jre.maintainme.utils.strings.Types;

@MappedSuperclass
public class EntryHardware extends EntryBase {

    @Column(name = "entry_hasBarcode")
    private boolean hasBarcode;

    @Column(name = "entry_barcode")
    private String barcode;

    public EntryHardware() {
        this.setPhysicalType(Types.Physical.Type.HARDWARE);
    }

    public boolean getHasBarcode() { return this.hasBarcode; }

    public void setHasBarcode(boolean hasBarcode) { this.hasBarcode = hasBarcode; }

    public String getBarcode() { return this.barcode; }

    public void setBarcode(String barcode) { this.barcode = barcode; }
    
}
