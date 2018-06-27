
package com.maquendi.managedBean;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;


@Named(value = "navigationController")
@ViewScoped
public class NavigationController implements Serializable{

   
    public NavigationController() {
    }
    
    
    public String gotoLogin(){
        return "login";
    }
}
