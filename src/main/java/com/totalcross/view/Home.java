package com.totalcross.view;

import com.totalcross.componets.CardAlarm;
import com.totalcross.componets.CardDegrees;
import com.totalcross.componets.CardDoorBell;
import com.totalcross.componets.CardEntertainment;
import com.totalcross.componets.CardInfo;
import com.totalcross.componets.CardLight;
import com.totalcross.componets.CardMusic;
import com.totalcross.componets.CardRoom;
import com.totalcross.componets.CardTemp;

import totalcross.ui.Container;
import totalcross.util.UnitsConverter;
import totalcross.ui.Control;
import totalcross.ui.ScrollContainer;


public class Home extends Container{

    private CardLight light;
    private CardDoorBell door;
    private CardEntertainment entertainment;
    private ScrollContainer sc;
    private CardRoom room;
    private CardAlarm alarm;
    private CardInfo info;
    private CardDegrees degrees;
    private CardMusic music;
    private CardTemp temp;
    
    
    public void initUI(){
        //Scroll 
        sc = new ScrollContainer(false, true);
        int gap = UnitsConverter.toPixels(DP + 16);
        sc.setInsets(gap, gap, gap, gap);
        //Add Control in Container
        add(sc, LEFT + UnitsConverter.toPixels(Control.DP -10 ), TOP- UnitsConverter.toPixels(Control.DP ), UnitsConverter.toPixels(Control.DP + 400), FILL);
        
        //Components 
        this.light = new CardLight("Luzes");
        this.door = new CardDoorBell("Doorbell");
        this.entertainment = new CardEntertainment("Entetrenimento");
        this.room = new CardRoom();
        this.alarm = new CardAlarm();
        this.info = new CardInfo("Informação");
        this.degrees = new CardDegrees();
        this.music = new CardMusic();
        this.temp = new CardTemp();
       
        //Add Components in Scroll
        sc.add(light,LEFT + UnitsConverter.toPixels(Control.DP + 5 ), TOP- UnitsConverter.toPixels(Control.DP - 10), UnitsConverter.toPixels(Control.DP + 300), DP + 206);
        sc.add(door,LEFT + UnitsConverter.toPixels(Control.DP + 5 ), TOP- UnitsConverter.toPixels(Control.DP - 220), UnitsConverter.toPixels(Control.DP + 300), DP + 206);
        sc.add(entertainment,LEFT + UnitsConverter.toPixels(Control.DP + 5 ), TOP- UnitsConverter.toPixels(Control.DP - 430), UnitsConverter.toPixels(Control.DP + 300), DP + 406);
        sc.add(room,LEFT + UnitsConverter.toPixels(Control.DP + 5 ), TOP- UnitsConverter.toPixels(Control.DP - 840), UnitsConverter.toPixels(Control.DP + 300), DP + 400);
        sc.add(alarm,LEFT + UnitsConverter.toPixels(Control.DP + 5 ), TOP- UnitsConverter.toPixels(Control.DP - 1245), UnitsConverter.toPixels(Control.DP + 300), DP + 150);
        sc.add(info,LEFT + UnitsConverter.toPixels(Control.DP + 5 ), TOP- UnitsConverter.toPixels(Control.DP - 1400), UnitsConverter.toPixels(Control.DP + 300), DP + 206);
        sc.add(degrees,LEFT + UnitsConverter.toPixels(Control.DP + 5 ), TOP- UnitsConverter.toPixels(Control.DP - 1610), UnitsConverter.toPixels(Control.DP + 300), DP + 306);
        sc.add(music,LEFT + UnitsConverter.toPixels(Control.DP + 5 ), TOP- UnitsConverter.toPixels(Control.DP - 1920), UnitsConverter.toPixels(Control.DP + 300), DP + 150);
        sc.add(temp,LEFT + UnitsConverter.toPixels(Control.DP + 5 ), TOP- UnitsConverter.toPixels(Control.DP - 2075), UnitsConverter.toPixels(Control.DP + 300), DP + 160);
        
        

    }
    
}
