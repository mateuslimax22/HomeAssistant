package com.totalcross.componets;

import totalcross.ui.Container;
import totalcross.ui.Label;
import totalcross.ui.event.ControlEvent;
import totalcross.ui.event.Event;
import totalcross.ui.gfx.Color;
import totalcross.ui.font.*;
import totalcross.util.UnitsConverter;
import totalcross.ui.Control;
import totalcross.ui.icon.Icon;
import totalcross.ui.icon.MaterialIcons;
import totalcross.ui.Button;


public class CardLight extends Container {

  private Label lbl;
  private Label kitchen;
  private Label garage;
  private Label livingroom;
  private Label porch;
  private String txt;
  private Button btnOutlinedOn;
  private Button btnOutlinedOff;
  private Button garageOn;
  private Button garageOff;
  private Button kitchenOn;
  private Button kitchenOff;
  private Button porchOn;
  private Button porchOff;
  private Button livingroomOn;
  private Button livingroomOff;
  private Icon lightkitchen;
  private Icon lightlivingroom;
  private Icon lightporch;
  private Icon lightgarage;


	public CardLight(String txt) {
		this.txt = txt;
		
	}

	public void initUI() {
		setBorderStyle(BORDER_ROUNDED);

		//Buttons
		btnOutlinedOn = new Button("On", Button.BORDER_SIMPLE);
		btnOutlinedOn.setBackForeColors(Color.BLACK, Color.WHITE);
		btnOutlinedOn.setFont(btnOutlinedOn.getFont().adjustedBy(-1));
	
		btnOutlinedOff = new Button("Off", Button.BORDER_SIMPLE);
		btnOutlinedOff.setBackForeColors(Color.RED, Color.WHITE);
		btnOutlinedOff.setFont(btnOutlinedOn.getFont().adjustedBy(-1));

		kitchenOn = new Button("On", Button.BORDER_SIMPLE);
		kitchenOn.setBackForeColors(Color.BLACK, Color.WHITE);
		kitchenOn.setFont(kitchenOn.getFont().adjustedBy(-1));

		livingroomOn = new Button("On", Button.BORDER_SIMPLE);
		livingroomOn.setBackForeColors(Color.BLACK, Color.WHITE);
		livingroomOn.setFont(livingroomOn.getFont().adjustedBy(-1));

		porchOn = new Button("On", Button.BORDER_SIMPLE);
		porchOn.setBackForeColors(Color.BLACK, Color.WHITE);
		porchOn.setFont(porchOn.getFont().adjustedBy(-1));

		livingroomOff = new Button("Off", Button.BORDER_SIMPLE);
		livingroomOff.setBackForeColors(Color.RED, Color.WHITE);
		livingroomOff.setFont(livingroomOff.getFont().adjustedBy(-1));

		porchOff = new Button("Off", Button.BORDER_SIMPLE);
		porchOff.setBackForeColors(Color.RED, Color.WHITE);
		porchOff.setFont(porchOff.getFont().adjustedBy(-1));

		garageOn = new Button("On", Button.BORDER_SIMPLE);
		garageOn.setBackForeColors(Color.BLACK, Color.WHITE);
		garageOn.setFont(garageOn.getFont().adjustedBy(-1));
	
		garageOff = new Button("Off", Button.BORDER_SIMPLE);
		garageOff.setBackForeColors(Color.RED, Color.WHITE);
		garageOff.setFont(garageOff.getFont().adjustedBy(-1));

		kitchenOff = new Button("Off", Button.BORDER_SIMPLE);
		kitchenOff.setBackForeColors(Color.RED, Color.WHITE);
		kitchenOff.setFont(kitchenOff.getFont().adjustedBy(-1));

		//Text
		lbl = new Label(txt);
		lbl.transparentBackground = true;
		lbl.setFont(Font.getFont(false,14));
		lbl.setForeColor(Color.BLACK);

		kitchen = new Label("Kitchen lights");
		kitchen.transparentBackground = true;
		kitchen.setFont(Font.getFont(false,13));
		kitchen.setForeColor(Color.BLACK);

		livingroom = new Label("Livingroom lights");
		livingroom.transparentBackground = true;
		livingroom.setFont(Font.getFont(false,13));
		livingroom.setForeColor(Color.BLACK);

		porch = new Label("Porch lights");
		porch.transparentBackground = true;
		porch.setFont(Font.getFont(false,13));
		porch.setForeColor(Color.BLACK);

		garage = new Label("Garage lights");
		garage.transparentBackground = true;
		garage.setFont(Font.getFont(false,13));
		garage.setForeColor(Color.BLACK);

		//Icons
		lightkitchen = new Icon(MaterialIcons._HIGHLIGHT);
		lightkitchen.setFont(lightkitchen.getFont().adjustedBy(-5));
	
		lightlivingroom = new Icon(MaterialIcons._HIGHLIGHT);
		lightlivingroom.setFont(lightlivingroom.getFont().adjustedBy(-5));
		
		lightporch = new Icon(MaterialIcons._FLASH_ON);
		lightporch.setFont(lightporch.getFont().adjustedBy(-5));
		
		lightgarage= new Icon(MaterialIcons._HIGHLIGHT);
		lightgarage.setFont(lightgarage.getFont().adjustedBy(-5));
		
		
		//Add Control in Container  

		add(lbl, LEFT + UnitsConverter.toPixels(Control.DP + 5), TOP- UnitsConverter.toPixels(Control.DP - 10) );
		add(btnOutlinedOn,RIGHT + UnitsConverter.toPixels(Control.DP - 15), TOP- UnitsConverter.toPixels(Control.DP - 10), UnitsConverter.toPixels(Control.DP + 25), DP + 25 );
		add(btnOutlinedOff,RIGHT + UnitsConverter.toPixels(Control.DP - 50), TOP- UnitsConverter.toPixels(Control.DP - 10), UnitsConverter.toPixels(Control.DP + 25), DP + 25 );

		add(lightkitchen, LEFT + UnitsConverter.toPixels(Control.DP + 10), TOP- UnitsConverter.toPixels(Control.DP - 55) );
		add(kitchen, LEFT + UnitsConverter.toPixels(Control.DP + 40), TOP- UnitsConverter.toPixels(Control.DP - 63) );
		add(kitchenOn,RIGHT + UnitsConverter.toPixels(Control.DP - 15), TOP- UnitsConverter.toPixels(Control.DP - 60), UnitsConverter.toPixels(Control.DP + 25), DP + 25 );
		add(kitchenOff,RIGHT + UnitsConverter.toPixels(Control.DP - 50), TOP- UnitsConverter.toPixels(Control.DP - 60), UnitsConverter.toPixels(Control.DP + 25), DP + 25 );

		add(lightlivingroom, LEFT + UnitsConverter.toPixels(Control.DP + 10), TOP- UnitsConverter.toPixels(Control.DP - 85) );
		add(livingroom, LEFT + UnitsConverter.toPixels(Control.DP + 40), TOP- UnitsConverter.toPixels(Control.DP - 93) );
		add(livingroomOn,RIGHT + UnitsConverter.toPixels(Control.DP - 15), TOP- UnitsConverter.toPixels(Control.DP - 90), UnitsConverter.toPixels(Control.DP + 25), DP + 25 );
		add(livingroomOff,RIGHT + UnitsConverter.toPixels(Control.DP - 50), TOP- UnitsConverter.toPixels(Control.DP - 90), UnitsConverter.toPixels(Control.DP + 25), DP + 25 );

		add(lightporch, LEFT + UnitsConverter.toPixels(Control.DP + 15), TOP- UnitsConverter.toPixels(Control.DP - 118) );
		add(porch, LEFT + UnitsConverter.toPixels(Control.DP + 40), TOP- UnitsConverter.toPixels(Control.DP - 123) );
		add(porchOn,RIGHT + UnitsConverter.toPixels(Control.DP - 15), TOP- UnitsConverter.toPixels(Control.DP - 120), UnitsConverter.toPixels(Control.DP + 25), DP + 25 );
		add(porchOff,RIGHT + UnitsConverter.toPixels(Control.DP - 50), TOP- UnitsConverter.toPixels(Control.DP - 120), UnitsConverter.toPixels(Control.DP + 25), DP + 25 );

		add(lightgarage, LEFT + UnitsConverter.toPixels(Control.DP + 10), TOP- UnitsConverter.toPixels(Control.DP - 145) );
		add(garage, LEFT + UnitsConverter.toPixels(Control.DP + 40), TOP- UnitsConverter.toPixels(Control.DP - 153) );
		add(garageOn,RIGHT + UnitsConverter.toPixels(Control.DP - 15), TOP- UnitsConverter.toPixels(Control.DP - 150), UnitsConverter.toPixels(Control.DP + 25), DP + 25 );
		add(garageOff,RIGHT + UnitsConverter.toPixels(Control.DP - 50), TOP- UnitsConverter.toPixels(Control.DP - 150), UnitsConverter.toPixels(Control.DP + 25), DP + 25 );
			
			
     
}

