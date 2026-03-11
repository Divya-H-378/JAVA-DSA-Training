package com.advanced.collections.sets;

import com.sun.source.doctree.SeeTree;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class LeaderBoard {
    public static void main(String[] args) {
        Set<Integer> scores = new TreeSet<>(Collections.reverseOrder());
        scores.add(200);
        scores.add(100);
        scores.add(150);
        scores.add(450);
        scores.add(300);
        scores.add(120);
        System.out.println(" Leader Board Stats: " + scores);
    }
}
