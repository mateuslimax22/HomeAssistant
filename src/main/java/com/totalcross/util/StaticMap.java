package com.totalcross.util;

import com.tc.utils.utilities.io.HttpConn;
import com.tc.utils.utilities.io.HttpMethod;
import totalcross.io.ByteArrayStream;
import totalcross.io.IOException;
import totalcross.io.Stream;
import totalcross.sys.Convert;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class StaticMap {

    private String appID;
    private String codeID;
    private String andress;
    private int width;
    private int height;
    private int zoom;
    private int format;
    private boolean showMapHeader;
    private String mapStyle;
    private double latitude = Integer.MAX_VALUE;
    private double logitude = Integer.MAX_VALUE;


    public static final int PNG_FORMAT = 0;
    public static final int JPEG_FORMAT = 1;
    public static final int GIF_FORMAT = 2;
    public static final int BMP_FORMAT = 3;
    public static final int PNG8_FORMAT = 4;
    public static final int SVG_FORMAT = 5;

    public static final String ALPS_STYLE = "alps";
    public static final String DREAMWORKS_STYLE = "dreamworks";
    public static final String FLAME_STYLE = "flame";
    public static final String FLEET_STYLE = "fleet";
    public static final String MINI_STYLE = "mini";
    private HttpConn conn;


    public StaticMap(){
        andress = "";
        latitude = logitude = Integer.MAX_VALUE;
        width = 300;
        height = 300;
        zoom = 14;
        format = PNG_FORMAT;
        showMapHeader = false;
        mapStyle = "alps";
    }

    public StaticMap(String appID, String codeID){
        this();
        this.appID = appID;
        this.codeID = codeID;
    }



    public Image getImage() {
        Image img = null;

        String req = "https://image.maps.api.here.com/mia/1.6/mapview";
        req += "?app_id=" + appID;
        req += "&app_code=" + codeID;
        if (andress.isEmpty()){
            req += (logitude != Integer.MAX_VALUE && latitude != Integer.MAX_VALUE) ? "&c=" + latitude + "," + logitude : "";
        }else{
            req += "&ci=" + Convert.removeAccentuation(andress).replace("  ", " ").replace(' ', '+');
        }
        req += "&h=" + height;
        req += "&w=" + width;
        req += "&z=" + zoom;
        req += "&f=" + format;
        req += "&i=" + showMapHeader;
        req += "&style=" + mapStyle;

        try {

            conn = new HttpConn(req);
            conn.setHttpMethod(HttpMethod.GET);
            Stream stream = conn.connect();

            if (conn.getResponseCode() == 200) {

                byte[] buff = new byte[1024];

                ByteArrayStream bas = new ByteArrayStream(8192);

                while (true) {
                    int n = stream.readBytes(buff, 0, buff.length);
                    if (n <= 0) {
                        break;
                    }
                    bas.writeBytes(buff, 0, n);
                }
                img = new Image(bas.getBuffer());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ImageException e) {
            e.printStackTrace();
        }
        return img;
    }


    public static class Builder {

        StaticMap staticMap = new StaticMap();

        public Builder(){}

        public Builder(String appID, String codeID) {
            staticMap.appID = appID;
            staticMap.codeID = codeID;
        }

        public StaticMap.Builder setAppID(String appID){
            staticMap.appID = appID;
            return this;
        }

        public StaticMap.Builder setCodeID(String codeID){
            staticMap.codeID = codeID;
            return this;
        }

        public StaticMap.Builder setAdress(String location){
            staticMap.andress = location;
            return this;
        }

        public StaticMap.Builder setHeight(int height){
            staticMap.height = height;
            return this;
        }

        public StaticMap.Builder setWidth(int width){
            staticMap.width = width;
            return this;
        }


        public StaticMap.Builder setZoom(int zoom){
            staticMap.zoom = zoom;
            return this;
        }

        public StaticMap.Builder setFormat(int format){
            staticMap.format = format;
            return this;
        }

        public StaticMap.Builder setShowMapHeader(boolean showMapHeader){
            staticMap.showMapHeader = showMapHeader;
            return this;
        }

        public StaticMap.Builder setMapStyle(String mapStyle){
            staticMap.mapStyle = mapStyle;
            return this;
        }
        public StaticMap.Builder setLocation(double latitude, double logitude){
            staticMap.latitude = latitude;
            staticMap.logitude = logitude;
            return this;
        }

        public StaticMap build(){
            return staticMap;
        }

    }

}