package jre.maintainme.entities.users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "entry_user")
public class EntityUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    public String role;

    public EntityUser() {}

    public EntityUser(String username, String password, String role) {
        super();

        this.username = username;
        this.password = password;
        this.role = role;
    }

    public long getId() { return this.id; }

    public void setId(long id) { this.id = id; }

    public String getUsername() { return this.username; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return this.password; }

    public void setPassword(String password) { this.password = password; }

    public String getRole() { return this.role; }

    public void setRole(String role) { this.role = role; }
}
