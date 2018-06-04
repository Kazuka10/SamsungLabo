package com.samsunglabo.aplikacjaKM.fragmenty;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.samsunglabo.aplikacjaKM.resources.HttpFundation;
import com.samsunglabo.aplikacjaKM.resources.ParseJSON;

/**
 * Created by Belal on 1/23/2018.
 */

public class NotificationsFragment extends Fragment {
    private ListView list;
    private ArrayAdapter<String> adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_stations_list, null);

        list = (ListView) view.findViewById(R.id.stationsListView);

        /*String stopsJSON = HttpFundation.getData("http://91.244.248.19/dataset/c24aa637-3619-4dc2-a171-a23eec8f2172/resource/cd4c08b5-460e-40db-b920-ab9fc93c1a92/download/stops.json");
        Map<String, Object> data = ParseJSON.jsonToArray(stopsJSON);

        DateTime todayDate = new DateTime();
        DateTimeFormatter fmt = DateTimeFormat.forPattern("YYYY-MM-dd");

        Map<String, Object> today = (Map<String, Object>) data.get(todayDate.toString(fmt));
        ArrayList<Map<String, Object>> stops = (ArrayList<Map<String, Object>>) today.get("stops");*/

        String[] stops = {"Anyżowa",
                "Kameliowa",
                "Rdestowa - Chwaszczyńska",
                "Szafranowa",
                "Giełda Towarowa",
                "Paprykowa",
                "Dąbrowa Centrum",
                "Starochwaszczyńska",
                "Polifarb",
                "Polifarb",
                "Chwaszczyno",
                "Chwaszczyno",
                "Chwaszczyno - Gdyńska",
                "Centrum Nadawcze RTV",
                "Korty Tenisowe",
                "Przylesie",
                "Giełda Towarowa",
                "Dolny Sopot - Haffnera",
                "Rdestowa - Chwaszczyńska",
                "Centrum Nadawcze RTV",
                "Starochwaszczyńska",
                "Chwaszczyno - Gdyńska",
                "Wybickiego",
                "Kochanowskiego",
                "Przylesie",
                "Sanatorium 'Leśnik'",
                "Szafranowa",
                "Kraszewskiego",
                "Sikorskiego",
                "Węzeł Franciszki Cegielskiej",
                "Amona",
                "Rdestowa - Leśny Zakątek",
                "Węzeł Franciszki Cegielskiej",
                "Chwaszczyno - Wiejska",
                "Kacze Buki",
                "Kacze Buki",
                "Kacze Buki",
                "Węzeł Franciszki Cegielskiej",
                "Rdestowa - Chwaszczyńska",
                "Karwiny Tesco",
                "Witomino Sosnowa",
                "Dąbrowa Miętowa",
                "Okrężna I",
                "Okrężna II",
                "Rolnicza",
                "Witomino Centrum",
                "Uczniowska",
                "Witomino Sosnowa",
                "Poznańska",
                "Sopot PKP - Marynarzy",
                "Cmentarz Witomiński",
                "Węzeł Franciszki Cegielskiej",
                "Bitwy pod Płowcami",
                "Bitwy pod Płowcami",
                "Kraszewskiego",
                "Kraszewskiego",
                "Goyki"};

        ArrayList<String> viewList = new ArrayList<String>();
        viewList.addAll(Arrays.asList(stops));

        /*for (Map<String, Object> stop : stops)
            viewList.add((String) stop.get("stopDesc"));*/

        adapter = new ArrayAdapter<String>(this.getContext(), R.layout.row_station_list, viewList);

        list.setAdapter(adapter);

        return view;
    }
}
