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
	 *  此处有坑  这些数据会一直保存 知道下载时使用
	 *  
	 *  下载时jsp文件中的path的值是上传时的path
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
	} // 文件的真实姓名

	public String execute() throws Exception {
		String new_path = ServletActionContext.getServletContext().getRealPath("/upload");
		// File dest = new File(new_path, this.getUploadFileName());  // 使用时必须创建文件夹 不然会抛出异常
		// Files.copy(this.getUpload().toPath(), dest.toPath(),
		// StandardCopyOption.REPLACE_EXISTING);
		// this.path="upload/"+uploadFileName;

		if (this.getUpload() != null) {
			// 设置目标文件（根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例）
			File dest = new File(new_path, this.getUploadFileName());
			System.out.println(dest.toString());
			// 判断上传目录是否存在
//			if (!dest.getParentFile().exists())
//				dest.getParentFile().mkdirs();

			// 把文件upload 拷贝到 dest 里,FileUtils类需要commons-io-x.x.x.jar包支持
			// FileUtils.copyFile 会自动创建文件夹
			FileUtils.copyFile(this.getUpload(), dest);
			this.setPath("/upload/" + this.getUploadFileName());
			// 设置request对象值
			return SUCCESS;

		}

		return INPUT;

	}

}
