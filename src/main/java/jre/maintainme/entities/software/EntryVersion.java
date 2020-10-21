package jre.maintainme.entities.software;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "entry_version")
public class EntryVersion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "entry_developer_name")
    private String developerName;

    @Column(name = "entry_software_name")
    private String softwareName;

    @Column(name = "entry_current_version")
    private String currentVersion;

    public EntryVersion() {}

    public EntryVersion(String developerName, String softwareName, String currentVersion) {
        this.setDeveloperName(developerName);
        this.setSoftwareName(softwareName);
        this.setCurrentVersion(currentVersion);
    }

    public long getId() { return this.id; }

    public void setId(long id) { this.id = id; }

    public String getDeveloperName() { return this.developerName; }

    public void setDeveloperName(String devName) { this.developerName = devName; }

    public String getSoftwareName() { return this.softwareName; }

    public void setSoftwareName(String name) { this.softwareName = name; }
    
    public String getSoftwareVersion() { return this.currentVersion; }

    public void setCurrentVersion(String version) { this.currentVersion = version; }
}
