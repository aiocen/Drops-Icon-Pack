package com.aiocen.iconpack.drops.applications;

import com.dm.material.dashboard.candybar.applications.CandyBarApplication;

public class CandyBar extends CandyBarApplication {

    @Override
    public void onCreate() {
        Configuration configuration = new Configuration();

        configuration.setGenerateAppFilter(true);
        configuration.setGenerateAppMap(true);
        configuration.setGenerateThemeResources(true);
        configuration.setIncludeIconRequestToEmailBody(true);

        configuration.setNavigationIcon(NavigationIcon.STYLE_3);
        configuration.setNavigationViewHeaderStyle(NavigationViewHeader.NONE);
        configuration.setSocialIconColor(IconColor.ACCENT);
        configuration.setShowTabAllIcons(true);
        configuration.setTabAllIconsTitle("All Icons");
        configuration.setShadowEnabled(false);

        configuration.setDashboardThemingEnabled(false);

        initApplication(configuration);
    }
}
