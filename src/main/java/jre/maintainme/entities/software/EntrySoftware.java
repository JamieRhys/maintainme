package jre.maintainme.entities.software;

import java.time.LocalDate;
import java.time.ZoneId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import jre.maintainme.entities.base.EntryBase;
import jre.maintainme.utils.strings.Types;

@Entity
@Table(name = "entry_software")
public class EntrySoftware extends EntryBase {
    @Column(name = "entry_company_name")
    private String companyName;
    
    @Column(name = "entry_software_name")
    private String softwareName;

    @Column(name = "entry_current_version")
    private String currentVersion;

    @Column(name = "entry_os_compat")
    private Types.PC.OS.Type osCompat;

    public EntrySoftware() {
        super(Types.Physical.Type.SOFTWARE, LocalDate.now(ZoneId.of("Europe/London")), false, null);
    }

    public EntrySoftware(
        LocalDate dateAcquired,
        boolean isRetired,
        LocalDate dateRetired,
        String companyName,
        String softwareName,
        String currentVersion,
        Types.PC.OS.Type osCompat
    ) {
        super(Types.Physical.Type.SOFTWARE, dateAcquired, isRetired, dateRetired);

        this.setCompanyName(companyName);
        this.setSoftwareName(softwareName);
        this.setCurrentVersion(currentVersion);
        this.setOsCompat(osCompat);
    }

    public String getCompanyName() { return this.companyName; }

    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public String getSoftwareName() { return this.softwareName; }

    public void setSoftwareName(String softwareName) { this.softwareName = softwareName; }

    public String getCurrentVersion() { return this.currentVersion; }

    public void setCurrentVersion(String version) { this.currentVersion = version; }

    public Types.PC.OS.Type getOsCompat() { return this.osCompat; }

    public void setOsCompat(Types.PC.OS.Type os) { this.osCompat = os; }
}
