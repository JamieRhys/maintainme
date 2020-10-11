package jre.maintainme.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jre.maintainme.entities.hardware.EntryPC;

public interface EntryPCRepository extends JpaRepository<EntryPC, Long> {
    public List<EntryPC> findAll();

    public EntryPC findById(long id);
}
