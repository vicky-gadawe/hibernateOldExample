package in.vkg.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_table")
public class Student {
	@Id
	@Column(name="sid")
	private Integer studId;
	
	@Column(name="sname")
	private String studName;
	
	@Column(name="ssal")
	private Integer studAge;
	
	public Integer getStudAge() {
		return studAge;
	}

	public void setStudAge(Integer studAge) {
		this.studAge = studAge;
	}

	public Student() {
		super();
	}

	public Integer getStudId() {
		return studId;
	}

	public void setStudId(Integer studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}


	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studAge=" + studAge + "]";
	}
	
	
}
