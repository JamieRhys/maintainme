package jre.maintainme.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;

import jre.maintainme.entities.hardware.EntryPC;
import jre.maintainme.utils.strings.Types;
import jre.maintainme.utils.strings.Units;

@RepositoryRestResource
public interface EntryPCRepository extends JpaRepository<EntryPC, Long> {
    public List<EntryPC> findAll();

    public EntryPC findById(long id);

    public EntryPC findByName(@Param("name") String name);

    public EntryPC findByBarcode(@Param("barcode") String barcode);

    public List<EntryPC> findByDateAcquired(@Param("dateAcquired") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date); // FIXME: Does not work.

    public List<EntryPC> findByDateRetired(LocalDate date); // FIXME: Does not work

    // TODO: Add date range for date acquired and date retired?

    public List<EntryPC> findByMotherboardManufacturerName(@Param("name") String name);

    public List<EntryPC> findByMotherboardModelName(@Param("name") String name);

    public List<EntryPC> findByMotherboardSize(@Param("size") Types.PC.Motherboard.Size size);

    public EntryPC findByMotherboardSerialNumber(@Param("sn") String sn);

    public List<EntryPC> findByPsuManufacturerName(@Param("name") String name);

    public List<EntryPC> findByPsuModelName(@Param("name") String name);

    public List<EntryPC> findByPsuWatts(@Param("watts") int watts);

    public EntryPC findByPsuSerialNumber(@Param("sn") String sn);

    public List<EntryPC> findByProcessorManufacturerName(@Param("name") String name);

    //public List<EntryPC> findByProcessorModel(String name);

    //public List<EntryPC> findByProcessorCores(int cores);

    //public List<EntryPC> findByProcessorSpeed(double speed, Units.Processor.Frequency.Unit unit);

    //public EntryPC findByProcessorSerialNumber(String sn);

    //public List<EntryPC> findByRAMManufacturer(String name);

    //public List<EntryPC> findByRAMModel(String name);

    //public List<EntryPC> findByRAMSize(int size, Units.Storage.Size.Unit unit);

    //public List<EntryPC> findByRAMType(Types.PC.RAM.Type type);

    //public EntryPC findByRAMSerialNumber(String sn);

    //public List<EntryPC> findByPrimaryStorageManufacturerName(String name);

    //public List<EntryPC> findByPrimaryStorageModelName(String name);

    //public List<EntryPC> findByPrimaryStorageSize(int size, Units.Storage.Size.Unit unit);

   //public List<EntryPC> findByPrimaryStorageType(Types.PC.Storage.Type type);

    //public EntryPC findByPrimaryStorageSerialNumber(String sn);
}
