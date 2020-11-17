package com.totalcross.componets;

import totalcross.ui.Container;
import totalcross.ui.Control;
import totalcross.ui.ImageControl;
import totalcross.ui.dialog.MessageBox;
import totalcross.ui.image.Image;
import totalcross.util.UnitsConverter;

public class CardRoom extends Container{

    private ImageControl imgroom;

    public void CardRoom(){
        return;
    }

    public void initUI(){

        //Image
        setBorderStyle(BORDER_ROUNDED);
        try {
            imgroom = new ImageControl(new Image("images/room.png"));
            imgroom.scaleToFit = true;
			imgroom.centerImage = true;
        } catch (Throwable e) {
            MessageBox.showException(e, true);
        }

        //Add Control in Container
        add(imgroom,CENTER,CENTER, UnitsConverter.toPixels(Control.DP + 290), DP + 395);



    }
    
}
