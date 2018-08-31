package smt.svm.pwadataprovider.ui;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SpringUI
public class MainUI extends UI{
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        String firmId = vaadinRequest.getParameter("firmId");
        Label currentFirmLabel = new Label("Main UI for firm Id : " +  firmId);
        setContent(currentFirmLabel);
    }
}
