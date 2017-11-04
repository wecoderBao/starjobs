/**
 * 
 */
package com.starjobs.common;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.codec.binary.Base64;

/**
 * <p>
 * Title:ImageUtil
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author:bao
 * @date:2017年4月26日下午7:37:22
 */
public class ImageUtil {
	public static final String PHOTO_JPG = "jpg";
	public static final String PHOTO_JPEG = "jpeg";
	public static final String PHOTO_PNG = "png";

	public static String photoFormat(String format) {
		if (PHOTO_JPG.equalsIgnoreCase(format)) {
			return PHOTO_JPG;
		} else if (PHOTO_JPEG.equalsIgnoreCase(format)) {
			return PHOTO_JPEG;
		} else if (PHOTO_PNG.equalsIgnoreCase(format)) {
			return PHOTO_PNG;
		}
		return "";
	}

	// 将字符数组转换成base64
	public static String getBASE64Byte(byte[] s) {
		if (s == null)
			return null;
		return Base64.encodeBase64String(s);
	}

	// 读取文件内容到字节数组中
	public static byte[] getContent(String filePath) throws IOException {
		File file = new File(filePath);
		long fileSize = file.length();
		if (fileSize > Integer.MAX_VALUE) {
			System.out.println("file too big...");
			return null;
		}
		FileInputStream fi = new FileInputStream(file);
		byte[] buffer = new byte[(int) fileSize];
		int offset = 0;
		int numRead = 0;
		while (offset < buffer.length && (numRead = fi.read(buffer, offset, buffer.length - offset)) >= 0) {
			offset += numRead;
		}
		// 确保所有数据均被读取
		if (offset != buffer.length) {
			fi.close();
			throw new IOException("Could not completely read file " + file.getName());
		}
		fi.close();
		return buffer;
	}

	// 读取一个图片转换成base64
	public static String readPhoto(String path) throws Exception {

		return getBASE64Byte(getContent(path));
	}

	// 将base64图片字符串，解码成图片
	public static String saveStr2Photo(String path, String photo, String format) {
		
		InputStream fin = null;
		FileOutputStream fout = null;
		String imgName = String.valueOf(System.currentTimeMillis());
		try {
			
			byte[] decode = Base64.decodeBase64(photo);
			String imagePath = path + File.separator + imgName + "." + format;
			fin = new ByteArrayInputStream(decode);
			fout = new FileOutputStream(imagePath);
			byte[] b = new byte[1024];
			int length = 0;
			while ((length = fin.read(b)) > 0) {

				fout.write(b, 0, length);
			}
			return imgName + "." + format;
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		} finally {
			// 关闭数据流
			if (fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args)throws Exception {
		String path = "d:" + File.separator + "test.png";
		String re = readPhoto(path);
		System.out.println(re);
		String str = "iVBORw0KGgoAAAANSUhEUgAAAA4AAAAQCAYAAAAmlE46AAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsQAAA7EAZUrDhsAAAANdEVYdEF1dGhvcgBhY2VyMDMjEBkpAAAAIHRFWHRDcmVhdGlvblRpbWUAMjAxNzowMzoyNSAxNjowMTozOHJMfckAAAAhdEVYdENyZWF0aW9uIFRpbWUAMjAxNzowMzoyNSAxNjowMTozOPrDHg8AAAJnSURBVDhPnVJLa1NBFP7uTXMfbZLSPBTain+jUHUjopBFsAZFuhGlbhTFakHsxk3/hAi66E9QcaEbq/4BF7orJUljGpPe9/ve45lRcSsOzJyZc+Z85zsPJQxDwn8s9bf8hyW+/t1qSeFDIRR5KuX2k8cY9PpsUpCnBRRSYegGwiBGEmfQDQ1QSlDjJISm6wISBwcH6PV6qNfrUFUVRVFIvW15WFioolzWYNsBfN+HcuniBRIOmjaDPM/RbDYxnVqoVCoyiqZpDDKDY8tBq3UCZ86dxc7OU8A6HtP3YY+mkxF1r3To29cvfB8TFRn5rkee4xJTpqIgisKMXC+mw+GY4HsWEaV0985tevniGTvE8p3EPm0+uE+fP+3R9MeEbNulQX9E7E+DwyPiVBR83PvA/Mtot9uSf8A7SRIYhoEsy2QKtVoFjUaD7Ymkr4yPBtTpdHDz1g2srq5ibW0Np5ZPY39/H0tLy+AAGA5HqDdaXHUNr968xvx8Bbh29TK12+dpd/c5BcGUosgi15lQHLn0cPMevX/3ln1zcl2XwjAmP0jo2PJI3djYgIgo6JRKJUlRSEXhPrJO0OXKyLtoj0ipWp2DurKygjTJZW5CKT6apilzEzIIAnkX7Zk1DXieh9FoDHWOFQKpWplHFCZc5ZBBAliWjcXFZbYBju1JgCQpoPMUpWmKGddx2UjgYUe324XjOEz11zD0+4dMq4pW8yTiNOOeO7i+vo6trUdQwsChP1REZOFYLuty5HTNlDmLyfHDQL5TBpydNaESKexUw2QykVFEnrJPXByViyRABaBwEvpazUQURfgJJYGDFOfo/FIAAAAASUVORK5CYII=";
//		System.out.println("ll:"+re.equals(str));
		saveStr2Photo("d:", str, "png");
	}
}
