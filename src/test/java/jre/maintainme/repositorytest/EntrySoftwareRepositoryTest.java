package jre.maintainme.repositorytest;

import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDate;
import java.time.ZoneId;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import jre.maintainme.entities.software.EntrySoftware;
import jre.maintainme.repositories.EntrySoftwareRepository;
import jre.maintainme.utils.strings.Types;

@DataJpaTest
public class EntrySoftwareRepositoryTest {
    @Autowired private TestEntityManager entityManager;
    @Autowired private EntrySoftwareRepository repo;

    @Test
    public void saveEntry() {
        EntrySoftware entry = new EntrySoftware(
            LocalDate.now(ZoneId.of("Europe/London")),
            false,
            null,
            "Kinetic Pixel", 
            "Pixellator", 
            "2.23", 
            Types.PC.OS.Type.WIN
        );

        entityManager.persistAndFlush(entry);

        Assertions.assertThat(entry.getId()).isNotNull();
    }

    @Test
    public void deletePC() {
        repo.deleteAll();

        Assertions.assertThat(repo.findAll()).isEmpty();
    }
}
