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

        if (source.toString().equals(""))
        return null; //aceptar
        String trozo1, trozo2;
        trozo1 = dest.toString().substring(0,dstart);
        trozo2 = dest.toString().substring(dstart);
        Log.v("filtro",trozo1+" "+source.toString()+" "+trozo2);
        String todo = trozo1 + source.toString() + trozo2;
        try {
            int valor = Integer.parseInt(todo);
            if (valor >= 0 && valor <= 500)
                return null; //aceptar
        }catch (NumberFormatException e){
        }
        return ""; //rechazar
    }

    public static String insertar(String origen, String trozo, int posicion){
        String trozo1 = origen.substring(0,posicion);
        String trozo2 = origen.substring(posicion);
        return trozo1 + trozo + trozo2;
    }
}
