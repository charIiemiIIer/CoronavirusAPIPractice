package dev.bensalcie.retrofitest.services

import com.example.coronavirusapipractice.models.MyCountry
import retrofit2.Call
import retrofit2.http.GET

interface CountryService {
    @GET("countries")
    fun getAffectedCountryList () : Call<List<MyCountry>>
}