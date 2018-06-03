package com.samsunglabo.aplikacjaKM.fragmenty;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.MapEventsOverlay;
import org.osmdroid.views.overlay.Marker;
import org.osmdroid.views.overlay.OverlayItem;
import org.osmdroid.views.overlay.infowindow.InfoWindow;
import org.osmdroid.views.overlay.infowindow.MarkerInfoWindow;

import net.simplifiedcoding.bottomnavigationexample.R;

import java.util.ArrayList;


public class MapStationDetail extends Fragment {
    MapView mapView = null;
    private double mLat =  54.3495;
    private double mLon =  18.6490;
    private StationMarkerInfoWindow stationMarkerInfoWindow;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_station, null);
        GeoPoint startPoint = new GeoPoint(mLat, mLon);
        mapView = (MapView) view.findViewById(R.id.mapView);
      //  stationMarkerInfoWindow = new StationMarkerInfoWindow(R.layout.dymek_mapa_przystanek, mapView);
        mapView.setClickable(true);
        mapView.setBuiltInZoomControls(true);
        mapView.setMultiTouchControls(true);
        mapView.setTileSource(TileSourceFactory.DEFAULT_TILE_SOURCE);
        mapView.getController().setZoom(17.0);
        mapView.getController().setCenter(startPoint);

        final ArrayList<OverlayItem> items = new ArrayList<>();
        items.add(new OverlayItem("Hannover", "SampleDescription", new GeoPoint(52.370816, 9.735936)));
        items.add(new OverlayItem("Berlin", "SampleDescription", new GeoPoint(52.518333, 13.408333)));
        items.add(new OverlayItem("Washington", "SampleDescription", new GeoPoint(38.895000, -77.036667)));
        items.add(new OverlayItem("San Francisco", "SampleDescription", new GeoPoint(37.779300, -122.419200)));
        items.add(new OverlayItem("Tolaga Bay", "SampleDescription", new GeoPoint(-38.371000, 178.298000)));

       // Marker startMarker = new Marker(mapView);
       // startMarker.setPosition(startPoint);
        //startMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
       // mapView.getOverlays().add(startMarker);
       // startMarker.setIcon(getResources().getDrawable(R.mipmap.ic_bustop));
       // MarkerInfoWindow mDefaultInfoWindow = new MarkerInfoWindow(R.layout.dymek_mapa_przystanek, mapView);



       // Marker marker = new Marker(mapView);
      //  marker.setInfoWindow(stationMarkerInfoWindow);
       // marker.setTitle("Start point2");

        Marker startMarker = new Marker(mapView);
        startMarker.setPosition(new GeoPoint(mLat,mLon));
        startMarker.setIcon(getResources().getDrawable(R.mipmap.ic_bustop));
        startMarker.setAnchor(Marker.ANCHOR_CENTER, 1.0f);
        InfoWindow infoWindow = new MyInfoWindow(R.layout.bonuspack_bubble, mapView);
        startMarker.setInfoWindow(infoWindow);
        mapView.getOverlays().add(startMarker);

        Marker startMarker2 = new Marker(mapView);
        startMarker2.setPosition(new GeoPoint(54.3502,18.6508));
        startMarker2.setIcon(getResources().getDrawable(R.mipmap.ic_bustop));
        startMarker2.setAnchor(Marker.ANCHOR_CENTER, 1.0f);
        InfoWindow infoWindow2 = new MyInfoWindow(R.layout.bonuspack_bubble, mapView);
        startMarker2.setInfoWindow(infoWindow2);
        mapView.getOverlays().add(startMarker2);


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

            txtTitle.setText("Nazwa Przystanku");
            txtDescription.setText("Linia - kierunek");
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

