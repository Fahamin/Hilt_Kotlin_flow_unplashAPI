package com.fahamin.hiltcorutingmvvmretrofit.Model.userModel

import com.google.gson.annotations.SerializedName


data class Company (

  @SerializedName("name"        ) var name        : String? = null,
  @SerializedName("catchPhrase" ) var catchPhrase : String? = null,
  @SerializedName("bs"          ) var bs          : String? = null

)