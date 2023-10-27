import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class WeatherApp {
    public static void main(String[] args) {
        try{
            // Define the latitude, longitude, and API key for the weather data.
            String latitude = "28.6";
            String longitude = "77.2";
            String apiKey = "22528fbe45d16697058cc2ebb549167d";

            // Construct the API URL using the provided latitude, longitude, and API key.
            String api="https://api.openweathermap.org/data/3.0/onecall?lat="+latitude+"&lon="+longitude+"&appid="+apiKey;

            // Create a URL object for the API.
            URL url = new URL(api);

            // Open a secure connection to the API.
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Initialize a BufferedReader to read the API response.
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String input;

            // Create a StringBuilder to store the response data.
            StringBuilder response = new StringBuilder();

            // Read and append each line of the response to the StringBuilder.
            while((input=in.readLine())!=null){
                response.append(input);
            }

            // Close the BufferedReader.
            in.close();

            // Print the API response to the console.
            System.out.println(response.toString());

            // Handle any exceptions by printing the stack trace.
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
