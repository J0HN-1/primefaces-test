package org.primefaces.test;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "testView")
@ViewScoped
public class TestView implements Serializable {
    
    private boolean showMiddleName=true;

    private Person[] data = new Person[]{
        new Person("Rachel", "Karen", "Green"),
        new Person("Monica", "E.", "Geller-Bing"),
        new Person("Phoebe", null, "Buffay-Hannigan"),
        new Person("Joseph", "Francis", "Tribbiani"),
        new Person("Chandler", "Muriel", "Bing"),
        new Person("Ross", "Eustace", "Geller"),
    };

    public Person[] getData() {
        return data;
    }

    public boolean getShowMiddleName() {
        return showMiddleName;
    }

    public void setShowMiddleName(boolean shoeMiddleName) {
        this.showMiddleName = shoeMiddleName;
    }

    public void toggleMiddleName() {
        showMiddleName = !showMiddleName;
    }
}
