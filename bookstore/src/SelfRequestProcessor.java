import org.apache.struts.*;
import org.apache.struts.action.RequestProcessor;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.UnsupportedEncodingException;

/**
 * Created by coder-z on 16-12-12.
 */
public class SelfRequestProcessor extends RequestProcessor {
    public SelfRequestProcessor() {
    }
    protected boolean processPreprocess(HttpServletRequest request, HttpServletResponse response) {
        super.processPreprocess(request,response);
        try {
            request.setCharacterEncoding("gb312");
        }catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return true;
    }

}
