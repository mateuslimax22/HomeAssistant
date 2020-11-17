package com.totalcross.componets;

import totalcross.sys.InvalidNumberException;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.Control;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.ScrollBar;
import totalcross.ui.Slider;
import totalcross.ui.SpinList;
import totalcross.ui.dialog.MessageBox;
import totalcross.ui.event.ControlEvent;
import totalcross.ui.event.Event;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;
import totalcross.ui.icon.Icon;
import totalcross.ui.icon.MaterialIcons;
import totalcross.ui.image.Image;
import totalcross.util.UnitsConverter;

public class CardEntertainment extends Container {

    private Slider slBar;
    private SpinList sl;
    private SpinList sl2;
    private SpinList sl3;
    private String txt;
    private Label lbl;
    private Label txtharmo;
    private Label txtvolume;
    private Label txtyoutube;
    private Label txtactive;
    private Label txtcomu;
    private Label txtentry;
    private Label txttvoff;
    private Label txttv;
    private Label statustvoff;
    private Button statustv;
    private ImageControl harmony;
    private Icon iconativ;
    private Icon iconcomu;
    private Icon iconentry;
    private Icon iconvolume;
    private Icon icontvoff;
    private Icon icontv;
    
  

    public CardEntertainment(String txt) {
        this.txt = txt;
    }

