package file;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

import org.apache.commons.io.FileUtils;

import org.apache.struts2.ServletActionContext;

import java.nio.file.Files;

import java.nio.file.StandardCopyOption;

public class UploadAction extends ActionSupport {

	private File upload;

	private String uploadContentType;

	private String uploadFileName;

	private String path; 
	
	/*
	 *  �˴��п�  ��Щ���ݻ�һֱ���� ֪������ʱʹ��
	 *  
	 *  ����ʱjsp�ļ��е�path��ֵ���ϴ�ʱ��path
	 * 
	 * */

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	} // �ļ�����ʵ����

	public String execute() throws Exception {
		String new_path = ServletActionContext.getServletContext().getRealPath("/upload");
		// File dest = new File(new_path, this.getUploadFileName());  // ʹ��ʱ���봴���ļ��� ��Ȼ���׳��쳣
		// Files.copy(this.getUpload().toPath(), dest.toPath(),
		// StandardCopyOption.REPLACE_EXISTING);
		// this.path="upload/"+uploadFileName;

		if (this.getUpload() != null) {
			// ����Ŀ���ļ������� parent ·�����ַ����� child ·�����ַ�������һ���� File ʵ����
			File dest = new File(new_path, this.getUploadFileName());
			System.out.println(dest.toString());
			// �ж��ϴ�Ŀ¼�Ƿ����
//			if (!dest.getParentFile().exists())
//				dest.getParentFile().mkdirs();

			// ���ļ�upload ������ dest ��,FileUtils����Ҫcommons-io-x.x.x.jar��֧��
			// FileUtils.copyFile ���Զ������ļ���
			FileUtils.copyFile(this.getUpload(), dest);
			this.setPath("/upload/" + this.getUploadFileName());
			// ����request����ֵ
			return SUCCESS;

		}

		return INPUT;

	}

}
