package com.samsunglabo.aplikacjaKM.resources;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by marshall on 15.05.2018.
 */

public class HttpFundation
{
    public static String getData(String address)
    {
        URL url = null;
        HttpURLConnection connection = null;

        try
        {
            url = new URL(address);
            connection = (HttpURLConnection) url.openConnection();

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(connection.getInputStream())
            );

            String inputLine = "";
            StringBuffer content = new StringBuffer();

            while ((inputLine = input.readLine()) != null)
                content.append(inputLine);

            input.close();

            return content.toString();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            return "Error connection!";
        }
        finally
        {
            if (connection != null)
                connection.disconnect();
        }
    }
}