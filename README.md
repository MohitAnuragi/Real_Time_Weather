
# 🌦️ Real-Time Weather App


## 📄 Description

A clean and responsive Android app built using **Jetpack Compose** and **Retrofit**, which displays real-time weather data fetched from public APIs like OpenWeatherMap. The app supports fetching weather by **city name** or **current GPS location**, and provides a minimal yet elegant user experience.

---

## 📚 Table of Contents

- [Features](#-features)
- [Usage](#-usage)
- [Tech Stack](#-tech-stack)
- [Challenges & Solutions](#-challenges--solutions)
- [Future Improvements](#-future-improvements)
- [Libraries Used](#-libraries-used)
- [Contact](#-contact)

---

## ✅ Features

- 🔍 Search weather by city name
- 📍 Fetch current location-based weather using GPS
- 🌡️ Displays temperature, weather condition, wind speed, and humidity
- 🎨 Jetpack Compose-based modern UI
- 🔄 Real-time updates via API
- 🌙 Dark and light mode support

---


## ⚙️ Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/MohitAnuragi/Real_Time_Weather.git
   cd RealTimeWeatherApp
   ```

2. Open the project in **Android Studio**

3. Add your API key to `Constants.kt`:
   ```kotlin
   const val BASE_URL = "https://api.openweathermap.org/data/2.5/"
   const val API_KEY = "YOUR_API_KEY"
   ```

4. Run the app on an emulator or device.

---

## 🛠 Tech Stack

- **Kotlin**
- **Jetpack Compose**
- **Retrofit** – for HTTP requests
- **Gson/Moshi** – for JSON parsing
- **ViewModel + LiveData** – MVVM architecture
- **Coil** – for loading weather icons
- **Material Design 3**

---

## ⚔️ Challenges & Solutions

| Challenge                              | Solution                                                                 |
|----------------------------------------|--------------------------------------------------------------------------|
| Handling location permissions          | Used Google’s FusedLocationProviderClient with proper permission checks |
| API rate limits                        | Added loading states and error handling                                 |
| Parsing dynamic JSON responses         | Used custom data classes with Moshi/Gson                                |

---

## 🌱 Future Improvements

- ⏳ Add 7-day and hourly forecast
- 📊 Weather data graphs (temperature, humidity trends)
- 📍 Favorite cities list with local storage
- 🖼️ Background animations based on weather condition

---

## 📦 Libraries Used

- [Retrofit](https://square.github.io/retrofit/)
- [Gson](https://github.com/google/gson)
- [Coil](https://coil-kt.github.io/coil/)
- [Jetpack Compose](https://developer.android.com/jetpack/compose)
- [Material Design](https://m3.material.io/)
- [Location Services](https://developer.android.com/training/location)

---

## 📬 Contact

- **Name**: Mohit Anuragi
- **Email**: anuragimohit468@gmail.com

---


