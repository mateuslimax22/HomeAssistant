package com.totalcross.componets;

import totalcross.ui.icon.Icon;
import totalcross.ui.Label;
import totalcross.ui.gfx.Color;
import totalcross.ui.font.Font;
import totalcross.ui.icon.MaterialIcons;
import totalcross.util.UnitsConverter;
import totalcross.ui.Container;
import totalcross.ui.Control;

public class CardInfo extends Container {

    private Label lbl;
    private Label job;
    private Label us;
    private Label house;
    private Label statusjob;
    private Label statusus;
    private Label statush;
    private Label statusspy;
    private Label spy;
    private String txt;
    private Icon iconcarjob;
    private Icon iconcarh;
    private Icon iconspy;
    private Icon iconus;
    
    public CardInfo(String txt) {
        this.txt = txt;

    }

    public void initUI() {

        setBorderStyle(BORDER_ROUNDED);

        //Text
        lbl = new Label(txt);
        lbl.transparentBackground = true;
        lbl.setFont(Font.getFont("Lato Bold",false,14));
        lbl.setForeColor(Color.BLACK);

        job = new Label("Indo para o Trabalho");
        job.transparentBackground = true;
        job.setFont(Font.getFont("Lato Bold",false,12));
        job.setForeColor(Color.BLACK);

        statusjob = new Label("37 min");
        statusjob.transparentBackground = true;
        statusjob.setFont(Font.getFont("Lato Bold",false,12));
        statusjob.setForeColor(Color.BLACK);

        house = new Label("Indo para Casa");
        house.transparentBackground = true;
        house.setFont(Font.getFont("Lato Bold",false,12));
        house.setForeColor(Color.BLACK);

        statush = new Label("41 min");
        statush.transparentBackground = true;
        statush.setFont(Font.getFont("Lato Bold",false,12));
        statush.setForeColor(Color.BLACK);

        spy = new Label("PlexSpy");
        spy.transparentBackground = true;
        spy.setFont(Font.getFont("Lato Bold",false,12));
        spy.setForeColor(Color.BLACK);

        statusspy = new Label("0 Watching");
        statusspy.transparentBackground = true;
        statusspy.setFont(Font.getFont("Lato Bold",false,12));
        statusspy.setForeColor(Color.BLACK);

        us = new Label("USDINR");
        us.transparentBackground = true;
        us.setFont(Font.getFont("Lato Bold",false,12));
        us.setForeColor(Color.BLACK);

        statusus = new Label("71,25 INR");
        statusus.transparentBackground = true;
        statusus.setFont(Font.getFont("Lato Bold",false,12));
        statusus.setForeColor(Color.BLACK);
        
        //Icons
        iconcarjob = new Icon(MaterialIcons._DIRECTIONS_CAR);
        iconcarjob.setFont(iconcarjob.getFont().adjustedBy(-10));
        
        iconcarh = new Icon(MaterialIcons._DIRECTIONS_CAR);
        iconcarh.setFont(iconcarh.getFont().adjustedBy(-10));
       
        iconspy = new Icon(MaterialIcons._REMOVE_RED_EYE);
        iconspy.setFont(iconspy.getFont().adjustedBy(-10));
        
        iconus= new Icon(MaterialIcons._MONETIZATION_ON);
        iconus.setFont(iconus.getFont().adjustedBy(-10));
        

        //////Add Control in Container
        add(lbl, LEFT + UnitsConverter.toPixels(Control.DP + 5), TOP- UnitsConverter.toPixels(Control.DP - 10) );
     

        add(iconcarjob, LEFT + UnitsConverter.toPixels(Control.DP + 12), TOP- UnitsConverter.toPixels(Control.DP - 58) );
        add(job, LEFT + UnitsConverter.toPixels(Control.DP + 40), TOP- UnitsConverter.toPixels(Control.DP - 63) );
        add(statusjob,RIGHT + UnitsConverter.toPixels(Control.DP - 20), TOP- UnitsConverter.toPixels(Control.DP - 60), UnitsConverter.toPixels(Control.DP + 80), DP + 25 );
    

        add(iconcarh, LEFT + UnitsConverter.toPixels(Control.DP + 12), TOP- UnitsConverter.toPixels(Control.DP - 88) );
        add(house, LEFT + UnitsConverter.toPixels(Control.DP + 40), TOP- UnitsConverter.toPixels(Control.DP - 93) );
        add(statush,RIGHT + UnitsConverter.toPixels(Control.DP - 20), TOP- UnitsConverter.toPixels(Control.DP - 90), UnitsConverter.toPixels(Control.DP + 80), DP + 25 );
      

        add(iconspy, LEFT + UnitsConverter.toPixels(Control.DP + 10), TOP- UnitsConverter.toPixels(Control.DP - 121) );
        add(spy, LEFT + UnitsConverter.toPixels(Control.DP + 40), TOP- UnitsConverter.toPixels(Control.DP - 123) );
        add(statusspy,RIGHT + UnitsConverter.toPixels(Control.DP - 20), TOP- UnitsConverter.toPixels(Control.DP - 120), UnitsConverter.toPixels(Control.DP + 80), DP + 25 );
      

        add(iconus, LEFT + UnitsConverter.toPixels(Control.DP + 10), TOP- UnitsConverter.toPixels(Control.DP - 151) );
        add(us, LEFT + UnitsConverter.toPixels(Control.DP + 40), TOP- UnitsConverter.toPixels(Control.DP - 153) );
        add(statusus,RIGHT + UnitsConverter.toPixels(Control.DP - 20), TOP- UnitsConverter.toPixels(Control.DP - 150), UnitsConverter.toPixels(Control.DP + 80), DP + 25 );
    



}




}
