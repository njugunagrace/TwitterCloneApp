package com.gracie.twitterclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gracie.twitterclone.databinding.ActivityMainBinding
import com.gracie.twitterclone.databinding.TweetListItemBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayTweets()
    }

    fun displayTweets() {
        var tweet1 = TweetData("", "@_Chica", "Grace", "This is amazing for sure", 5, 3, 267)
        var tweet2 = TweetData("", "@_Chica", "Grace", "This is amazing for sure", 5, 3, 267)
        var tweet3 = TweetData("", "@_Chica", "Grace", "This is amazing for sure", 5, 3, 267)
        var tweet4 = TweetData("", "@_Chica", "Grace", "This is amazing for sure", 5, 3, 267)


        var tweetList = listOf<TweetData>(tweet1, tweet2, tweet3, tweet4)
        binding.rvTweets.layoutManager= LinearLayoutManager(this)
        var tweetsAdapter =TweetsRvAdapter(tweetList)
        binding.rvTweets.adapter=tweetsAdapter


    }

}