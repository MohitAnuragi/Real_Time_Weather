package com.example.realtimeweather

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.realtimeweather.Api.Constant
import com.example.realtimeweather.Api.NetworkResponse
import com.example.realtimeweather.Api.RetrofitInstance
import com.example.realtimeweather.Api.WeatherModel
import kotlinx.coroutines.launch

class WeatherViewModel : ViewModel() {
    private val weatherApi = RetrofitInstance.weatherApi
    private val _wetherResult = MutableLiveData<NetworkResponse<WeatherModel>>()
    val weatherResult: LiveData<NetworkResponse<WeatherModel>> = _wetherResult


    fun getData(city: String) {
        _wetherResult.value = NetworkResponse.Loading
        viewModelScope.launch {
            val response = weatherApi.getWeather(Constant.apiKey, city)
            try {
                if (response.isSuccessful) {
                    response.body()?.let {
                        _wetherResult.value = NetworkResponse.Success(it)
                    }
                } else {
                    _wetherResult.value = NetworkResponse.Error("Please check Internet Connection")
                }

            }
            catch (e:Exception){
                _wetherResult.value = NetworkResponse.Error("Please check Internet Connection")

            }
        }
    }
}