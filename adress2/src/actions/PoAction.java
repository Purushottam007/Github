 package actions;

import addresses.DestinationAddress;
import addresses.Po;
import addresses.SourceAddress;
import forms.PurchaseOrderForm;
import manage.PoManage;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by PURUSHOTHAM on 06/05/2017.
 */
public class PoAction extends org.apache.struts.action.Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {


        PurchaseOrderForm poForm = (PurchaseOrderForm) form;  //casting the form into PurchaseOrderForm
        PoManage poManage = new PoManage();                   //creating the object of Pomanage class                 
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  //Creating the object of SimpleDateFormat class

        List<SourceAddress> sourceAddressList = new ArrayList<>();  //creating ArrayList class obj and storing the data in list interface
        SourceAddress sourceAddress = new SourceAddress();          //creating obj of class SourceAdress
        sourceAddress.setShipFrom(poForm.getShipfrom());
        sourceAddress.setAddress(poForm.getOriginstreet());
        sourceAddress.setCity(poForm.getOrigincity());
        sourceAddress.setState(poForm.getOriginstate());
        System.out.println("******** " + poForm.getOrigincity());
        sourceAddress.setCountry(poForm.getOrigincountry());
        System.out.println(poForm.getPickupstart());
        System.out.println(dateFormat.parse(poForm.getPickupstart()));
        sourceAddress.setPickupStart(dateFormat.parse(poForm.getPickupstart()));
        sourceAddress.setPickupEnd(dateFormat.parse(poForm.getPickupend()));
        sourceAddressList.add(sourceAddress);

        List<DestinationAddress> destinationAddresses = new ArrayList<>();
        DestinationAddress destinationAddress = new DestinationAddress();
        destinationAddress.setShipTo(poForm.getShipto());
        destinationAddress.setAddress(poForm.getDestinationstreat());
        destinationAddress.setCity(poForm.getDestinationcity());
        destinationAddress.setState(poForm.getDestinationstate());
        destinationAddress.setCountry(poForm.getDestinationcountry());
        destinationAddress.setDeliveryStart(dateFormat.parse(poForm.getDeliverystart()));
        destinationAddress.setDeliveryEnd(dateFormat.parse(poForm.getDeliveryend()));
        destinationAddresses.add(destinationAddress);


        Po purchaseOrder = new Po();
        purchaseOrder.setPoNum(Integer.parseInt(poForm.getPonumber()));
        purchaseOrder.setStatus(poForm.getStatus());
        purchaseOrder.setPriority(poForm.getPriority());
        purchaseOrder.setIssueDate(dateFormat.parse(poForm.getPoissuedate()));
        purchaseOrder.setDueDate(dateFormat.parse(poForm. getDuedate()));
        purchaseOrder.setSeller(poForm.getSeller());
        purchaseOrder.setTransResp(poForm.getTransresp());
        purchaseOrder.setIncoTerns(poForm.getIncoterms());
        purchaseOrder.setBillTo(poForm.getBillto());
        purchaseOrder.setDesignateMode(poForm.getDesignatedmode());
        purchaseOrder.setCarier(poForm.getCarrier());
        purchaseOrder.setShip_together(Boolean.parseBoolean(poForm.getShiptogether()));
        purchaseOrder.setOriginAddressList(sourceAddressList);
        purchaseOrder.setDestinationAddressList(destinationAddresses);
        System.out.println(purchaseOrder.toString());
        poManage.createPurchaseOrder(purchaseOrder);

        return mapping.findForward("success");


    }
}
