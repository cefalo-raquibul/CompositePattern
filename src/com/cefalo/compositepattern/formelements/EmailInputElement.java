package com.cefalo.compositepattern.formelements;

/**
 * Created by shimul on 11/25/16.
 */
public class EmailInputElement implements FormElement {

    private String inputText;

    public String getInputText() {
        return inputText;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    @Override
    public void addElement(FormElement element) {
        throw new UnsupportedOperationException();

    }

    @Override
    public boolean isValid() {
        if(inputText!=null && inputText.contains("@")) {
            return true;
        }
        System.out.println("Email input not valid");
        return false;
    }
}
