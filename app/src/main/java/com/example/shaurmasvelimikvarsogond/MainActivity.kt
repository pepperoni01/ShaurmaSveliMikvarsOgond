package com.example.shaurmasvelimikvarsogond

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler)

        var linksList = ArrayList<photos>()
        linksList.add(photos("https://whythebeatlesarestillrelevant.files.wordpress.com/2018/11/pink-panther-1024x768.jpg"))
        linksList.add(photos("https://ih1.redbubble.net/image.1029336986.9195/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.jpg"))
        linksList.add(photos("https://alchetron.com/cdn/life-with-louie-c37c4a2c-8102-4d8a-bbfb-29404481834-resize-750.jpeg"))
        linksList.add(photos("https://i.redd.it/okybpdbwila61.png"))
        linksList.add(photos("https://e3.365dm.com/20/08/1600x900/skynews-scooby-doo-cartoon_5079605.jpg?bypass-service-worker&20200828133202"))
        linksList.add(photos("https://boutiqued0wnload.weebly.com/uploads/1/2/4/8/124877706/357627580.jpg"))
        linksList.add(photos("https://static.wikia.nocookie.net/kids-from-room-402/images/b/b7/Images.jpg/revision/latest?cb=20140518193320"))
        linksList.add(photos("https://mykadri.com/uploads/posts/2014-01/1389608528_21552-gadget-gadgetinis-5_640.jpg"))

        val adapter = photosAdapter(linksList, this)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter


    }
}