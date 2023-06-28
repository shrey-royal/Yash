import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Part filePart = req.getPart("imageFile");
		String fileName = filePart.getSubmittedFileName();
		String fileExtension = fileName.substring(fileName.lastIndexOf("."));
		String uniqueFileName = System.currentTimeMillis() + fileExtension;
				
		//specify the directory
		String uploadDir = getServletContext().getRealPath("") + fileExtension;
		Path targetPath = Paths.get(uploadDir, uniqueFileName);
		
		InputStream fileContent = filePart.getInputStream();
		try {
			Files.copy(fileContent, targetPath, StandardCopyOption.REPLACE_EXISTING);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		PrintWriter out = res.getWriter();
		out.print("<b style='color:green;'>File Uploaded Successfully</b>");
	}
}
