package my.vaadin.profile;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gaz
 */

import java.util.*;
import java.lang.*;
import java.lang.Object;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.UserError;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.RichTextArea;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;



public class Forms extends VerticalLayout implements View {
    

    public Forms() {
        setSpacing(true);
        setMargin(true);

        Label title = new Label("Signup Form");
        title.addStyleName("h1");
        addComponent(title);

        final FormLayout form = new FormLayout();
        form.setMargin(false);
        form.setWidth("900px");
        form.addStyleName("light");
        addComponent(form);

        
        Label section = new Label("Personal Info");
        section.addStyleName("h2");
        section.addStyleName("colored");
        form.addComponent(section);
        //StringGenerator sg = new StringGenerator();
        
        TextField zID = new TextField("zID");
        zID.setValue("z123456");
        zID.setRequired(true);
        form.addComponent(zID);

        TextField name = new TextField("Name");
        name.setValue("loreum");
        //name.setWidth("50%");
        form.addComponent(name);
        
        PasswordField pw = new PasswordField("Set Password");
        pw.setRequired(true);
        form.addComponent(pw);

        DateField birthday = new DateField("Birthday");
        birthday.setDateFormat("dd-MM-yyyy");
        birthday.setValue(new java.util.Date());
        form.addComponent(birthday);

        OptionGroup gender = new OptionGroup("Gender");
        gender.addItem("Male");
        gender.addItem("Female");
        //sex.select("Male");
        gender.addStyleName("horizontal");
        form.addComponent(gender);
        
        section = new Label("Class Info");
        section.addStyleName("h2");
        section.addStyleName("colored");
        form.addComponent(section);
        
        TextField classID = new TextField("Class ID");
        classID.setValue("INFS2605");
        classID.setRequired(true);
        //classID.setWidth("50%");
        form.addComponent(classID);
        
        TextField groupID = new TextField("Group ID");
        groupID.setValue("1");
        //groupID.setWidth("50%");
        groupID.setRequired(true);
        form.addComponent(groupID);
        
        Button confirm = new Button("Confirm");
        confirm.addStyleName("primary");
        form.addComponent(confirm);
        
        HorizontalLayout footer = new HorizontalLayout();
        footer.setMargin(new MarginInfo(true, false, true, false));
        footer.setSpacing(true);
        footer.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        form.addComponent(footer);
        footer.addComponent(confirm);
        

        
    }
    @Override
    public void enter(ViewChangeEvent event) {
        Notification.show("Showing page Forms");

    }
}
