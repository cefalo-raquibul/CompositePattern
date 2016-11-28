package com.cefalo.compositepattern.formelements;

/**
 * Created by shimul on 11/25/16.
 */
public interface FormElement {
    void addElement(FormElement element);
    boolean isValid();
}
