package com.gracie.twitterclone

data class TweetData(
    var avatar:String,
    var displayName:String,
    var handle:String,
    var tweet:String,
    var rt:String,
    var reply:String,
    var like:String,
    var replyCount:Int,
    var rtCount:Int,
    var likeCount:Int
)

