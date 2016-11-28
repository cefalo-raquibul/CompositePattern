package com.cefalo.compositepattern.containers;

import com.cefalo.compositepattern.formelements.FormElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shimul on 11/25/16.
 */
public class FieldGroup implements FormElement {

    List<FormElement> children = new ArrayList<FormElement>();

    @Override
    public void addElement(FormElement element) {
        this.children.add(element);
    }

    @Override
    public boolean isValid() {
        boolean valid = false;
        for(FormElement element:children) {
            if (!element.isValid())
                return false;

        }

        return true;
    }
}
