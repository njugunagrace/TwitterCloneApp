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
      val tweet=tweetslist.get(position)
        holder.binding.tvTweet.text=tweet.tweet
        holder.binding.tvHandle.text=tweet.handle
        holder.binding.tvDisplayName.text=tweet.displayName
//        holder.binding.ivRt.text=tweet.rt
//        holder.binding.tvReply.text=tweet.reply
//        holder.binding.tvLike.text=tweet.like
        holder.binding.tvLikeCount.text=tweet.likeCount.toString()
        holder.binding.tvReplyCount.text=tweet.replyCount.toString()
        holder.binding.tvRtCount.text=tweet.rtCount.toString()


    }
}

class TweetsViewHolder(var binding:TweetListItemBinding):RecyclerView.ViewHolder(binding.root)

