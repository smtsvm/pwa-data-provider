package smt.svm.pwadataprovider.ui;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SpringUI(path = "material")
public class MaterialUI extends UI {
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        String firmId = vaadinRequest.getParameter("firmId");
        setContent(new Label("Material UI for firm " + firmId));
    }
}
