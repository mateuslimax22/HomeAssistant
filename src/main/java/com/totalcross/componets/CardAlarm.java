package com.totalcross.componets;

import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.Control;
import totalcross.ui.Label;
import totalcross.ui.event.ControlEvent;
import totalcross.ui.event.Event;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;
import totalcross.ui.icon.Icon;
import totalcross.ui.icon.MaterialIcons;
import totalcross.util.UnitsConverter;

public class CardAlarm extends Container {

    private Label lbl;
    private Button on;
    private Button onout;
    private Button off;
    private Icon security;

    public void CardAlarm(){
        return;
    }

    public void initUI(){

        setBorderStyle(BORDER_ROUNDED);
        //Text
        lbl = new Label("Security");
		lbl.transparentBackground = true;
		lbl.setFont(Font.getFont("Lato Bold",false, 14));
        lbl.setForeColor(Color.BLACK);
        security = new Icon(MaterialIcons._SECURITY);
        security.setFont(security.getFont().adjustedBy(-5));

        //Add Control in Container
        add(lbl, LEFT + UnitsConverter.toPixels(Control.DP + 5), TOP - UnitsConverter.toPixels(Control.DP - 10) );
        add(security, RIGHT + UnitsConverter.toPixels(Control.DP - 30), TOP - UnitsConverter.toPixels(Control.DP - 10) );

        //Buttons
        on = new Button("Armar em casa", Button.BORDER_OUTLINED);
		on.setBackForeColors(Color.BLACK, Color.WHITE);
        on.setFont(on.getFont().adjustedBy(-1));

        onout = new Button("Armar ausente", Button.BORDER_OUTLINED);
		onout.setBackForeColors(Color.BLACK, Color.WHITE);
        onout.setFont(onout.getFont().adjustedBy(-1));
        
        off = new Button("Desarmar", Button.BORDER_OUTLINED);
		off.setBackForeColors(Color.BLACK, Color.WHITE);
        off.setFont(off.getFont().adjustedBy(-1));
        off.setVisible(false);

        //Add Control in Container
        add(on, LEFT + UnitsConverter.toPixels(Control.DP + 20), TOP - UnitsConverter.toPixels(Control.DP - 80) , UnitsConverter.toPixels(Control.DP + 120), DP + 25);
        add(onout, LEFT + UnitsConverter.toPixels(Control.DP + 160), TOP - UnitsConverter.toPixels(Control.DP - 80), UnitsConverter.toPixels(Control.DP + 120), DP + 25);
        add(off, LEFT + UnitsConverter.toPixels(Control.DP + 85), TOP - UnitsConverter.toPixels(Control.DP - 80), UnitsConverter.toPixels(Control.DP + 120), DP + 25);


    }

    //Event Buttons
	public void onEvent(Event event){

    	if (event.type == ControlEvent.PRESSED){

    	if (event.target == on) {

            onout.setVisible(false);
            on.setVisible(false);
            off.setVisible(true);

		}

		if (event.target == off) {
		
			onout.setVisible(true);
            on.setVisible(true);
            off.setVisible(false);
					
        }

        if (event.target == onout) {
		
			onout.setVisible(false);
            on.setVisible(false);
            off.setVisible(true);
					
        }
    
    
        }
    }
    
}
