package com.example.dam.segundadam;

import android.text.InputFilter;
import android.text.Spanned;
import android.util.Log;

public class FiltroNumerico implements InputFilter {


    @Override
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        Log.v("tag","texto");
        Log.v("filtro","source " + source);
        Log.v("filtro","start " + start);
        Log.v("filtro","end " + end);
        Log.v("filtro","dest " + dest);
        Log.v("filtro","dstart " + dstart);
        Log.v("filtro","dend " + dend);

        //android inputfilter number range
        return null;
    }
}
