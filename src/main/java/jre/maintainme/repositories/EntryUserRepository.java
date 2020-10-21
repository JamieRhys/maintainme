package jre.maintainme.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import jre.maintainme.entities.users.EntityUser;

public interface EntryUserRepository extends CrudRepository<EntityUser, Long> {
    public EntityUser findByUsername(@Param("username") String username);
}
