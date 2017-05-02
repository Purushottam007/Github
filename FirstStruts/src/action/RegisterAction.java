package action;

import model.Destination;
import model.Origin;
import model.PurchaseOrder;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by PURUSHOTHAM on 02/05/2017.
 */
public class RegisterAction extends Action {
    String st1="select p.po_number,p.seller,p.due_date,p.status,p.priority,o.ship_from,d.ship_to,p.trans_resp "
            + "from purchase_order p,origintable o,destination d "
            + "where p.origin_id=o.id and p.destinatin_id=d.id;";
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
     RegisterForm registerForm=(RegisterForm)form;

     int poNumber=registerForm.getPonumber();
     String issueDate=registerForm.getPoissuedate();
     String transResp=registerForm.getTransresp();
     String desgMode=registerForm.getDesinatedmode();
     String status=registerForm.getStatus();
     String dueDate=registerForm.getDuedate();
     String  incoterns=registerForm.getIncorterns();
     String carier=registerForm.getCarrier();
     String priority=registerForm.getPriority();
     String seller=registerForm.getSeller();
     String billTo=registerForm.getBillto();
     String shiopFrom=registerForm.getShipfrom();
     String originStree=registerForm.getOriginstreet();
     String oringinCity=registerForm.getOrigincity();
     String originState=registerForm.getOriginstate();
     String originCountry=registerForm.getOrigincountry();
     String pickupStart=registerForm.getPickupstart();
     String pickupEnd=registerForm.getPickupend();
     String shiopTo=registerForm.getShipto();
     String destinationStree=registerForm.getDestinationstate();
     String destinationCity=registerForm.getDestinationcity();
     String destinationState=registerForm.getDestinationstate();
     String destinationCountry=registerForm.getDestinationcountry();
     String deliveryStart=registerForm.getDeliverystart();
     String deliveryEnd=registerForm.getDeliveryend();


        Origin origin=new Origin();
        origin.setShipfrom(shiopFrom);
        origin.setOriginstreet(originStree);
        origin.setOrigincity(oringinCity);
        origin.setOriginstate(originState);
        origin.setOrigincountry(originCountry);
        origin.setPickupstart(pickupStart);
        origin.setPickupend(pickupEnd);





        Destination destination=new Destination();
        destination.setShipto(shiopTo);
        destination.setDestinationstreat(destinationStree);
        destination.setDestinationcity(destinationCity);
        destination.setDestinationstate(destinationState);
        destination.setDestinationcountry(destinationCountry);
        destination.setDeliverystart(deliveryStart);
        destination.setDeliveryend(deliveryEnd);

        PurchaseOrder purchaseOrder=new PurchaseOrder();
        purchaseOrder.setPonumber(poNumber);
        purchaseOrder.setPoissuedate(issueDate);
        purchaseOrder.setTransresp(transResp);
        purchaseOrder.setDesinatedmode(desgMode);
        purchaseOrder.setStatus(status);
        purchaseOrder.setDuedate(dueDate);
        purchaseOrder.setIncorterns(incoterns);
        purchaseOrder.setCarrier(carier);
        purchaseOrder.setPriority(priority);
        purchaseOrder.setSeller(seller);
        purchaseOrder.setBillto(billTo);
        purchaseOrder.setOrigin(origin);
        purchaseOrder.setDestination(destination);


        RegisterDo registerDo=new RegisterDo();
        registerDo.save(purchaseOrder);
        List<PurchaseOrder> registerFormList=registerDo.viewPurchaseOrder(st1);
        request.setAttribute("registerDo",registerFormList);
        return mapping.findForward("pass");










        //return super.execute(mapping, form, request, response);
    }
}
