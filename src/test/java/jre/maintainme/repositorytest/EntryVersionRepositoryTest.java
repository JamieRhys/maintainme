package jre.maintainme.repositorytest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import jre.maintainme.entities.software.EntryVersion;
import jre.maintainme.repositories.EntryVersionRepository;

@DataJpaTest
public class EntryVersionRepositoryTest {
    @Autowired private TestEntityManager entityManager;
    @Autowired private EntryVersionRepository repo;

    @Test
    public void testAll() {
        saveEntry();
        deleteEntry();
    }

    @Test
    public void saveEntry() {
        EntryVersion entry = new EntryVersion(
            "Kinetic Pixel",
            "Pixellator",
            "2.23"
        );

        entityManager.persistAndFlush(entry);

        Assertions.assertThat(entry.getId()).isNotNull();
    }

    @Test
    public void deleteEntry() {
        repo.deleteAll();

        Assertions.assertThat(repo.findAll()).isEmpty();
    }
}
