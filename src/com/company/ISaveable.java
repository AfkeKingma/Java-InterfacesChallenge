package com.company;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    ArrayList<String> write();
    void read(List<String> values);
}
