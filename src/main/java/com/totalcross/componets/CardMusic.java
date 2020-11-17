package com.totalcross.componets;

import totalcross.ui.Container;
import totalcross.ui.Control;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.dialog.MessageBox;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;
import totalcross.ui.image.Image;
import totalcross.util.UnitsConverter;

public class CardMusic extends Container {

    private Label txtfamily;
    private Label txtmusic;
    private Label txtartist;
    private ImageControl imgmusic;



    public void initUI() {

        setBorderStyle(BORDER_ROUNDED);
        //Image
        try {
            imgmusic = new ImageControl(new Image("images/music.png"));
            imgmusic.scaleToFit = true;
			imgmusic.centerImage = true;
        } catch (Throwable e) {
            MessageBox.showException(e, true);
        }
        //Add Control in Container
        add(imgmusic,CENTER,CENTER, UnitsConverter.toPixels(Control.DP + 290), DP + 140);

        //Text
        txtfamily = new Label("Quarto da Familia");
        txtfamily.transparentBackground = true;
        txtfamily.setFont(Font.getFont("Lato Bold",false, 12));
        txtfamily.setForeColor(Color.BLACK);

        txtmusic = new Label("I Wasn't Born To Follow");
        txtmusic.transparentBackground = true;
        txtmusic.setFont(Font.getFont("Lato Bold",false, 13));
        txtmusic.setForeColor(Color.BLACK);

        txtartist = new Label("The Byrds");
        txtartist.transparentBackground = true;
        txtartist.setFont(Font.getFont("Lato Bold",false, 12));
        txtartist.setForeColor(Color.BLACK);

        //Add Control in Container  
        add(txtfamily, LEFT + UnitsConverter.toPixels(Control.DP + 30 ), TOP- UnitsConverter.toPixels(Control.DP - 2), UnitsConverter.toPixels(Control.DP + 150), DP + 40);
        add(txtmusic, LEFT + UnitsConverter.toPixels(Control.DP + 5 ), TOP- UnitsConverter.toPixels(Control.DP - 50), UnitsConverter.toPixels(Control.DP + 140), DP + 25);
        add(txtartist, LEFT + UnitsConverter.toPixels(Control.DP + 5 ), TOP- UnitsConverter.toPixels(Control.DP - 70), UnitsConverter.toPixels(Control.DP + 140), DP + 25);


    }


    
}
