package jre.maintainme;

import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import jre.maintainme.entities.hardware.EntryPC;
import jre.maintainme.repositories.EntryPCRepository;
import jre.maintainme.utils.strings.Types;
import jre.maintainme.utils.strings.Units;

@SpringBootApplication
public class MaintainmeApplication {
	@Autowired 
	private EntryPCRepository entryPCRepo;

	public static void main(String[] args) {
		SpringApplication.run(MaintainmeApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			entryPCRepo.save(new EntryPC(LocalDate.now(ZoneId.of("Europe/London")), 
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
				"KR-260 BR27 RGX"
			));
		};
	}
}
