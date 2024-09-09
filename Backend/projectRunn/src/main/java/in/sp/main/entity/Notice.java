package in.sp.main.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "notices")
public class Notice {

    @Id
    private Integer id;

    private String name;
    private String type;
    private LocalDate noticedate;
    private String message;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDate getNoticedate() {
		return noticedate;
	}
	public void setNoticedate(LocalDate noticedate) {
		this.noticedate = noticedate;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

    // Getters and Setters
    // ...
    
    
}
