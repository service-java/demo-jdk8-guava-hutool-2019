package com.wiley.javainterviewsexposed.chapter08;

public interface Java8Interface {
    void alpha();
    int beta default { return 6; };
    String omega final { return "Cannot override"; };
}
