package jre.maintainme.entities.hardware;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import jre.maintainme.utils.strings.Types;
import jre.maintainme.utils.strings.Units;

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

    @Column(name = "entry_processor_model_name")
    private String processorModelName;

    @Column(name = "entry_processor_cores")
    private int processorCores;

    @Column(name = "entry_processor_speed")
    private double processorSpeed;

    @Column(name = "entry_processor_frequency_unit")
    private Units.Processor.Frequency.Unit processorFrequencyUnit;

    @Column(name = "entry_processor_serial_number")
    private String processorSerialNumber;

    @Column(name = "entry_ram_manu_name")
    private String ramManufacturerName;

    @Column(name = "entry_ram_model_name")
    private String ramModelName;

    @Column(name = "entry_ram_size")
    private int ramSize;

    @Column(name = "entry_ram_size_unit")
    private Units.Storage.Size.Unit ramSizeUnit;

    @Column(name = "entry_ram_type")
    private Types.PC.RAM.Type ramType;

    @Column(name = "entry_ram_serial_number")
    private String ramSerialNumber;

    /**
     * Default Constructor for EntryPC
     */
    public EntryPC() {}

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
        String processorManufacturerName,
        String processorModelName,
        int processorCores,
        double processorSpeed,
        Units.Processor.Frequency.Unit processorFrequencyUnit,
        String processorSerialNumber,
        String ramManufacturerName,
        String ramModelName,
        int ramSize,
        Units.Storage.Size.Unit ramSizeUnit,
        Types.PC.RAM.Type ramType,
        String ramSerialNumber
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

        this.setProcessorManufacturerName(processorManufacturerName);
        this.setProcessorModelName(processorModelName);
        this.setProcessorCores(processorCores);
        this.setProcessorSpeed(processorSpeed);
        this.setProcessorFrequencyUnit(processorFrequencyUnit);
        this.setProcessorSerialNumber(processorSerialNumber);

        this.setRamManufacturerName(ramManufacturerName);
        this.setRamModelName(ramModelName);
        this.setRamSize(ramSize);
        this.setRamSizeUnit(ramSizeUnit);
        this.setRamType(ramType);
        this.setRamSerialNumber(ramSerialNumber);
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

    public String getPsuSerialNumber() { return this.psuSerialNumber; }

    public void setPsuSerialNumber(String sn) { this.psuSerialNumber = sn; }

    public String getProcessorManufacturerName() { return this.processorManufacturerName; }

    public void setProcessorManufacturerName(String name) { this.processorManufacturerName = name; }

    public String getProcessorModelName() { return this.processorModelName; }

    public void setProcessorModelName(String name) { this.processorModelName = name; }

    public int getProcessorCores() { return this.processorCores; }

    public void setProcessorCores(int cores) { this.processorCores = cores; }

    public double getProcessorSpeed() { return this.processorSpeed; }

    public void setProcessorSpeed(double speed) { this.processorSpeed = speed; }

    public Units.Processor.Frequency.Unit getProcessorFrequencyUnit() { return this.processorFrequencyUnit; }

    public void setProcessorFrequencyUnit(Units.Processor.Frequency.Unit unit) { this.processorFrequencyUnit = unit; }

    public String getProcessorSerialNumber() { return this.processorSerialNumber; }

    public void setProcessorSerialNumber(String sn) { this.processorSerialNumber = sn; }

    public String getRamManufacturerName() { return this.ramManufacturerName; }

    public void setRamManufacturerName(String name) { this.ramManufacturerName = name; }

    public String getRamModelName() { return this.ramModelName; }

    public void setRamModelName(String name) { this.ramModelName = name; }

    public int getRamSize() { return this.ramSize; }

    public void setRamSize(int size) { this.ramSize = size; }

    public Units.Storage.Size.Unit getRamSizeUnit() { return this.ramSizeUnit; }

    public void setRamSizeUnit(Units.Storage.Size.Unit unit) { this.ramSizeUnit = unit; }

    public Types.PC.RAM.Type getRamType() { return this.ramType; }

    public void setRamType(Types.PC.RAM.Type type) { this.ramType = type; }

    public String getRamSerialNumber() { return this.ramSerialNumber; }

    public void setRamSerialNumber(String sn) { this.ramSerialNumber = sn; }

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
