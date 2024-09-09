package in.sp.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "combox")
public class Complaintbox {

    @Id
    private Integer id;

    private String title;
    private String complaint;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    @Override
    public String toString() {
        return "Combox{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", complaint='" + complaint + '\'' +
                '}';
    }
}
