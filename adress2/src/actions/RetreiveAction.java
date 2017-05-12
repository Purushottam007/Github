package actions;

import addresses.Po;
import manage.PoManage;
import manage.Results;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by PURUSHOTHAM on 10/05/2017.
 */
public class RetreiveAction extends Action {

    public static  int count=0;
    @Override

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {


        PoManage poManage=new PoManage();
        List<Results> poList=poManage.viewPo();
        System.out.println("inside retrieve action   " + poList.toString());
        request.setAttribute("poList",poList);
        return mapping.findForward("success");




       // return super.execute(mapping, form, request, response);
    }
}
