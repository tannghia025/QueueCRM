
package com.crm.crmqueue.config;

import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

public class LineNotify {
	public static void Notify(String message) {

		;

		// if (datacenter > 0) {
		// }
		OkHttpClient client = new OkHttpClient();

		MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
		RequestBody body = RequestBody.create(mediaType, "message=" + message);
		Request request = new Request.Builder().url("https://notify-api.line.me/api/notify").post(body)
				.addHeader("authorization", "Bearer " + "s3iFDYeopXFxIMY2WSdcSaPS8Rfo4Utp7VKoiYFGkGI")
				.addHeader("content-type", "application/x-www-form-urlencoded").addHeader("cache-control", "no-cache")
				.addHeader("postman-token", "d7a8a9e5-e03b-9f6f-eb50-0f372fac21f7").build();
		Response response = null;
		try {
			client.setWriteTimeout(500, TimeUnit.MILLISECONDS);
			client.setReadTimeout(500, TimeUnit.MILLISECONDS);
			response = client.newCall(request).execute();

		} catch (Throwable e) {
		} finally {
			if (response != null) {
				try {
					response.body().close();
				} catch (final Throwable th) {
				}
			}
		}

	}
	public static void main(String[] args) {
		LineNotify notify = new LineNotify();
		for (int i = 0; i < 10; i++) {
			notify.Notify("tetstasdfkjaksklfjs;kjkl");;
		}
		
	}


}
