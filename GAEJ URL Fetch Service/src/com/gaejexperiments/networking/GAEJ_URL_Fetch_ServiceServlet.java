package com.gaejexperiments.networking;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class GAEJ_URL_Fetch_ServiceServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
