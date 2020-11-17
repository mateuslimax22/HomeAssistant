package com.totalcross.componets;

import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.Control;
import totalcross.ui.Label;
import totalcross.ui.event.ControlEvent;
import totalcross.ui.event.Event;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;
import totalcross.ui.image.Image;
import totalcross.util.UnitsConverter;

public class CardDegrees extends Container{

    private Label degrees;
    private Label number;
    private Label status;
    private Label floor;
    private String txt;
    private Button att;
    private Button fire;
    private Button freeze;
    private Button off;
    private Image imgatt;
    private Image imgfire;
    private Image imgfreeze;
    private Image imgoff;

    public CardDegrees() {
        return;
    }

    public void initUI() {
        setBorderStyle(BORDER_ROUNDED);
        setTxt("Desligado  - Ausente");

        //Text
        degrees = new Label("°C");
        degrees.transparentBackground = true;
        degrees.setFont(Font.getFont("Lato Bold",false, 14));
        degrees.setForeColor(Color.BLACK);

        number = new Label("22");
        number.transparentBackground = true;
        number.setFont(Font.getFont("Lato Bold",false, 50));
        number.setForeColor(Color.BLACK);

        status = new Label(txt);
        status.transparentBackground = true;
        status.setFont(Font.getFont("Lato Bold",false, 12));
        status.setForeColor(Color.BLACK);

        floor = new Label("Andar de cima");
        floor.transparentBackground = true;
        floor.setFont(Font.getFont("Lato Bold",false, 12));
        floor.setForeColor(Color.BLACK);

        //Buttons Images
        try {
            imgatt = new Image("images/btnatt.png");
            att = new Button("", imgatt.scaledBy(0.8,0.8), CENTER ,10);
            att.setBackForeColors(Color.WHITE, Color.WHITE);     
        } catch (Exception exception) {
            exception.printStackTrace();
        } 

        try {
            imgfire = new Image("images/btnfire.png");
            fire = new Button("", imgfire.scaledBy(0.8,0.8), CENTER ,10);
            fire.setBackForeColors(Color.WHITE, Color.WHITE);     
        } catch (Exception exception) {
            exception.printStackTrace();
        } 

        try {
            imgfreeze = new Image("images/btnfreeze.png");
            freeze = new Button("", imgfreeze.scaledBy(0.8,0.8), CENTER ,10);
            freeze.setBackForeColors(Color.WHITE, Color.WHITE);     
        } catch (Exception exception) {
            exception.printStackTrace();
        } 

        try {
            imgoff = new Image("images/btnoff.png");
            off = new Button("", imgoff.scaledBy(0.8,0.8), CENTER ,10);
            off.setBackForeColors(Color.WHITE, Color.WHITE);     
        } catch (Exception exception) {
            exception.printStackTrace();
        } 

        //Add Control in Container
        add(status, CENTER + 10 , TOP + 30, UnitsConverter.toPixels(Control.DP + 140), DP + 60);
        add(number, CENTER + 10 , CENTER, UnitsConverter.toPixels(Control.DP + 100), DP + 60);
        add(degrees, CENTER + 80 , TOP + 110 , UnitsConverter.toPixels(Control.DP + 100), DP + 25);

        add(att, LEFT + 50 , TOP + 220 , UnitsConverter.toPixels(Control.DP + 50), DP + 50);
        add(fire, LEFT + 100 , TOP + 220 , UnitsConverter.toPixels(Control.DP + 50), DP + 50);
        add(freeze, LEFT + 150 , TOP + 220 , UnitsConverter.toPixels(Control.DP + 50), DP + 50);
        add(off, LEFT + 200 , TOP + 220 , UnitsConverter.toPixels(Control.DP + 50), DP + 50);
        


    }
    
    //Event Buttons
    public void onEvent(Event event){

     	if (event.type == ControlEvent.PRESSED){

     	if (event.target == att) {
            remove(status);
            setTxt("Automático - Ausente");
            status = new Label(txt);
            status.transparentBackground = true;
            status.setFont(Font.getFont("Lato Bold",false, 12));
            status.setForeColor(Color.BLACK);
            add(status, CENTER + 10 , TOP + 30, UnitsConverter.toPixels(Control.DP + 140), DP + 60);
                

	 	}

	 	if (event.target == fire) {
            remove(status);
            setTxt("Quente  - Ausente");
            status = new Label(txt);
            status.transparentBackground = true;
            status.setFont(Font.getFont("Lato Bold",false, 12));
            status.setForeColor(Color.BLACK);
            add(status, CENTER + 10 , TOP + 30, UnitsConverter.toPixels(Control.DP + 140), DP + 60);
					
         }

         if (event.target == freeze ) {
            remove(status);
            setTxt("Frio  - Ausente");
            status = new Label(txt);
            status.transparentBackground = true;
            status.setFont(Font.getFont("Lato Bold",false, 12));
            status.setForeColor(Color.BLACK);
            add(status, CENTER + 10 , TOP + 30, UnitsConverter.toPixels(Control.DP + 140), DP + 60);
            
					
         }

         if (event.target == off ) {
            remove(status);
            setTxt("Desligado  - Ausente");
            status = new Label(txt);
            status.transparentBackground = true;
            status.setFont(Font.getFont("Lato Bold",false, 12));
            status.setForeColor(Color.BLACK);
            add(status, CENTER + 10 , TOP + 30, UnitsConverter.toPixels(Control.DP + 140), DP + 60);

					
         }
    
    
    
         }
     }

     //Set text
     public String setTxt(String txt) {
        this.txt = txt;
        return this.txt;
    }

    
}
