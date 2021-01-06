package ro.uvt.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BaseElement implements Element {

    @Id
    @GeneratedValue
    public int idBaseElement;

    @Override
    public void accept(Visitor v) {

    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element getElement(int i) {
        return null;
    }
}
