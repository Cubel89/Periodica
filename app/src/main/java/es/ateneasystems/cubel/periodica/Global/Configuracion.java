package es.ateneasystems.cubel.periodica.Global;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by cubel on 18/05/16.
 */
public class Configuracion extends Application {

    //Variables
    private boolean aviso_cookies;
    private Boolean publicidad;
    private int nivel_elegido_usuario;

    //Preferencias
    SharedPreferences prefs;
    SharedPreferences.Editor editor;

    //Constructor
    public void onCreate() {
        super.onCreate();

        //Cargamos las preferencias
        prefs = getSharedPreferences(getApplicationContext().getPackageName(), Context.MODE_PRIVATE); //Para poder leer
        editor = prefs.edit(); //Para poder guardar

        //Cargamos el contenido de las preferencias
        this.aviso_cookies = prefs.getBoolean("aviso_cookies", false);
        this.nivel_elegido_usuario = prefs.getInt("nivel_elegido_usuario", 1);

        //Iniciamos la publicidad a no
        this.publicidad = false;
    }


}
