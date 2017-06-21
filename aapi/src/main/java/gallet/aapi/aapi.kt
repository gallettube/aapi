package gallet.aapi

import android.os.Build

/**
 * Created by jon.galletero on 20/06/2017.
 */

class aapi{

    //Android 4.0
    fun IceCreamSandwich() : Boolean{
        if(Build.VERSION.SDK_INT == Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
            return true
        }else{
            return false
        }
    }
    fun IceCreamSandwichG() : Boolean{
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
            return true
        }else{
            return false
        }
    }

    //Android 4.1 - 4.3
    fun JellyBean() : Boolean{
        if(Build.VERSION.SDK_INT == Build.VERSION_CODES.JELLY_BEAN) {
            return true
        }else{
            return false
        }
    }
    fun JellyBeanG() : Boolean{
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            return true
        }else{
            return false
        }
    }

    //Android 4.4
    fun Kitkat() : Boolean{
        if(Build.VERSION.SDK_INT == Build.VERSION_CODES.KITKAT) {
            return true
        }else{
            return false
        }
    }
    fun KitkatG() : Boolean{
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            return true
        }else{
            return false
        }
    }

    //Android 5.0
    fun Lollipop() : Boolean{
        if(Build.VERSION.SDK_INT == Build.VERSION_CODES.LOLLIPOP) {
            return true
        }else{
            return false
        }
    }
    fun LollipopG() : Boolean{
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            return true
        }else{
            return false
        }
    }

    //Android 6.0
    fun Marshmallow() : Boolean{
        if(Build.VERSION.SDK_INT == Build.VERSION_CODES.M) {
            return true
        }else{
            return false
        }
    }
    fun MarshmallowG() : Boolean{
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            return true
        }else{
            return false
        }
    }

    //Android 7.0
    fun Nougat() : Boolean{
        if(Build.VERSION.SDK_INT == Build.VERSION_CODES.N) {
            return true
        }else{
            return false
        }
    }
    fun NougatG() : Boolean{
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return true
        }else{
            return false
        }
    }

    //Android 8.0
    fun Oreo() : Boolean{
        if(Build.VERSION.SDK_INT == Build.VERSION_CODES.O) {
            return true
        }else{
            return false
        }
    }

    fun OreoG() : Boolean{
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            return true
        }else{
            return false
        }
    }

}