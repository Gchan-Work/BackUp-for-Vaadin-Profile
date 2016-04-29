/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.vaadin.profile;

import static com.vaadin.server.Sizeable.UNITS_EM;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author Gaz
 */
public class MainLayout extends VerticalLayout{
    private HorizontalLayout upperSection = new HorizontalLayout();
    private HorizontalLayout innerUpperSection = new HorizontalLayout();
    private HorizontalSplitPanel lowerSection = new HorizontalSplitPanel();
    private VerticalLayout menuLayout = new VerticalLayout();
    private HorizontalLayout menuTitle = new HorizontalLayout();
    private CssLayout contentLayout = new CssLayout();
    
    
    public MainLayout() {
        
        Label header = new Label ("Student");
        header.addStyleName("colored");
        header.addStyleName("h2");
        //header.addStyleName("alignRight");
        header.setSizeUndefined();
        
        Button signOut = new Button("Sign-Out");
        signOut.setSizeUndefined();
        signOut.addStyleName("small");
        
        
        
        Label menu = new Label("Menu");
        menu.addStyleName("colored");
        menu.addStyleName("h2");
        
        upperSection.setSizeFull();
        
        innerUpperSection.addComponent(header);
        innerUpperSection.addComponent(signOut);
        innerUpperSection.setExpandRatio(signOut, 1);
        innerUpperSection.setSpacing(true);
        innerUpperSection.setComponentAlignment(signOut, Alignment.MIDDLE_RIGHT);
        
        upperSection.addComponent(innerUpperSection);
        upperSection.setMargin(new MarginInfo(false, true, false, false));
        upperSection.setComponentAlignment(innerUpperSection, Alignment.TOP_RIGHT);
        upperSection.addStyleName("borderBottom");
        
        
        
        
        
        
        
        menuTitle.addComponent(menu);
        menuLayout.addComponent(menuTitle);
        menuLayout.setWidth("100%");
        menuLayout.setComponentAlignment(menuTitle,
                Alignment.MIDDLE_CENTER);
        //menuLayout.addStyleName("whiteStuff");
//        menuLayout.setExpandRatio(, 1);
        
        //contentLayout.addComponent();
        
        lowerSection.addComponent(menuLayout);
        lowerSection.addComponent(contentLayout);
        
        addComponent(upperSection);
        addComponent(lowerSection);
        
        
      
        upperSection.setHeight(4,UNITS_EM);
        
        
        //showBorders();
        setSizeFull();
        lowerSection.setSizeFull();
        //menuLayout.setSizeFull();
        contentLayout.setSizeFull();
        
        setExpandRatio(lowerSection, 1);
        
        lowerSection.setSplitPosition(15);
        
        
        
        Button lolol = new Button("hi");
        menuLayout.addComponent(lolol);
        lolol.setWidth("100%");
        lolol.setStyleName("borderless");
        
        
    }
    
    private void showBorders() {
        setStyleName("border");
        upperSection.setStyleName("border");
        lowerSection.setStyleName("border");
        menuLayout.setStyleName("border");
        //contentLayout.setStyleName("border");
    }
    
    public void addMenuOption(String caption,
            final Component component) {
        Button button = new Button(caption);
        button.setWidth("100%");
        button.setStyleName("borderless");
        menuLayout.addComponent(button);
        button.addClickListener(new Button.ClickListener() {
            public void buttonClick(Button.ClickEvent event) {
                contentLayout.removeAllComponents();
                contentLayout.addComponent(component);
            }
        });
    }
    
    
    
}
