package com.simplifiedcoding.bottomnavigationexample;

import com.samsunglabo.aplikacjaKM.resources.HttpFundation;
import com.samsunglabo.aplikacjaKM.resources.ParseJSON;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception
    {
        String stopsJSON = HttpFundation.getData("http://91.244.248.19/dataset/c24aa637-3619-4dc2-a171-a23eec8f2172/resource/cd4c08b5-460e-40db-b920-ab9fc93c1a92/download/stops.json");
        Map<String, Object> data = ParseJSON.jsonToArray(stopsJSON);

        DateTime todayDate = new DateTime();
        DateTimeFormatter fmt = DateTimeFormat.forPattern("YYYY-MM-dd");

        Map<String, Object> today = (Map<String, Object>) data.get(todayDate.toString(fmt));
        List<Map<String, Object>> stops = (ArrayList<Map<String, Object>>) today.get("stops");

        ArrayList<String> viewList = new ArrayList<String>();

        for (Map<String, Object> stop : stops)
            System.out.println((String) stop.get("stopDesc"));
    }
}