import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class UnsortedArrayLength {

	public static void main(String[] args) throws Exception {

		String url = "https://api.coingecko.com/api/v3/exchange_rates"; // Replace with the actual URL

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		if (response.statusCode() == 200) {
			String jsonResponse = response.body();
			System.out.println(jsonResponse); // Print the JSON response

		} else {
			System.out.println("Request failed: " + response.statusCode());
		}

	}
}
