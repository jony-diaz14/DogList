package com.diaz.jonathan.doglist

import com.google.gson.annotations.SerializedName

class DogsResponse (
    @SerializedName("status")  var status:String,
    @SerializedName("message") var images:List<String>)