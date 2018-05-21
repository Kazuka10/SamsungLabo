package com.simplifiedcoding.bottomnavigationexample;

import com.samsunglabo.aplikacjaKM.resources.HttpFundation;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by marshall on 15.05.2018.
 */

public class HttpFundationTest
{
    @Test
    public void getData_isCorrect()
    {
        String response = HttpFundation.getData("http://91.244.248.19/dataset/c24aa637-3619-4dc2-a171-a23eec8f2172/resource/4128329f-5adb-4082-b326-6e1aea7caddf/download/routes.json");

        System.out.println(response);

        assertNotEquals(response, "");
    }
}
