package com.cefalo.compositepattern.formelements;

import com.cefalo.compositepattern.formelements.FormElement;

import java.util.List;

/**
 * Created by shimul on 11/25/16.
 */
public class MultiChoiceElement implements FormElement {

    List<String> elements;
    String selected = null;

    public MultiChoiceElement(List<String> choices){
        this.elements = choices;
    }

    public void setSelected(String choice){
        this.selected = choice;
    }

    @Override
    public void addElement(FormElement element) {
        throw new  UnsupportedOperationException();
    }

    @Override
    public boolean isValid() {
        if(selected == null || selected.equalsIgnoreCase("") || !elements.contains(selected)) {
            System.out.println("Multi choice input not valid");
            return false;
        }
        return true;
    }
}
