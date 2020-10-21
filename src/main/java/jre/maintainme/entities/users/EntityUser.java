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
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private boolean isAdmin;

    @Column(nullable = false)
    public String role;

    public EntityUser() {}

    public EntityUser(
            String firstName, 
            String lastName, 
            String username, 
            String password, 
            boolean isAdmin, 
            String role
        ) {
        super();

        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.role = role;
    }

    public long getId() { return this.id; }

    public void setId(long id) { this.id = id; }

    public String getFirstName() { return this.firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return this.lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getUsername() { return this.username; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return this.password; }

    public void setPassword(String password) { this.password = password; }

    public boolean getIsAdmin() { return this.isAdmin; }

    public void setIsAdmin(boolean isAdmin) { this.isAdmin = isAdmin; }

    public String getRole() { return this.role; }

    public void setRole(String role) { this.role = role; }
}
