package jre.maintainme;

import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import jre.maintainme.entities.hardware.EntryPC;
import jre.maintainme.entities.software.EntrySoftware;
import jre.maintainme.entities.users.EntityUser;
import jre.maintainme.repositories.EntryPCRepository;
import jre.maintainme.repositories.EntrySoftwareRepository;
import jre.maintainme.repositories.EntryUserRepository;
import jre.maintainme.utils.strings.Types;
import jre.maintainme.utils.strings.Units;

@SpringBootApplication
public class MaintainmeApplication {
	@Autowired private EntryPCRepository entryPCRepo;
	@Autowired private EntryUserRepository entryUserRepo;
	@Autowired private EntrySoftwareRepository entrySoftwareRepo;

	public static void main(String[] args) {
		SpringApplication.run(MaintainmeApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		entryPCRepo.deleteAll();
		entryUserRepo.deleteAll();
		entrySoftwareRepo.deleteAll();
		
		return args -> {
			initialiseUserDB();
			initialisePCDB();
			initialiseSoftwareDB();
		};
	}

	private void initialiseSoftwareDB() {
		entrySoftwareRepo.save(new EntrySoftware(
			LocalDate.now(ZoneId.of("Europe/London")),
			false,
			null,
			"Kinetic Pixel",
			"Pixellator",
			"2.23",
			Types.PC.OS.Type.WIN
		));
		entrySoftwareRepo.save(new EntrySoftware(
			LocalDate.now(ZoneId.of("Europe/London")),
			false,
			null,
			"Ventuz",
			"Ventuz",
			"6.07.05",
			Types.PC.OS.Type.WIN
		));
		entrySoftwareRepo.save(new EntrySoftware(
			LocalDate.now(ZoneId.of("Europe/London")),
			false,
			null,
			"Blackmagic",
			"Desktop Video",
			"11.6",
			Types.PC.OS.Type.WIN
		));
	}

	private void initialiseUserDB() {
		entryUserRepo.save(new EntityUser("admin", "user", "admin", "$2a$10$DOXW7RM6dl4cA7pNlcCJBuMwn37few43dcv3GoxL2Q.TxjMLsXbB6", false, "ADMIN"));
		entryUserRepo.save(new EntityUser("Jamie", "Edwards", "jamie", "$2a$10$Q2w8k8duOz6eZaEkxxB01OQI1hOLLTxT8iw/VCz4FwHwFTX8oB8Oe", true, "ADMIN"));
	}

	private void initialisePCDB() {
		EntryPC entryPC = new EntryPC(LocalDate.now(ZoneId.of("Europe/London")), 
		false, 
		null, 
		true, 
		"00575", 
		"Kylo", 
		"Asus", 
		"ZX567", 
		Types.PC.Motherboard.Size.ATX, 
		"562AX-6", 
		"Corsair", 
		"570AX", 
		570, 
		"570-AX 564ZA", 
		"Intel",
		"i7-5570",
		6,
		5.7,
		Units.Processor.Frequency.Unit.GHZ,
		"BZ564-2258-949",
		"Corsair",
		"HyperX",
		16,
		Units.Storage.Size.Unit.GB,
		Types.PC.RAM.Type.DDR4,
		"HX-454 161800B",
		"Kingston",
		"Red",
		260,
		Units.Storage.Size.Unit.GB,
		Types.PC.Storage.Type.SSD,
		"KR-260 BR27 RGX",
		true,
		"Western Digital",
		"Caviar Blue",
		1,
		Units.Storage.Size.Unit.TB,
		Types.PC.Storage.Type.HDD,
		"CB-WD1TB-545-67123BZ",
		"AMD",
		"Radeon R 200",
		"AMDR-200-RXT4800",
		true,
		"Blackmagic",
		"Decklink Duo 2",
		"DLD2",
		"254 646 875"
	);
	EntryPC entryPC2 = new EntryPC(LocalDate.now(ZoneId.of("Europe/London")), 
		false, 
		null, 
		true, 
		"00548", 
		"Rey", 
		"Asus", 
		"ZX567", 
		Types.PC.Motherboard.Size.ATX, 
		"22547-AX", 
		"Corsair", 
		"570AX", 
		570, 
		"570-AX 564BZ", 
		"Intel",
		"i7-5570",
		6,
		5.7,
		Units.Processor.Frequency.Unit.GHZ,
		"BZ564-2258-975",
		"Corsair",
		"HyperX",
		16,
		Units.Storage.Size.Unit.GB,
		Types.PC.RAM.Type.DDR4,
		"HX-454 161801B",
		"Kingston",
		"Red",
		260,
		Units.Storage.Size.Unit.GB,
		Types.PC.Storage.Type.SSD,
		"KR-260 BR27 RGB",
		true,
		"Western Digital",
		"Caviar Blue",
		1,
		Units.Storage.Size.Unit.TB,
		Types.PC.Storage.Type.HDD,
		"CB-WD1TB-545-67123ZB",
		"AMD",
		"Radeon R 200",
		"AMDR-200-RXT4810",
		true,
		"Blackmagic",
		"Decklink Duo 2",
		"DLD1",
		"254 646 872S"
	);
	EntryPC entryPC3 = new EntryPC(LocalDate.now(ZoneId.of("Europe/London")), 
		false, 
		null, 
		true, 
		"00151", 
		"Chewie", 
		"Asus", 
		"ZX567", 
		Types.PC.Motherboard.Size.ATX, 
		"5547-AX", 
		"Corsair", 
		"570AX", 
		570, 
		"570-AX 564BD", 
		"Intel",
		"i7-5570",
		6,
		5.7,
		Units.Processor.Frequency.Unit.GHZ,
		"BZ564-2258-955",
		"Corsair",
		"HyperX",
		16,
		Units.Storage.Size.Unit.GB,
		Types.PC.RAM.Type.DDR4,
		"HX-454 16180AB",
		"Kingston",
		"Red",
		260,
		Units.Storage.Size.Unit.GB,
		Types.PC.Storage.Type.SSD,
		"KR-260 BR27 RGS",
		true,
		"Western Digital",
		"Caviar Blue",
		1,
		Units.Storage.Size.Unit.TB,
		Types.PC.Storage.Type.HDD,
		"CB-WD1TB-545-67123BM",
		"AMD",
		"Radeon R 200",
		"AMDR-200-RXT4800",
		true,
		"Blackmagic",
		"Decklink Duo 2",
		"DLD3",
		"254 646 873"
	);
	entryPCRepo.save(entryPC);
	entryPCRepo.save(entryPC2);
	entryPCRepo.save(entryPC3);
	}
}
