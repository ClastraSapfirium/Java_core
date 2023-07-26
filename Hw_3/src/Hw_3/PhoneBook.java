package Hw_3;

import java.util.ArrayList;

import java.util.List;

public class PhoneBook {
    private List<Contact> ls = new ArrayList<>();
    
    public List<Contact> getLs(){
        return ls;
    }
    public void addContact(Contact ct){
        if(ls.contains(ct)) updateContact(ct);
        else ls.add(ct);
    }
    public void removeContact(Contact ct){
        ls.remove(ct);
    }

    public void updateContact(Contact ct){
        int i = ls.indexOf(ct);
        if(i!=-1) ls.set(i,ct);
        else addContact(ct);
    }
}