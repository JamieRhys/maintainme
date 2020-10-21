package jre.maintainme.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jre.maintainme.entities.software.EntryVersion;

public interface EntryVersionRepository extends JpaRepository<EntryVersion, Long> {
    public List<EntryVersion> findAll();
}
