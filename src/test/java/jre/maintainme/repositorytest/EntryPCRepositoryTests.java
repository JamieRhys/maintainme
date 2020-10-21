package jre.maintainme.repositorytest;

import java.time.LocalDate;
import java.time.ZoneId;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import jre.maintainme.entities.hardware.EntryPC;
import jre.maintainme.repositories.EntryPCRepository;
import jre.maintainme.utils.strings.Types;
import jre.maintainme.utils.strings.Units;
import jre.maintainme.utils.strings.Units.Storage.Size.Unit;

@DataJpaTest
public class EntryPCRepositoryTests {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private EntryPCRepository entryPCRepo;

    @Test
    public void savePC() {
        EntryPC pc = new EntryPC(
            LocalDate.now(ZoneId.of("Europe/London")), 
            false, 
            null, 
            true, 
            "00512", 
            "Luke", 
            "Asus", 
            "Mobo252", 
            Types.PC.Motherboard.Size.ATX, 
            "AX-252-456-12", 
            "Corsair", 
            "580BX", 
            580, 
            "CBX-580M", 
            "AMD", 
            "RYZEN", 
            8, 
            8, 
            Units.Processor.Frequency.Unit.GHZ, 
            "Serial2", 
            "Kingston", 
            "HyperX Fury", 
            16, 
            Unit.GB, 
            Types.PC.RAM.Type.DDR4, 
            "SerialRAM1", 
            "Western Digitial", 
            "Caviar Blue", 
            240, 
            Unit.GB, 
            Types.PC.Storage.Type.SSD, 
            "SerialSSD1", 
            true, 
            "Western Digital", 
            "Caviar Green", 
            1, 
            Unit.TB, 
            Types.PC.Storage.Type.HDD, 
            "SerialHDD1", 
            "nVidia", 
            "GTX1080", 
            "SerialGPU1", 
            true, 
            "Decklink", 
            "Duo2", 
            "SerialBC1", 
            "544 484 696"
        );

        entityManager.persistAndFlush(pc);

        Assertions.assertThat(pc.getId()).isNotNull();
    }

    @Test
    public void deletePC() {
        entryPCRepo.deleteAll();

        Assertions.assertThat(entryPCRepo.findAll()).isEmpty();
    }
}
