package action;

import model.PurchaseOrder;
import model.SearchForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLDecoder;
import java.util.List;

/**
 * Created by PURUSHOTHAM on 02/05/2017.
 */
public class SearchAction extends Action {
    private static final String BASE_QUERY = "select p.po_number,p.seller,p.due_date,p.status,p.priority,o.ship_from,d.ship_to,p.trans_resp "
            + "from purchase_order p,origintable o,destination d "
            + "where p.origin_id=o.id and p.destinatin_id=d.id;";
    String query ;
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        SearchForm form1 = (SearchForm) form;
        RegisterDo registerDo = new RegisterDo();
        StringBuilder stringBuilder = new StringBuilder(BASE_QUERY);


        if (request.getMethod().equals("GET")) {
            String extraPath = request.getQueryString();

            String[] groups = extraPath.split("&");
            if(extraPath.length()!=0) {
                stringBuilder.append(" WHERE ");


                for (int i = 0; i < groups.length; i++) {

                    String param[] = new String[2] ;
                    param = groups[i].split("=");
                    String param2 = param[1];
                    String decoded = URLDecoder.decode(param2, "UTF-8");

                    if (param[0].equals("po_number")){
                        stringBuilder.append(groups[i]);
                    } else{
                        if(param[0].equals("supplier")) {
                            stringBuilder.append("p.seller = " + "'" + decoded + "'");

                        } if(param[0].equals("duedate")) {
                            stringBuilder.append("p.due_date = " + "'" + decoded + "'");

                        } if(param[0].equals("status")) {
                            stringBuilder.append("p.status = " + "'" + decoded + "'");

                        } if(param[0].equals("priority")) {
                            stringBuilder.append("p.priority = " + "'" + decoded + "'");

                        } if(param[0].equals("shipfrom")) {
                            stringBuilder.append("o.ship_from = " + "'" + decoded + "'");

                        } if(param[0].equals("shipto")) {
                            stringBuilder.append("d.ship_to = " + "'" + decoded + "'");

                        } if(param[0].equals("transresp")) {
                            stringBuilder.append("p.trans_resp = " + "'" + decoded + "'");

                        }
                    }
                    if (i==groups.length-1){
                        break;
                    }
                    stringBuilder.append(" AND ");


                }
                stringBuilder.append(";");
                query = stringBuilder.toString();
                System.out.println(query);
            }
            List<PurchaseOrder> orderList = registerDo.viewPurchaseOrder(query);
            System.out.println(orderList.toString());
            request.setAttribute("orderList", orderList);
        }


        return mapping.findForward("purchase_order_list");



    }
}
