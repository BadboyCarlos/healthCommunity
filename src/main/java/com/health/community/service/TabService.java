package com.health.community.service;

import com.health.community.domain.Tab;

import java.util.List;

public interface TabService {
    List<Tab> getAllTabs();

    Tab getByTabNameEn(String tabName);
}
