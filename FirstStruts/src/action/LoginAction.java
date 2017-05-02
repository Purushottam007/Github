package action;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by PURUSHOTHAM on 02/05/2017.
 */
public class LoginAction extends Action {

    private  final String SUCCESS="pass";
    private  final String FAILURE="fail";
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        FormLogin login=(FormLogin)form;
        if(login.getUsername().equals("qwerty") && login.getPassword().equals("12345")){
            return mapping.findForward(SUCCESS);
        }
        else{
            return mapping.findForward(FAILURE);
        }

    }
}
