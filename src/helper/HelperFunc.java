package helper;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

public class HelperFunc {
	public static void writeJsonObject (HttpServletResponse response, JSONObject obj) {
		try {
			response.setContentType("application/json");
			response.addHeader("Access-Cortrol-Allow-Origin", "*");
			PrintWriter out = response.getWriter();
			out.print(obj);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void writeJsonArray (HttpServletResponse response, JSONArray array) {
		try {
			response.setContentType("application/json");
			response.addHeader("Access-Control-Allow-Origin", "*");
			PrintWriter out = response.getWriter();
			out.print(array);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
