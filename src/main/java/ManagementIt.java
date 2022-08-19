import java.util.Objects;

public class ManagementIt {
    private int numbCalss;
    private String issueType;
    private String issueObject;
    private int severity;
    private int staffId;


    public ManagementIt( int staffId,int numbCalss, String issueType, String issueObject, int severity) {
        this.numbCalss = numbCalss;
        this.issueType = issueType;
        this.issueObject = issueObject;
        this.severity = severity;
        this.staffId = staffId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ManagementIt)) return false;
        ManagementIt that = (ManagementIt) o;
        return getNumbCalss() == that.getNumbCalss() && getSeverity() == that.getSeverity() && getStaffId() == that.getStaffId() && getIssueType().equals(that.getIssueType()) && getIssueObject().equals(that.getIssueObject());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumbCalss(), getIssueType(), getIssueObject(), getSeverity(), getStaffId());
    }

    @Override
    public String toString() {
        return "ManagementIt{" +
                "numbCalss=" + numbCalss +
                ", issueType='" + issueType + '\'' +
                ", issueObject='" + issueObject + '\'' +
                ", severity=" + severity +
                ", staffId=" + staffId +
                '}';
    }

    public int getNumbCalss() {
        return numbCalss;
    }

    public void setNumbCalss(int numbCalss) {
        this.numbCalss = numbCalss;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getIssueObject() {
        return issueObject;
    }

    public void setIssueObject(String issueObject) {
        this.issueObject = issueObject;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
}
