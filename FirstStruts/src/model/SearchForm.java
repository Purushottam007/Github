package model;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by PURUSHOTHAM on 02/05/2017.
 */
public class SearchForm extends ActionForm {
    private String search;

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return "SearchForm{" +
                "search='" + search + '\'' +
                '}';
    }

    public SearchForm(String search) {
        this.search = search;
    }
    public SearchForm() {

    }
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request){
        return super.validate(mapping,request);
    }

}