    public void initUI()  {
        setBorderStyle(BORDER_ROUNDED);

        //Containers
        Container cont = new Container();
        cont.transparentBackground = true;

        Container comu = new Container();
        comu.transparentBackground = true;

        Container entry = new Container();
        entry.transparentBackground = true;

        Container volume = new Container();
        volume.transparentBackground = true;

        Container tv = new Container();
        tv.transparentBackground = true;

        Container tvoff = new Container();
        tvoff.transparentBackground = true;
        
        //Text
        lbl = new Label(txt);
        lbl.transparentBackground = true;
        lbl.setFont(Font.getFont("Lato Bold",false, 14));
        lbl.setForeColor(Color.BLACK);

        txtharmo = new Label("Harmony");
        txtharmo.transparentBackground = true;
        txtharmo.setFont(Font.getFont("Lato Bold",false, 12));
        txtharmo.setForeColor(Color.BLACK);

        txtyoutube = new Label("You Tube");
        txtyoutube.transparentBackground = true;
        txtyoutube.setFont(Font.getFont("Lato Bold",false, 12));
        txtyoutube.setForeColor(Color.BLACK);

        txtactive = new Label("Atividade");
        txtactive.transparentBackground = true;
        txtactive.setFont(Font.getFont("Lato Bold",false, 9));
        txtactive.setForeColor(Color.BLACK);

        txtcomu = new Label("Comutador HDMI");
        txtcomu.transparentBackground = true;
        txtcomu.setFont(Font.getFont("Lato Bold",false, 9));
        txtcomu.setForeColor(Color.BLACK);

        txtentry = new Label("Entrada HDMI");
        txtentry.transparentBackground = true;
        txtentry.setFont(Font.getFont("Lato Bold",false, 9));
        txtentry.setForeColor(Color.BLACK);

        txtvolume = new Label("Volume");
        txtvolume.transparentBackground = true;
        txtvolume.setFont(Font.getFont("Lato Bold",false, 12));
        txtvolume.setForeColor(Color.BLACK);

        txttvoff = new Label("Tempo total tv");
        txttvoff.transparentBackground = true;
        txttvoff.setFont(Font.getFont("Lato Bold",false, 12));
        txttvoff.setForeColor(Color.BLACK);

        statustvoff = new Label("0,42 h");
        statustvoff.transparentBackground = true;
        statustvoff.setFont(Font.getFont("Lato Bold",false, 12));
        statustvoff.setForeColor(Color.BLACK);

        txttv = new Label("Desligar tv");
        txttv.transparentBackground = true;
        txttv.setFont(Font.getFont("Lato Bold",false, 12));
        txttv.setForeColor(Color.BLACK);

        statustv = new Button("Executar", Button.BORDER_OUTLINED);
		statustv.setBackForeColors(Color.BLACK, Color.WHITE);
		statustv.setFont(statustv.getFont().adjustedBy(-1));

        //Image
        try {
            harmony = new ImageControl(new Image("images/logoharmony.png"));
            harmony.scaleToFit = true;
			harmony.centerImage = true;
        } catch (Throwable e) {
            MessageBox.showException(e, true);
        }

        iconentry = new Icon(MaterialIcons._SETTINGS_REMOTE);
        iconentry.setFont(iconentry.getFont().adjustedBy(-10));

        iconativ = new Icon(MaterialIcons._SETTINGS_REMOTE);
        iconativ.setFont(iconativ.getFont().adjustedBy(-10));

        iconcomu = new Icon(MaterialIcons._SETTINGS_REMOTE);
        iconcomu.setFont(iconcomu.getFont().adjustedBy(-10));

        iconvolume = new Icon(MaterialIcons._VOLUME_UP);
        iconvolume.setFont(iconvolume.getFont().adjustedBy(-10));

        icontvoff = new Icon(MaterialIcons._TV);
        icontvoff.setFont(icontvoff.getFont().adjustedBy(-10));

        icontv = new Icon(MaterialIcons._STOP_SCREEN_SHARE);
        icontv.setFont(icontv.getFont().adjustedBy(-10));

        //List
        try {  
            sl = new SpinList(new String[]{"PowerOff", "Watch Fire TV","YouTube", "SATV","Watch Apple TV"});
            sl.setFont(Font.getFont("Lato Bold",false, 13));
            

         }catch (InvalidNumberException e) {
             e.printStackTrace();
         }

        try {
            sl2 = new SpinList(new String[]{"AppleTV", "FireTV","Shield"});
            sl2.setFont(Font.getFont("Lato Bold",false, 13));

        }catch (InvalidNumberException e) {
            e.printStackTrace();
        }
        
        try {
            sl3 = new SpinList(new String[]{"InputHDMI1", "InputHDMI2","InputHDMI3","InputHDMI4"});
            sl3.setFont(Font.getFont("Lato Bold",false, 13));

        }catch (InvalidNumberException e) {
            e.printStackTrace();
        }
        
        //ScrollBar
        slBar = new Slider(ScrollBar.HORIZONTAL);
        slBar.appId = 1;
        slBar.barHeight = 1;
        slBar.setLiveScrolling(true);
        slBar.setForeColor(Color.BLACK);
        slBar.sliderColor = Color.BLACK;
        slBar.setValue(50);

        ////Add Control in Container
        add(lbl, LEFT + UnitsConverter.toPixels(Control.DP + 5), TOP- UnitsConverter.toPixels(Control.DP - 10) );
        add(harmony, LEFT + UnitsConverter.toPixels(Control.DP +5 ), TOP- UnitsConverter.toPixels(Control.DP - 50), UnitsConverter.toPixels(Control.DP + 40), DP + 40);
        add(txtharmo, LEFT + UnitsConverter.toPixels(Control.DP +55 ), TOP- UnitsConverter.toPixels(Control.DP - 58), UnitsConverter.toPixels(Control.DP + 100), DP + 25);
        add(txtyoutube, RIGHT + UnitsConverter.toPixels(Control.DP + 30 ), TOP- UnitsConverter.toPixels(Control.DP - 58), UnitsConverter.toPixels(Control.DP + 100), DP + 25);

        add(cont, LEFT + UnitsConverter.toPixels(Control.DP +50), TOP- UnitsConverter.toPixels(Control.DP - 100),UnitsConverter.toPixels(Control.DP + 160), DP + 50);
        add(comu, LEFT + UnitsConverter.toPixels(Control.DP +50), TOP- UnitsConverter.toPixels(Control.DP - 150),UnitsConverter.toPixels(Control.DP + 160), DP + 50);
        add(entry, LEFT + UnitsConverter.toPixels(Control.DP +50), TOP- UnitsConverter.toPixels(Control.DP - 200),UnitsConverter.toPixels(Control.DP + 160), DP + 50);
        add(volume, LEFT + UnitsConverter.toPixels(Control.DP +50), TOP- UnitsConverter.toPixels(Control.DP - 250),UnitsConverter.toPixels(Control.DP + 160), DP + 50);
        add(tvoff, LEFT + UnitsConverter.toPixels(Control.DP +50), TOP- UnitsConverter.toPixels(Control.DP - 300),UnitsConverter.toPixels(Control.DP + 220), DP + 50);
        add(tv, LEFT + UnitsConverter.toPixels(Control.DP +50), TOP- UnitsConverter.toPixels(Control.DP - 350),UnitsConverter.toPixels(Control.DP + 220), DP + 50);


        cont.add(iconativ, LEFT , TOP + 10);
        cont.add(txtactive, LEFT +25 , TOP - 8, UnitsConverter.toPixels(Control.DP + 160), DP + 25);
        cont.add(sl, LEFT +25 , TOP +10 , UnitsConverter.toPixels(Control.DP + 160), DP + 25);

        comu.add(iconcomu, LEFT , TOP + 10);
        comu.add(txtcomu, LEFT +25 , TOP - 8, UnitsConverter.toPixels(Control.DP + 160), DP + 25);
        comu.add(sl2, LEFT +25 , TOP +10 , UnitsConverter.toPixels(Control.DP + 160), DP + 25);

        entry.add(iconentry, LEFT , TOP + 10);
        entry.add(txtentry, LEFT +25 , TOP - 8, UnitsConverter.toPixels(Control.DP + 160), DP + 25);
        entry.add(sl3, LEFT +25 , TOP +10 , UnitsConverter.toPixels(Control.DP + 160), DP + 25);

        volume.add(iconvolume, LEFT , TOP + 10);
        volume.add(txtvolume, LEFT +25 , TOP - 8, UnitsConverter.toPixels(Control.DP + 160), DP + 25);
        volume.add(slBar,LEFT +25 , TOP +10 , UnitsConverter.toPixels(Control.DP + 100), DP + 25);

        tvoff.add(icontvoff, LEFT , TOP + 10);
        tvoff.add(txttvoff,  LEFT +35 , TOP + 10, UnitsConverter.toPixels(Control.DP + 160), DP + 25);
        tvoff.add(statustvoff, LEFT + 180 , TOP +10 , UnitsConverter.toPixels(Control.DP + 160), DP + 25);

        tv.add(icontv, LEFT , TOP + 10);
        tv.add(txttv,  LEFT +35 , TOP + 10, UnitsConverter.toPixels(Control.DP + 160), DP + 25);
        tv.add(statustv, LEFT + 160 , TOP +10 , UnitsConverter.toPixels(Control.DP + 60), DP + 25);

    }

        
    public void onEvent(Event e1) {
        if (e1.type == ControlEvent.PRESSED && e1.target instanceof Slider) {
          Slider s = (Slider) e1.target;
        }
      }

    
}
