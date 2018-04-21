package com.example.furusatoup.whatsyourname

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        button.setOnClickListener(this)
        button.setOnClickListener { imageView.setImageResource(R.drawable.hello_resize)
            textView.text = editText.text.toString() + "さん、こんにちわ" }

    }
//        ボタンが押された時にやるメソッド←コールバックメソッド
//        今回くらい処理が少ないなら19行目のようにスッキリさせた方が良い
//    override fun onClick(v: View?) {
//        imageView.setImageResource(R.drawable.hello_resize)
//        textView.text = editText.text.toString() + "さん、こんにちわ"
//    }

}
