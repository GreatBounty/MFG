package controllers;


import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;


public class Login extends Controller {

	public static Result showLoginForm(){
		
		return ok(views.html.login.render());
	} 
	
	public static Result dynamicform(){
		DynamicForm requestData = Form.form().bindFromRequest();
		String eMail = requestData.get("email");
		String password = requestData.get("password");
		int i = 1;
		if(i > 0){
			return ok("Email: " + eMail + "Password: " + password);
		}
		else{
			return badRequest("fuck");
		}
	}
	
}
