package com.entertainment.client;

import com.entertainment.Television;

import java.util.HashSet;
import java.util.Set;

public class TelevisionClient {

    public static void main(String[] args) {
        // show behavior of == versus equals()
        Television tvA = new Television("Sony", 50);
        Television tvB = new Television("Sony", 50);

        // use == to show if tvA and tvB refer to same physical object
        System.out.println("tvA == tvB: " + (tvA == tvB));  // obviously false

        // use equals() to show if tvA and tvB are "equal" (details later)
        System.out.println("tvA.equals(tvB): " + tvA.equals(tvB));  // this is now true
        System.out.println();

//        System.out.println(tvA.hashCode()); // 80069516
//        System.out.println(tvB.hashCode()); // 80069516
//        System.out.println();

        Set<Television> tvs = new HashSet<>();
        tvs.add(tvA);
        tvs.add(tvB);   // should be rejected as a duplicate
        System.out.println("The size of the set is: " + tvs.size());
    }

}