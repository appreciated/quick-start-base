package com.github.appreciated.quickstart.base.navigation.theme;

import com.github.appreciated.quickstart.base.pages.ComponentPage;
import com.github.appreciated.quickstart.base.pages.attributes.PageManager;

/**
 * Created by appreciated on 22.06.2017.
 */
public interface PagerView extends ComponentPage, PageManager {
    void next();
    void last();
}