	//Event Buttons
	public void onEvent(Event event){

    	if (event.type == ControlEvent.PRESSED){

    	if (event.target == btnOutlinedOn) {

			onlights();			
		}

		if (event.target == btnOutlinedOff) {
		
			offlights();
					
		}

		if (event.target == kitchenOn) {
			
			
			kitchenOn.setBackForeColors(Color.GREEN, Color.WHITE);
			kitchenOff.setBackForeColors(Color.BLACK, Color.WHITE);
			kitchenOn.repaintNow();
			kitchenOff.repaintNow();
				
		}

		if (event.target == kitchenOff) {
		
			kitchenOff.setBackForeColors(Color.RED, Color.WHITE);
			kitchenOn.setBackForeColors(Color.BLACK, Color.WHITE);
			kitchenOn.repaintNow();
			kitchenOff.repaintNow();
			
			
		}

		if (event.target == livingroomOn) {
			
			
			livingroomOn.setBackForeColors(Color.GREEN, Color.WHITE);
			livingroomOff.setBackForeColors(Color.BLACK, Color.WHITE);
			livingroomOn.repaintNow();
			livingroomOff.repaintNow();
			
			
			
		}

		if (event.target == livingroomOff) {
		
			livingroomOff.setBackForeColors(Color.RED, Color.WHITE);
			livingroomOn.setBackForeColors(Color.BLACK, Color.WHITE);
			livingroomOn.repaintNow();
			livingroomOff.repaintNow();
			
			
		}

		
		if (event.target == porchOn) {
			
			
			porchOn.setBackForeColors(Color.GREEN, Color.WHITE);
			porchOff.setBackForeColors(Color.BLACK, Color.WHITE);
			porchOn.repaintNow();
			porchOff.repaintNow();
			
			
			
		}

		if (event.target == porchOff) {
		
			porchOff.setBackForeColors(Color.RED, Color.WHITE);
			porchOn.setBackForeColors(Color.BLACK, Color.WHITE);
			porchOn.repaintNow();
			porchOff.repaintNow();
			
			
		}

		if (event.target == garageOn) {
			
			
			garageOn.setBackForeColors(Color.GREEN, Color.WHITE);
			garageOff.setBackForeColors(Color.BLACK, Color.WHITE);
			garageOn.repaintNow();
			garageOff.repaintNow();
			
			
			
		}

		if (event.target == garageOff) {
		
			garageOff.setBackForeColors(Color.RED, Color.WHITE);
			garageOn.setBackForeColors(Color.BLACK, Color.WHITE);
			garageOn.repaintNow();
			garageOff.repaintNow();
			
			
		}

	   }

	}
		
