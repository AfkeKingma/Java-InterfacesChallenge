package com.company;

import java.util.ArrayList;
import java.util.List;

public class firstName implements ISaveable {
    private String firstName;

    public firstName(String firstName) {
        this.firstName = firstName;
    }

    public firstName() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "firstName{" +
                "firstName='" + firstName + '\'' +
                '}';
    }

    @Override
    public ArrayList<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, "");
        values.add(1, "");

        return (ArrayList<String>) values;
    }

    @Override
    public void read(List<String> values) {
        if(values != null && values.size() >= 0 ) {
            this.firstName = values.get(0);
        }
    }
}
