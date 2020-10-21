package jre.maintainme.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jre.maintainme.entities.software.EntrySoftware;

public interface EntrySoftwareRepository extends JpaRepository<EntrySoftware, Long> {
    public List<EntrySoftware> findAll();
}
