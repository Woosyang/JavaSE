package Chapter13;

/**
 * implement with Servlet, maps to Web.xml
 * @author Woo
 *
 */
public class OthersServlet implements Servlet { // only url no request parameters
	@Override
	public void Service() {}

	@Override
	public void Service(Request Req, Response Rep) {
		Rep.Println("Other Web Pages....");
	}	
}
