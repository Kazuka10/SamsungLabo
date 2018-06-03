package com.samsunglabo.aplikacjaKM.fragmenty;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.samsunglabo.aplikacjaKM.resources.HttpFundation;
import com.samsunglabo.aplikacjaKM.resources.ParseJSON;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;
import org.osmdroid.views.overlay.OverlayItem;
import org.osmdroid.views.overlay.infowindow.InfoWindow;
import org.osmdroid.views.overlay.infowindow.MarkerInfoWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class MapStationDetail extends Fragment {
    MapView mapView = null;
    private double mLat =  54.3495;
    private double mLon =  18.6490;
    private StationMarkerInfoWindow stationMarkerInfoWindow;
    private ArrayList<OverlayItem> stops = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_station, null);
        GeoPoint startPoint = new GeoPoint(mLat, mLon);
        mapView = (MapView) view.findViewById(R.id.mapView);
        mapView.setClickable(true);
        mapView.setBuiltInZoomControls(true);
        mapView.setMultiTouchControls(true);
        mapView.setTileSource(TileSourceFactory.DEFAULT_TILE_SOURCE);
        mapView.getController().setZoom(17.0);
        mapView.getController().setCenter(startPoint);

        stops.add(new OverlayItem("Jasień Pólnicy", "155, 161, 574", new GeoPoint(54.3502,18.6508)));
        stops.add(new OverlayItem("Zakoniczyn", "295, N1", new GeoPoint(54.31981,18.57735)));
        stops.add(new OverlayItem("Jaworzniaków", "156, 262, N1", new GeoPoint(54.31798,18.56858)));
        stops.add(new OverlayItem("Lawendowe Wzgórze", "156, 174, 574, N4", new GeoPoint(54.33173,18.56353)));
        stops.add(new OverlayItem("Wilanowska", "156, 162, 164, 174, 175, 195, 227, 262, N2, N13", new GeoPoint(54.33662,18.59828)));
        stops.add(new OverlayItem("Politechnika SKM", "283", new GeoPoint(54.37393,18.62627)));
        stops.add(new OverlayItem("Kampinoska", "113, 175, N13", new GeoPoint(54.31611,18.60301)));
        stops.add(new OverlayItem("Olimpijska", "113, 213, N13", new GeoPoint(54.30558,18.58112)));
        stops.add(new OverlayItem("Jeleniogórska", "118", new GeoPoint(54.32858,18.58237)));
        stops.add(new OverlayItem("Ujeścisko", "118, 156, 164, 174, N4", new GeoPoint(54.33159,18.58486)));
        stops.add(new OverlayItem("Przemyska", "118, 156, 162, 164, 174, 175, N2, N4, N13", new GeoPoint(54.33283,18.59461)));
        stops.add(new OverlayItem("Kiełpino Górne (Węsierska)", "168, 268, N3", new GeoPoint(54.34195,18.49882)));
        stops.add(new OverlayItem("Otomin Pętla", "174, 574", new GeoPoint(54.3214,18.50485)));
        stops.add(new OverlayItem("Elfów", "155, 262, N1", new GeoPoint(54.31564,18.56977)));

        Drawable bus_icon = this.getResources().getDrawable(R.drawable.ic_bustop);

        for(int i = 0; i < stops.size(); i++) {
            OverlayItem stop = stops.get(i);
            Marker stopMarker = new Marker(mapView);
            stopMarker.setPosition((GeoPoint) stop.getPoint());
            stopMarker.setIcon(bus_icon);
            stopMarker.setAnchor(Marker.ANCHOR_CENTER, 1.0f);
            stopMarker.setTitle(stops.get(i).getTitle());
            InfoWindow infoWindow = new MyInfoWindow(R.layout.bonuspack_bubble, mapView);
            stopMarker.setInfoWindow(infoWindow);
            mapView.getOverlays().add(stopMarker);
        }

        return view;
    }

    private class MyInfoWindow extends InfoWindow{
        public MyInfoWindow(int layoutResId, MapView mapView) {
            super(layoutResId, mapView);
        }
        public void onClose() {
            InfoWindow.closeAllInfoWindowsOn(mapView);
        }

        public void onOpen(Object arg0) {
            LinearLayout layout = (LinearLayout) mView.findViewById(R.id.map_bubble_layout);

            TextView txtTitle = (TextView) mView.findViewById(R.id.bubble_title);
            TextView txtDescription = (TextView) mView.findViewById(R.id.bubble_description);
            TextView txtSubdescription = (TextView) mView.findViewById(R.id.bubble_subdescription);

            txtTitle.setText("Przystanek");
            txtDescription.setText("Linie");
            txtSubdescription.setText("przyjazd + opoznienie");

            layout.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Override Marker's onClick behaviour here

                            InfoWindow.closeAllInfoWindowsOn(mapView);
                }
            });
        }
    }


    public boolean singleTapConfirmedHelper(GeoPoint geoPoint) {
        InfoWindow.closeAllInfoWindowsOn(mapView);
        return true;
    }

    private class StationMarkerInfoWindow extends MarkerInfoWindow {

        public StationMarkerInfoWindow(int layoutResId, final MapView mapView) {
            super(layoutResId, mapView);
        }}}

