package miu.kidusmt;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author KidusMT
 * Date: 5/5/2021
 */
public class Calculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String addOp1 = req.getParameter("addOp1");
        String addOp2 = req.getParameter("addOp2");

        String multiOp1 = req.getParameter("multiOp1");
        String multiOp2 = req.getParameter("multiOp2");

        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Simple Calculator</title>");
        out.println("</head>");
        out.println("<body>");

        if (!addOp1.isEmpty() && !addOp2.isEmpty()) {
            int addResult = Integer.parseInt(addOp1) + Integer.parseInt(addOp2);
            System.out.println("===> add result: " + addResult);

            String addData = String.format("%s + %s = %s", addOp1, addOp2, addResult);

            out.println("<h3>" + addData + "</h3>");
        } else {
            out.println("<h3></h3>");
        }

        if (!multiOp1.isEmpty() && !multiOp2.isEmpty()) {
            int multiResult = Integer.parseInt(multiOp1) + Integer.parseInt(multiOp2);
            System.out.println("===> multi result: " + multiResult);

            String multiData = String.format("%s * %s = %s", multiOp1, multiOp2, multiResult);
            out.println("<h3>" + multiData + "</h3>");
        } else {
            out.println("<h3></h3>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}
