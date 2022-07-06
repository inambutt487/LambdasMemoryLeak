package com.example.lambdasmemoryleak;

import java.util.HashSet;
import java.util.Set;

public class Calculator {

    interface Listener {
        void onResult(int result);
    }

    Set<Listener> listeners = new HashSet<>();

    void addListener(Listener listener) {
        listeners.add(listener);
    }

    void removeListener(Listener listener) {
        listeners.remove(listener);
    }

    int sum(int a, int b){
        return a+b;
    }
}