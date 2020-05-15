package app.kori.tutorial.beans;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class WelcomePageBean {

    private String welcomeUserName;
    private String completedGreeting;

    public String getWelcomeUserName() {
        return welcomeUserName;
    }

    public void setWelcomeUserName(String welcomeUserName) {
        this.welcomeUserName = welcomeUserName;
    }

    public String getCompletedGreeting() {
        return completedGreeting;
    }

    public void setCompletedGreeting(String completedGreeting) {
        this.completedGreeting = completedGreeting;
    }

    public void sayHello(){
        completedGreeting = "Hello, " + welcomeUserName;
    }

    public String navigateToFlashPage(){
        FacesContext.getCurrentInstance().getExternalContext().getFlash().put("transmittedVariable", "Paolo sent this");
        return "flashscope.xhtml";
    }
}
