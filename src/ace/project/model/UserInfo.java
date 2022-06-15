package ace.project.model;

import java.util.ArrayList;
import java.util.List;

public class UserInfo {
	private List<User>userList = new ArrayList<>();
	
	public void addStudent(User user) {
		this.userList.add(user);
	}
}
