package com.example.jacoco.test;

import org.jetbrains.annotations.Nullable;

public class C1 implements I1<String> {
    @Override
    public boolean test(String s) {
        @Nullable Object o = new Object();
        return true;
    }
}
