package com.totalcross.componets;

import totalcross.ui.Container;
import totalcross.ui.Control;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.dialog.MessageBox;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;
import totalcross.ui.icon.Icon;
import totalcross.ui.icon.MaterialIcons;
import totalcross.ui.image.Image;
import totalcross.util.UnitsConverter;

public class CardTemp extends Container {

    private Label txt;
    private Label number;
    private Label degrees;
    private Icon icontempe;
    private ImageControl imgtemp;

    public void CardTemp(){
        return;
    }

    public void initUI() {
        
        setBorderStyle(BORDER_ROUNDED);
        //Text
        txt = new Label("Estudo da temperatura");
        txt.transparentBackground = true;
        txt.setFont(Font.getFont("Lato Bold",false, 12));
        txt.setForeColor(Color.BLACK);

        number = new Label("20.9");
        number.transparentBackground = true;
        number.setFont(Font.getFont("Lato Bold",false, 20));
        number.setForeColor(Color.BLACK);

        degrees = new Label("°C");
        degrees.transparentBackground = true;
        degrees.setFont(Font.getFont("Lato Bold",false, 14));
        degrees.setForeColor(Color.BLACK);

        //Icons
        icontempe = new Icon(MaterialIcons._WB_SUNNY);
        icontempe.setFont(icontempe.getFont().adjustedBy(-5));

        //Image
        try {
            imgtemp = new ImageControl(new Image("images/graph.png"));
            imgtemp.scaleToFit = true;
			imgtemp.centerImage = true;
        } catch (Throwable e) {
            MessageBox.showException(e, true);
        }
        
        //Add Control in Container
        add(txt, LEFT + UnitsConverter.toPixels(Control.DP + 10 ), TOP- UnitsConverter.toPixels(Control.DP - 10), UnitsConverter.toPixels(Control.DP + 155), DP + 40);
        add(number, LEFT + UnitsConverter.toPixels(Control.DP + 10 ), TOP- UnitsConverter.toPixels(Control.DP - 50), UnitsConverter.toPixels(Control.DP + 140), DP + 25);
        add(degrees, LEFT + UnitsConverter.toPixels(Control.DP + 60 ), TOP- UnitsConverter.toPixels(Control.DP - 50), UnitsConverter.toPixels(Control.DP + 140), DP + 25);
        add(imgtemp, LEFT + UnitsConverter.toPixels(Control.DP + 2 ), TOP- UnitsConverter.toPixels(Control.DP - 80), UnitsConverter.toPixels(Control.DP + 290), DP + 70);

        




    }
    
}
