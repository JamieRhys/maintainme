package jre.maintainme.repositories;

import org.springframework.data.repository.CrudRepository;

import jre.maintainme.entities.users.EntityUser;

public interface EntryUserRepository extends CrudRepository<EntityUser, Long> {
    public EntityUser findByUsername(String username);
}
