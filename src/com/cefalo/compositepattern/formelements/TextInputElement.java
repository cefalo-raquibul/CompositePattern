package com.cefalo.compositepattern.formelements;

import com.cefalo.compositepattern.formelements.FormElement;

/**
 * Created by shimul on 11/25/16.
 */
public class TextInputElement implements FormElement {


    private String textData;


    public String getTextData() {
        return textData;
    }

    public void setTextData(String textData) {
        this.textData = textData;
    }

    @Override
    public void addElement(FormElement element) {
        System.out.println("No child can be added to leaf");
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isValid() {
        return true;
    }
}
