package com.gracie.twitterclone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gracie.twitterclone.databinding.TweetListItemBinding

class TweetsRvAdapter (var tweetslist:List<TweetData>):RecyclerView.Adapter<TweetsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsViewHolder {
        var binding=TweetListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TweetsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return tweetslist.size
    }

    override fun onBindViewHolder(holder: TweetsViewHolder, position: Int) {
      var tweet=tweetslist.get(position)
        holder.binding.tvTweet.text=tweet.tweet
        holder.binding.tvHandle.text=tweet.handle
        holder.binding.tvDisplayName.text=tweet.displayName
        holder.binding.tvLikeCount.tag=tweet.likeCount
        holder.binding.tvReplyCount.tag=tweet.replyCount
        holder.binding.tvRtCount.tag=tweet.rtCount


    }
}

class TweetsViewHolder(var binding:TweetListItemBinding):RecyclerView.ViewHolder(binding.root)

