package arguello.paloma.peliculas

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class AdaptadorMovies:BaseAdapter {
    lateinit var context: Context
    var peliculas:ArrayList<Pelicula> = ArrayList()

    constructor(context: Context, pelis:ArrayList<Pelicula>){
        this.context=context
        this.peliculas = pelis
    }

    override fun getCount(): Int {
        return peliculas.size
    }

    override fun getItem(p0: Int): Any {
        return peliculas[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var inflator = LayoutInflater.from(context)
        var vista = inflator.inflate(R.layout.peliculas_view, null)

        var imagen: ImageView=vista.findViewById(R.id.img_view) as ImageView
        var titulo: TextView = vista.findViewById(R.id.tv_nombre) as TextView
        var pelicula:Pelicula=peliculas[p0]

        imagen.setImageResource(pelicula.img)
        titulo.setText(pelicula.nombre)

        return vista
    }
}
