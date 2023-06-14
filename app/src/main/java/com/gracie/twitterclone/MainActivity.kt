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
        val tweet1 = TweetData("", "@_Chica", "Grace", "This is amazing for sure", " ", "", "",90,23,78)
        val tweet2 = TweetData("", "@_vicky", "Victor", "I Love coding", " ", " ", " ",90,56,100)
        val tweet3 = TweetData("", "@_hes_bon", "Hesbon", "I do love kotlin", " ", " ", " ",90,67,45)
        val tweet4 = TweetData("", "@_jojo", "Joel", "This is a great career trajectory", "", "", "",90,34,67)


        val tweetList = listOf<TweetData>(tweet1, tweet2, tweet3, tweet4)
        binding.rvTweets.layoutManager= LinearLayoutManager(this)
        val tweetsAdapter =TweetsRvAdapter(tweetList)
        binding.rvTweets.adapter=tweetsAdapter


    }

}