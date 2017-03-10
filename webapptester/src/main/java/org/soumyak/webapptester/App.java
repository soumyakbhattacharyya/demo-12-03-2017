package org.soumyak.webapptester;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		pingHost();
	}

	public static void pingHost() throws IOException {
		HttpURLConnection connection = null;
		try {
			URL u = new URL("http://localhost:8888/");
			connection = (HttpURLConnection) u.openConnection();
			connection.setRequestMethod("HEAD");
			int code = connection.getResponseCode();
			System.out.println("" + code);
			// You can determine on HTTP return code received. 200 is success.
		} catch (MalformedURLException e) {
			throw e;
		} catch (IOException e) {

			throw e;
		} finally {
			if (connection != null) {
				connection.disconnect();
			}
		}
	}
}
