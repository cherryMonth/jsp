package file;

import com.opensymphony.xwork2.ActionSupport;

import java.io.*;
import java.net.URLEncoder;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;


public class DownLoadFile extends ActionSupport {
	
	private String contentType, fileName, path;

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) throws UnsupportedEncodingException { // 请求参数的转码
//		this.fileName = new String(fileName.getBytes(), "gbk");
		this.fileName = URLEncoder.encode(fileName, "UTF-8");
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) throws UnsupportedEncodingException {
		this.path = new String(path.getBytes(), "gbk");
	}
	
	public InputStream getTarget() throws Exception {
		return ServletActionContext.getServletContext().getResourceAsStream(getPath());
	}
}
