package file;

import org.apache.commons.io.FileUtils;

import java.io.File;

import java.io.IOException;

public class IOUtils {

	public static void copyFiles(String parentDir, File[] uploads, String [] FilesName) throws IOException {
		for (int index = 0; index < uploads.length; index++) {
			File dest = new File(parentDir, FilesName[index]);
			FileUtils.copyFile(uploads[index], dest);
		}
	}

}
