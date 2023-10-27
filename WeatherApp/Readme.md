# **Project Name: WeatherApp**

**Project Description:**

The WeatherApp is a Java program that interacts with the OpenWeatherMap API to provide users with real-time weather data for a specified location. It is designed to showcase API integration, data retrieval, and exception handling in a user-friendly manner.

**Key Features:**

**Weather Data Retrieval:** The WeatherApp fetches current weather information for a specific geographical location, including details like temperature, humidity, and weather conditions.

**API Integration:** The program demonstrates how to construct a URL to access the OpenWeatherMap API securely and handle the response.

**User Interaction:** It engages users by prompting them to input the latitude and longitude of the location they want to check the weather for.

**Exception Handling:** The project includes error handling to provide a graceful user experience, including printing stack traces for debugging.

**How It Works:**

Users are asked to provide the latitude and longitude coordinates of the location for which they desire weather data.

The program constructs a URL to access the OpenWeatherMap API, utilizing the provided coordinates and an API key.

It establishes a secure connection to the API via HttpsURLConnection.

The API response is read line by line using a BufferedReader and accumulated in a StringBuilder.

Once the full response is gathered, the program prints the weather data to the console.

Exception handling ensures that errors, if they occur, are properly handled, and detailed information is printed in the event of an exception.

**Usage:**

Users can input the latitude and longitude of the location they want to know the weather for, and the program will retrieve and display current weather information for that location.

**Note: To use the WeatherApp, a valid OpenWeatherMap API key is required.**

**Project Benefits:**

- **API Integration Introduction:** Offers a practical introduction to making API requests and processing responses in Java.
- **User Interaction:** Engages users by allowing them to specify the location they're interested in.
- **Real-World Application:** Demonstrates how to access external data sources, a common task in software development.
