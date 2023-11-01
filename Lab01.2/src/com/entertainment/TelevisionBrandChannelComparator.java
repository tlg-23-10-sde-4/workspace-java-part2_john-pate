package com.entertainment;

import java.util.Comparator;

public class TelevisionBrandChannelComparator implements Comparator<Television> {

    public int compare(Television television1, Television television2) {
        int result = television1.getBrand().compareTo(television2.getBrand());

        if (result == 0) {
            result = Integer.compare(television1.getCurrentChannel(), television2.getCurrentChannel());
        }
        return result;
    }

}