package com.bee.sample.ch9.service;

public interface CreditSystemService {
    public int getUserCredit(int userId);

    public boolean addCedit(int userId, int score);
}
