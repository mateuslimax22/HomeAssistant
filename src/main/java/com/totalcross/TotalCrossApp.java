package com.totalcross;

import totalcross.ui.MainWindow;
import totalcross.ui.SideMenuContainer;
import totalcross.ui.Label;
import totalcross.ui.gfx.Color;
import totalcross.ui.icon.MaterialIcons;
import totalcross.ui.icon.Icon;
import totalcross.ui.font.*;
import totalcross.util.UnitsConverter;
import totalcross.ui.Container;
import totalcross.ui.Control;
import totalcross.sys.Settings;

import com.totalcross.view.Home;
import com.totalcross.view.Map;


public class TotalCrossApp extends MainWindow {
    
    private SideMenuContainer sideMenu;
    private Icon icon;

    public TotalCrossApp() {
        setUIStyle(Settings.MATERIAL_UI);
        uiAdjustmentsBasedOnFontHeightIsSupported = false;
    }
    
    public void initUI(){

        //Side menu
        SideMenuContainer.Item home = new SideMenuContainer.Item("Home Assistant", MaterialIcons._DASHBOARD, Color.BLACK, () -> { return new Home(); });
		SideMenuContainer.Item map = new SideMenuContainer.Item("Mapa", MaterialIcons._PERSON_PIN, Color.BLACK, ()-> {return new Map();});
        sideMenu = new SideMenuContainer(null, home, map);
        
        sideMenu.topMenu.header = new Container(){
            public void initUI(){
                setBackColor(Color.WHITE);
                setBorderStyle(BORDER_RAISED);
                Label title = new Label("Home Assistant", LEFT, Color.BLACK, false);
                title.setFont(Font.getFont("Lato Bold", false, this.getFont().size));
                title.setForeColor(Color.BLACK);
                add(title, LEFT + UnitsConverter.toPixels(Control.DP + 10), BOTTOM - UnitsConverter.toPixels(Control.DP + 10), FILL, DP + 56);
            }
        };
        
        
        sideMenu.setBackColor(0x4A90E2);
        sideMenu.setForeColor(Color.WHITE);
        sideMenu.setItemForeColor(Color.BLACK);
        sideMenu.topMenu.drawSeparators = true;
        sideMenu.topMenu.itemHeightFactor = 3;
        sideMenu.topMenu.header.setInsets(0, 0, TOP, 0);

        //Icon
        icon = new Icon(MaterialIcons._MENU);
        icon.setBackColor(Color.WHITE);

        //Add Control in Container
        add(icon, CENTER, TOP);
        add(sideMenu, LEFT, TOP, PARENTSIZE, PARENTSIZE);
    }
    

    



}
