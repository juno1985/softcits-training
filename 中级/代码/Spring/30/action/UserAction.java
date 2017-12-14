package action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import model.User;
import service.IUserService;

//@Component("userAction")
@Controller("userAction")//MVC的控制层一般使用@Controller
@Scope("prototype")
public class UserAction {
	private User user;
	private IUserService userService;
	private int id;
	private List<String> names;
	
	
	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public IUserService getUserService() {
		return userService;
	}

	@Resource
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
	public UserAction() {
	}

	public UserAction(IUserService userService) {
		super();
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

//	public IUserService getUserService() {
//		return userService;
//	}
//
//	public void setUserService(IUserService userService) {
//		this.userService = userService;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void add() {
		userService.add(user);
	}
	
	public void delete() {
		userService.delete(id);
	}
	
	public void load() {
		userService.load(id);
	}
}
