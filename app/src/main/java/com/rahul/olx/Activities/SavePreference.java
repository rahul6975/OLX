package com.rahul.olx.Activities;

import android.content.Context;
import android.content.SharedPreferences;

public class SavePreference {

    private static final String DATA = "database";

    public static SharedPreferences getSharedPreferences(Context context)
    {
        return context.getSharedPreferences(DATA,Context.MODE_PRIVATE);
    }

    public static void setIntToPre(Context context, String key, int value)
    {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putInt(key,value);
        editor.apply();
    }

    public static void setStringToPre(Context context, String key, String value)
    {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putString(key,value);
        editor.apply();
    }

    public static int getIntFromPre(Context context, String key)
    {
        return getSharedPreferences(context).getInt(key,0);
    }

    public static String getStringFromPre(Context context, String key)
    {
        return getSharedPreferences(context).getString(key,null);
    }
}
