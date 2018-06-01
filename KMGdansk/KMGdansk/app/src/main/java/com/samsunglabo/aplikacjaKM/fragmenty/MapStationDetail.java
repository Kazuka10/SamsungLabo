package com.samsunglabo.aplikacjaKM.fragmenty;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.samsunglabo.aplikacjaKM.resources.HttpFundation;
import com.samsunglabo.aplikacjaKM.resources.ParseJSON;

import net.simplifiedcoding.bottomnavigationexample.R;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapStationDetail extends Fragment
{
    private ListView stopsList;
    private ArrayAdapter<String> adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        String stopsJSON = HttpFundation.getData("http://91.244.248.19/dataset/c24aa637-3619-4dc2-a171-a23eec8f2172/resource/cd4c08b5-460e-40db-b920-ab9fc93c1a92/download/stops.json");
        Map<String, Object> data = ParseJSON.jsonToArray(stopsJSON);

        DateTime todayDate = new DateTime();
        DateTimeFormatter fmt = DateTimeFormat.forPattern("YYYY-MM-dd");

        Map<String, Object> today = (Map<String, Object>) data.get(todayDate.toString(fmt));
        List<Map<String, Object>> stops = (ArrayList<Map<String, Object>>) today.get("stops");

        List<String> viewList = new ArrayList<String>();

        for (Map<String, Object> stop : stops)
            viewList.add((String) stop.get("stopDesc"));

        System.out.println(viewList);

        return inflater.inflate(R.layout.activity_station, null);
    }
}
