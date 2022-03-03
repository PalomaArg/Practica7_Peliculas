package arguello.paloma.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var peliculas: ArrayList<Pelicula> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)
        super.onCreate(savedInstanceState)
        llenar_peliculas()
        var adapter=AdaptadorMovies(this, peliculas)
        var listView:ListView=findViewById(R.id.listv)
        listView.adapter=adapter
    }

    fun llenar_peliculas(){
        val pelicula1 = Pelicula(1, getString(R.string.nombre1),getString(R.string.sino_BigHero) , 120, R.drawable.bighero6)
        peliculas.add(pelicula1)
        val pelicula2 = Pelicula(2, getString(R.string.nombre2),getString(R.string.sino_Story) , 125, R.drawable.toystory)
        peliculas.add(pelicula2)
        val pelicula3 = Pelicula(3, getString(R.string.nombre3),getString(R.string.sino_1917) , 140, R.drawable.mil)
        peliculas.add(pelicula3)
        val pelicula4 = Pelicula(4, getString(R.string.nombre4),getString(R.string.sino_Friends) , 98, R.drawable.friends)
        peliculas.add(pelicula4)
        val pelicula5 = Pelicula(5, getString(R.string.nombre5),getString(R.string.sino_Bones) , 130, R.drawable.bones)
        peliculas.add(pelicula5)
    }
}