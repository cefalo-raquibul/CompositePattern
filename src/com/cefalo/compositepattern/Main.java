package com.cefalo.compositepattern;

import com.cefalo.compositepattern.containers.FieldGroup;
import com.cefalo.compositepattern.containers.MyForm;
import com.cefalo.compositepattern.formelements.EmailInputElement;
import com.cefalo.compositepattern.formelements.MultiChoiceElement;
import com.cefalo.compositepattern.formelements.NumberInputElement;
import com.cefalo.compositepattern.formelements.TextInputElement;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TextInputElement firstName = new TextInputElement();
        TextInputElement lastName = new TextInputElement();
        EmailInputElement emailInputElement = new EmailInputElement();
        FieldGroup name = new FieldGroup();
        name.addElement(firstName);
        name.addElement(lastName);
        name.addElement(emailInputElement);


        TextInputElement city = new TextInputElement();
        MultiChoiceElement country = new MultiChoiceElement(Arrays.asList("America", "Bangladesh", "China"));

        FieldGroup addressgroup = new FieldGroup();
        addressgroup.addElement(city);
        addressgroup.addElement(country);

        NumberInputElement numberInputElement = new NumberInputElement();
        numberInputElement.setNumberText("123");

        MyForm form = new MyForm();
        form.addElement(name);
        form.addElement(addressgroup);
        form.addElement(numberInputElement);


        firstName.setTextData("first");
        emailInputElement.setInputText("asdf@cefalo.com");
        city.setTextData("dhaka");
        country.setSelected("Bangladesh");


        System.out.println(form.isValid());


    }
}
