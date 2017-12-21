package de.bb42.anspannungssmeter

import android.graphics.Color
import android.view.Window
import android.widget.LinearLayout
import android.widget.SeekBar
import android.widget.TextView


class tensionBarChangeListener(val tensionNumber: TextView, val layout:LinearLayout, val window: Window) : SeekBar.OnSeekBarChangeListener{
    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        android.util.Log.println(android.util.Log.DEBUG, "Seekbar", progress.toString())
        tensionNumber.setText(progress.toString())
        seekBar?.setBackgroundColor(Color.rgb(buildColorRed(progress),buildColorGreen(progress),buildColorBlue(progress)))
        layout.setBackgroundColor(Color.rgb(buildColorRed(progress),buildColorGreen(progress),buildColorBlue(progress)))
        tensionNumber.setBackgroundColor(Color.rgb(buildColorRed(progress),buildColorGreen(progress),buildColorBlue(progress)))
        window.statusBarColor = Color.rgb(buildColorRed(progress),buildColorGreen(progress),buildColorBlue(progress))
    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {
        android.util.Log.println(android.util.Log.DEBUG, "Seekbar","STARTED TRACKING")
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {

    }
    fun buildColorRed(color: Int):Int{
        if (color < 30) {
            return 0
        }
        if(color < 70){
            return 255
        }
        return 255
    }
    fun buildColorGreen(color: Int):Int{
        if(color > 70){
            return 0;
        }
        if (color > 30){
            return 165
        }
        return 173
    }
    fun buildColorBlue(color:Int): Int{

        return 47
    }
}