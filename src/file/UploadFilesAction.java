package file;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import file.IOUtils;

public class UploadFilesAction extends ActionSupport {
	
	private File [] uploads;
	
	private String [] uploadsContentType;
	
	private String [] uploadsFileName;
	
	public File [] getUploads() {
		return this.uploads;
	}
	
	public void setUploads(File [] list) {
		this.uploads = list;
	}
	
	public String [] getUploadsContentType() {
		return this.uploadsContentType;
	}
	
	public void setUploadsContentType(String [] uploadsContentType) {
		this.uploadsContentType = uploadsContentType;
	}
	
	public String [] getUploadsFileName() {
		return this.uploadsFileName;
	}
	
	public void setUploadsFileName(String [] uploadsFileName) {
		this.uploadsFileName = uploadsFileName;
	}
	
	public String execute() throws Exception{
		String new_path = ServletActionContext.getServletContext().getRealPath("/upload");
		
		if (this.getUploads() != null) {
					
			 IOUtils.copyFiles(new_path, getUploads(), this.getUploadsFileName());
			
			System.out.println(new_path);
			return SUCCESS;
		}

		return INPUT;
	}

}
