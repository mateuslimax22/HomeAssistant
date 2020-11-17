package com.totalcross.componets;

import totalcross.ui.icon.Icon;
import totalcross.ui.Label;
import totalcross.ui.gfx.Color;
import totalcross.ui.font.Font;
import totalcross.ui.icon.MaterialIcons;
import totalcross.util.UnitsConverter;
import totalcross.ui.Container;
import totalcross.ui.Control;

public class CardDoorBell extends Container {
    
    private Label lbl;
    private Label fdding;
    private Label fdlastmotion;
    private Label fdmotion;
    private Label fdlastding;
    private Label statusding;
    private Label statuslastmotion;
    private Label statusmotion;
    private Label statuslastding;
    private String txt;
    private Icon iconfdding;
    private Icon iconfdmotion;
    private Icon iconfdlastding;
    private Icon iconfdlastmotion;


    public CardDoorBell(String txt) {
        this.txt = txt;

    }

    public void initUI() {
        setBorderStyle(BORDER_ROUNDED);

        //Icons
        iconfdding = new Icon(MaterialIcons._HOME);
        iconfdding.setFont(iconfdding.getFont().adjustedBy(-10));

        iconfdmotion = new Icon(MaterialIcons._DIRECTIONS_WALK);
        iconfdmotion.setFont(iconfdmotion.getFont().adjustedBy(-10));

        iconfdlastding = new Icon(MaterialIcons._UPDATE);
        iconfdlastding.setFont(iconfdlastding.getFont().adjustedBy(-10));

        iconfdlastmotion= new Icon(MaterialIcons._UPDATE);
        iconfdlastmotion.setFont(iconfdlastmotion.getFont().adjustedBy(-10));

        //Text
        lbl = new Label(txt);
        lbl.transparentBackground = true;
        lbl.setFont(Font.getFont("Lato Bold",false,14));
        lbl.setForeColor(Color.BLACK);

        fdding = new Label("Front Door Ding");
        fdding.transparentBackground = true;
        fdding.setFont(Font.getFont("Lato Bold",false,12));
        fdding.setForeColor(Color.BLACK);

        statusding = new Label("Desocupado");
        statusding.transparentBackground = true;
        statusding.setFont(Font.getFont("Lato Bold",false,12));
        statusding.setForeColor(Color.BLACK);
       
        fdmotion = new Label("Front Door Motion");
        fdmotion.transparentBackground = true;
        fdmotion.setFont(Font.getFont("Lato Bold",false,12));
        fdmotion.setForeColor(Color.BLACK);

        statusmotion = new Label("Desligado");
        statusmotion.transparentBackground = true;
        statusmotion.setFont(Font.getFont("Lato Bold",false,12));
        statusmotion.setForeColor(Color.BLACK);
        
        fdlastding = new Label("Front Door Last Ding");
        fdlastding.transparentBackground = true;
        fdlastding.setFont(Font.getFont("Lato Bold",false,12));
        fdlastding.setForeColor(Color.BLACK);

        statuslastding = new Label("06:44");
        statuslastding.transparentBackground = true;
        statuslastding.setFont(Font.getFont("Lato Bold",false,12));
        statuslastding.setForeColor(Color.BLACK);
        
        fdlastmotion = new Label("Front Door Last Motion");
        fdlastmotion.transparentBackground = true;
        fdlastmotion.setFont(Font.getFont("Lato Bold",false,12));
        fdlastmotion.setForeColor(Color.BLACK);

        statuslastmotion = new Label("13:21");
        statuslastmotion.transparentBackground = true;
        statuslastmotion.setFont(Font.getFont("Lato Bold",false,12));
        statuslastmotion.setForeColor(Color.BLACK);
        


        //Add Control in Container
        add(lbl, LEFT + UnitsConverter.toPixels(Control.DP + 5), TOP- UnitsConverter.toPixels(Control.DP - 10) );

        add(iconfdding, LEFT + UnitsConverter.toPixels(Control.DP + 10), TOP- UnitsConverter.toPixels(Control.DP - 58) );
        add(fdding, LEFT + UnitsConverter.toPixels(Control.DP + 40), TOP- UnitsConverter.toPixels(Control.DP - 63) );
        add(statusding,RIGHT + UnitsConverter.toPixels(Control.DP - 20), TOP- UnitsConverter.toPixels(Control.DP - 60), UnitsConverter.toPixels(Control.DP + 80), DP + 25 );
    

        add(iconfdmotion, LEFT + UnitsConverter.toPixels(Control.DP + 15), TOP- UnitsConverter.toPixels(Control.DP - 88) );
        add(fdmotion, LEFT + UnitsConverter.toPixels(Control.DP + 40), TOP- UnitsConverter.toPixels(Control.DP - 93) );
        add(statusmotion,RIGHT + UnitsConverter.toPixels(Control.DP - 20), TOP- UnitsConverter.toPixels(Control.DP - 90), UnitsConverter.toPixels(Control.DP + 80), DP + 25 );
      

        add(iconfdlastding, LEFT + UnitsConverter.toPixels(Control.DP + 10), TOP- UnitsConverter.toPixels(Control.DP - 121) );
        add(fdlastding, LEFT + UnitsConverter.toPixels(Control.DP + 40), TOP- UnitsConverter.toPixels(Control.DP - 123) );
        add(statuslastding,RIGHT + UnitsConverter.toPixels(Control.DP - 20), TOP- UnitsConverter.toPixels(Control.DP - 120), UnitsConverter.toPixels(Control.DP + 80), DP + 25 );
      

        add(iconfdlastmotion, LEFT + UnitsConverter.toPixels(Control.DP + 10), TOP- UnitsConverter.toPixels(Control.DP - 151) );
        add(fdlastmotion, LEFT + UnitsConverter.toPixels(Control.DP + 40), TOP- UnitsConverter.toPixels(Control.DP - 153) );
        add(statuslastmotion,RIGHT + UnitsConverter.toPixels(Control.DP - 20), TOP- UnitsConverter.toPixels(Control.DP - 150), UnitsConverter.toPixels(Control.DP + 80), DP + 25 );
    



}




}