	private void onlights(){

		btnOutlinedOn.setBackForeColors(Color.GREEN, Color.WHITE);
		btnOutlinedOff.setBackForeColors(Color.BLACK, Color.WHITE);
		btnOutlinedOn.repaintNow();
		btnOutlinedOff.repaintNow();

		kitchenOn.setBackForeColors(Color.GREEN, Color.WHITE);
		kitchenOff.setBackForeColors(Color.BLACK, Color.WHITE);
		kitchenOn.repaintNow();
		kitchenOff.repaintNow();

		livingroomOn.setBackForeColors(Color.GREEN, Color.WHITE);
		livingroomOff.setBackForeColors(Color.BLACK, Color.WHITE);
		livingroomOn.repaintNow();
		livingroomOff.repaintNow();

			
		porchOn.setBackForeColors(Color.GREEN, Color.WHITE);
		porchOff.setBackForeColors(Color.BLACK, Color.WHITE);
		porchOn.repaintNow();
		porchOff.repaintNow();

		garageOn.setBackForeColors(Color.GREEN, Color.WHITE);
		garageOff.setBackForeColors(Color.BLACK, Color.WHITE);
		garageOn.repaintNow();
		garageOff.repaintNow();
			
	}

	private void offlights(){

		btnOutlinedOff.setBackForeColors(Color.RED, Color.WHITE);
		btnOutlinedOn.setBackForeColors(Color.BLACK, Color.WHITE);
		btnOutlinedOn.repaintNow();
		btnOutlinedOff.repaintNow();

		kitchenOff.setBackForeColors(Color.RED, Color.WHITE);
		kitchenOn.setBackForeColors(Color.BLACK, Color.WHITE);
		kitchenOn.repaintNow();
		kitchenOff.repaintNow();

		livingroomOff.setBackForeColors(Color.RED, Color.WHITE);
		livingroomOn.setBackForeColors(Color.BLACK, Color.WHITE);
		livingroomOn.repaintNow();
		livingroomOff.repaintNow();

		porchOff.setBackForeColors(Color.RED, Color.WHITE);
		porchOn.setBackForeColors(Color.BLACK, Color.WHITE);
		porchOn.repaintNow();
		porchOff.repaintNow();

		garageOff.setBackForeColors(Color.RED, Color.WHITE);
		garageOn.setBackForeColors(Color.BLACK, Color.WHITE);
		garageOn.repaintNow();
		garageOff.repaintNow();
			
		

	}




}