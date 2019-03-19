package com.rasoftec;

import android.app.Application;
import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.rasoftec.tpos2.data.factura_encabezado;

public class ApplicationTpos extends Application {
    public static  ArrayList<String> params = new ArrayList<>();
    public static factura_encabezado newFactura_encabezado = new factura_encabezado();
    public static  ArrayList<factura_encabezado> p = new ArrayList<factura_encabezado>();
    public static byte[] byteArray;
    public static String name;
  //  public static List<factura_encabezado> p = new List<factura_encabezado>() {

}
