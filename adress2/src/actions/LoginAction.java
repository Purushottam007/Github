package actions;

import forms.LoginForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by PURUSHOTHAM on 06/05/2017.
 */
public class LoginAction extends Action {

    private final static String USER="pksingh";  //initialization of static var USER
    private final static String PASSWORD="12345"; //initialization of static var PASSWORD

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        LoginForm loginForm=(LoginForm)form;   //Casting the form into LoginForm


            //validation checking for user and password
        if(loginForm.getUsername().equals(USER)&& loginForm.getPassword().equals(PASSWORD))
            return mapping.findForward("purchase_order");
        else
            return mapping.findForward("fail");

    }
}
