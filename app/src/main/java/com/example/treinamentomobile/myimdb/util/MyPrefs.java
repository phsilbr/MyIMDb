package com.example.treinamentomobile.myimdb.util;

import org.androidannotations.annotations.sharedpreferences.SharedPref;

/**
 * Created by treinamentomobile on 11/18/15.
 */
@SharedPref(SharedPref.Scope.UNIQUE)
public interface MyPrefs {
    long lastUpdate();
}
