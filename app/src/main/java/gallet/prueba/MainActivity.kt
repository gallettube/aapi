package gallet.prueba

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import gallet.aapi.aapi

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(aapi().Marshmallow()){
            Toast.makeText(this, "Es Marshmallow", Toast.LENGTH_SHORT).show()
        }

        if(aapi().MarshmallowG()){
            Toast.makeText(this, "Es > Marshmallow", Toast.LENGTH_SHORT).show()
        }

        if(aapi().NougatG()){
            Toast.makeText(this, "Es > Nougat", Toast.LENGTH_SHORT).show()
        }

        if(aapi().IceCreamSandwich()){
            Toast.makeText(this, "Es IceCreamSandwich", Toast.LENGTH_SHORT).show()
        }

        if(aapi().IceCreamSandwichG()){
            Toast.makeText(this, "Es > IceCreamSandwich", Toast.LENGTH_SHORT).show()
        }
    }
}
