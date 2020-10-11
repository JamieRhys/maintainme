package jre.maintainme.entities.hardware;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import jre.maintainme.utils.strings.Types;

@Entity
@Table(name = "HARDWARE_PC")
public class EntryPC extends EntryHardware {
    @Column(name = "entry_name")
    private String name;

    @Column(name = "entry_motherboard_manu_name")
    private String motherboardManufacturerName;

    @Column(name = "entry_motherboard_model_name")
    private String motherboardModelName;

    @Column(name = "entry_motherboard_size")
    private Types.PC.Motherboard.Size motherboardSize;

    @Column(name = "entry_motherboard_serial_number")
    private String motherboardSerialNumber;

    @Column(name = "entry_psu_manu_name")
    private String psuManufacturerName;

    @Column(name = "entry_psu_model_name")
    private String psuModelName;

    @Column(name = "entry_psu_wattage")
    private int psuWatts;

    @Column(name = "entry_psu_serial_number")
    private String psuSerialNumber;

    @Column(name = "entry_processor_manu_name")
    private String processorManufacturerName;

    

    /**
     * Default Constructor for EntryPC
     */
    public EntryPC() {}

    /**
     * Constructor for EntryPC 
     * @param dateAcquired
     * @param isRetired
     * @param dateRetired
     * @param hasBarcode
     * @param barcode
     * @param name
     * @param motherboardManufacturerName
     * @param motherboardModelName
     * @param motherboardSize
     * @param motherboardSerialNumber
     * @param psuManufacturerName
     * @param psuModelName
     * @param psuWatts
     * @param processorManufacturerName
     */
    public EntryPC(
        LocalDate dateAcquired,
        boolean isRetired,
        LocalDate dateRetired,
        boolean hasBarcode,
        String barcode,
        String name,
        String motherboardManufacturerName,
        String motherboardModelName,
        Types.PC.Motherboard.Size motherboardSize,
        String motherboardSerialNumber,
        String psuManufacturerName,
        String psuModelName,
        int psuWatts,
        String psuSerialNumber,
        String processorManufacturerName
    ) {
        super();

        this.setDateAcquired(dateAcquired);
        this.setIsRetired(isRetired);
        this.setDateRetired(dateRetired);
        this.setHasBarcode(hasBarcode);
        this.setBarcode(barcode);
        this.setName(name);

        this.setMotherboardManufacturerName(motherboardManufacturerName);
        this.setMotherboardModelName(motherboardModelName);
        this.setMotherboardSize(motherboardSize);
        this.setMotherboardSerialNumber(motherboardSerialNumber);

        this.setPsuManufacturerName(psuManufacturerName);
        this.setPsuModelName(psuModelName);
        this.setPsuWatts(psuWatts);
        this.setPsuSerialNumber(psuSerialNumber);



    }


    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public String getMotherboardManufacturerName() { return this.motherboardManufacturerName; }

    public void setMotherboardManufacturerName(String name) { this.motherboardManufacturerName = name; }

    public String getMotherboardModelName() { return this.motherboardModelName; }

    public void setMotherboardModelName(String name) { this.motherboardModelName = name; }

    public String getMotherboardSize() { return this.motherboardSize.getDisplayValue(); }

    public void setMotherboardSize(Types.PC.Motherboard.Size size) { this.motherboardSize = size; }

    public String getMotherboardSerialNumber() { return this.motherboardSerialNumber; }

    public void setMotherboardSerialNumber(String sn) { this.motherboardSerialNumber = sn; }

    public String getPsuManufacturerName() { return this.psuManufacturerName; }

    public void setPsuManufacturerName(String name) { this.psuManufacturerName = name; }

    public String getPsuModelName() { return this.psuModelName; }

    public void setPsuModelName(String name) { this.psuModelName = name; }

    public int getPsuWatts() { return this.psuWatts; }

    public void setPsuWatts(int watts) { this.psuWatts = watts; }

    public String getProcessorManufacturerName() { return this.processorManufacturerName; }

    public void setProcessorManufacturerName(String name) { this.processorManufacturerName = name; }

    public String getPsuSerialNumber() { return this.psuSerialNumber; }

    public void setPsuSerialNumber(String sn) { this.psuSerialNumber = sn; }

    public void printDetails() {
        System.out.println("ENTRY ID: " + this.getId());
        System.out.println("ENTRY BARCODE: " + this.getBarcode());
        System.out.println("ENTRY PHYSICAL TYPE: " + this.getPhysicalType());
        System.out.println("ENTRY DATE ACQUIRED: " + this.getDateAcquired());
        System.out.println("ENTRY IS RETIRED: " + this.getIsRetired());
        System.out.println("ENTRY DATE RETIRED: " + this.getDateRetired());
        System.out.println("ENTRY NAME: " + this.getName());
        System.out.println("ENTRY MOTHERBOARD MANU NAME: " + this.getMotherboardManufacturerName());
        //System.out.println("ENTRY MOTHERBOARD SIZE: " + this.getMotherboardSize());
    }
}
