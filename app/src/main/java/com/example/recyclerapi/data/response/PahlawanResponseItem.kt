package com.example.recyclerapi.data.response

import com.google.gson.annotations.SerializedName

data class PahlawanResponseItem(

	@field:SerializedName("asal")
	val asal: String? = null,

	@field:SerializedName("usia")
	val usia: String? = null,

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("nama")
	val nama: String? = null,

	@field:SerializedName("history")
	val history: String? = null
)
