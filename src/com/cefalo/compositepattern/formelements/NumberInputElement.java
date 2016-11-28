package com.cefalo.compositepattern.formelements;

/**
 * Created by Raquibul on 11/28/2016.
 */
public class NumberInputElement implements FormElement
{

    String numberText;


    public String getNumberText()
    {
        return numberText;
    }


    public void setNumberText(String numberText)
    {
        this.numberText = numberText;
    }


    @Override
    public void addElement(FormElement element)
    {
        throw new UnsupportedOperationException();
    }


    @Override
    public boolean isValid()
    {
        if(numberText == null || numberText.trim().equalsIgnoreCase("") || !numberText.matches("[0-9]+")) {
            System.out.println("Number input is not valid");
            return false;
        }

        return true;
    }
}
