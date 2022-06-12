package ace.assignment;

import java.io.Serializable;

public class BeanPerson implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name, birth, gender, course;
	
	private String[]knowledge;

	public String[] getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(String[] knowledge) {
		this.knowledge = knowledge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
