package com.example.qbuser.recyclerviewtutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import com.example.qbuser.recyclerviewtutorial.adaptor.CustomAdapter
import com.example.qbuser.recyclerviewtutorial.models.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv = rV
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val users = ArrayList<User>()
        users.add(User("name1", "title1"))
        users.add(User("name2", "title2"))
        users.add(User("name3", "title3"))
        users.add(User("name4", "title4"))
        users.add(User("name5", "title5"))
        users.add(User("name6", "title6"))


        var adapter = CustomAdapter(users)
        rv.adapter = adapter



    }
}
