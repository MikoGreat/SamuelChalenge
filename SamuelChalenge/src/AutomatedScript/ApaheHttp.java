package AutomatedScript;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.net.URI;
public class ApaheHttp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {

			HttpUriRequest httpget = RequestBuilder.get()
					.setUri(new URI("https://reqres.in/api/users"))
					.addParameter("page", "1")
					.build();

			CloseableHttpResponse response = httpclient.execute(httpget);
			try {
				System.out.println(EntityUtils.toString(response.getEntity()));
			} finally {
				response.close();
			}
		} finally {
			httpclient.close();
		}
	}

}
