package com.totalcross.view;

import com.totalcross.util.StaticMap;
import totalcross.ui.Container;
import totalcross.sys.Settings;
import totalcross.util.UnitsConverter;
import totalcross.ui.Control;
import totalcross.ui.ImageControl;



public class Map extends Container {
    
    @Override
    public void initUI() {
        //Map
        double lat = -22.951916;
        double log = -43.2126759;

        int gap =  UnitsConverter.toPixels(Control.DP + 320);

        StaticMap staticMap = new StaticMap.Builder("Fola4mnv4rVDbjzo3Obu", "6Xgu6eVAmLKOPLZXZgy5-Q")
                .setLocation(lat,log)
                .setWidth(Settings.screenWidth - 2 * gap)
                .setHeight(Settings.screenHeight  + 100)
                .setZoom(17)
                .build();

        ImageControl imgC = new ImageControl(staticMap.getImage());
        
        //Add Control in Container
        add(imgC, CENTER,TOP + 5, UnitsConverter.toPixels(Control.DP + 290), DP +1005);

    }
}