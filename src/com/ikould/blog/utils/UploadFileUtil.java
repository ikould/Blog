package com.ikould.blog.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.ProgressListener;
import org.apache.commons.fileupload.FileUploadBase.FileSizeLimitExceededException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadFileUtil {

	// ���������ϴ����ļ���չ��
	private static String Ext_Name = "gif,jpg,jpeg,png,bmp,swf,flv,mp3,wav,wma,wmv,mid,avi,mpg,asf,rm,rmvb,doc,docx,xls,xlsx,ppt,htm,html,txt,zip,rar,gz,bz2";

	public static void uploadFile(HttpServletRequest request,
			HttpServletResponse response, String filePath) {
		// �õ��ϴ��ļ��ı���Ŀ¼�����ϴ��ļ������WEB-INFĿ¼�£����������ֱ�ӷ��ʣ���֤�ϴ��ļ��İ�ȫ
		String savePath = request.getServletContext().getRealPath(
				"WEB-INF/upload");
		File saveFileDir = new File(savePath);
		if (!saveFileDir.exists()) {
			// ������ʱĿ¼
			saveFileDir.mkdirs();
		}
		// �ϴ�ʱ������ʱ�ļ�����Ŀ¼
		String tmpPath = filePath;
		if (filePath == null || "".equals(filePath))
			tmpPath = request.getServletContext().getRealPath("WEB-INF/tem");
		File tmpFile = new File(tmpPath);
		if (!tmpFile.exists()) {
			// ������ʱĿ¼
			tmpFile.mkdirs();
		}
		System.out.println("1");
		// ��Ϣ��ʾ
		String message = "";
		try {
			System.out.println("2");
			// ʹ��Apache�ļ��ϴ���������ļ��ϴ����裺
			// 1.����һ��DiskFileItemFactory����
			DiskFileItemFactory factory = new DiskFileItemFactory();
			// ���ù����Ļ������Ĵ�С�����ϴ����ļ���С�����������Ĵ�Сʱ���ͻ�����һ����ʱ�ļ���ŵ�ָ������ʱĿ¼����
			factory.setSizeThreshold(1024 * 10);// ���û������Ĵ�СΪ100KB�������ָ������ôĬ�ϻ������Ĵ�С��10KB
			// �����ϴ�ʱ���ɵ���ʱ�ļ��ı���Ŀ¼
			factory.setRepository(tmpFile);
			// 2.����һ���ļ��ϴ�������
			ServletFileUpload upload = new ServletFileUpload(factory);
			// �����ļ��ϴ�����
			upload.setProgressListener(new ProgressListener() {

				@Override
				public void update(long readedBytes, long totalBytes,
						int currentItem) {
					// TODO Auto-generated method stub
					System.out.println("��ǰ�Ѵ���" + readedBytes
							+ "-----------�ļ���СΪ��" + totalBytes + "--"
							+ currentItem);
				}
			});
			System.out.println("3");
			// ����ϴ��ļ�����������������
			upload.setHeaderEncoding("UTF-8");
			// 3.�ж��ύ�����������Ƿ����ϴ���������
			if (!ServletFileUpload.isMultipartContent(request)) {
				// ���մ�ͳ��ʽ��ȡ����
				return;
			}

			// �����ϴ������ļ������ֵ
			upload.setFileSizeMax(1024 * 1024 * 100);// 10M
			// �����ϴ��ļ����������ֵ�����Ǳ����ϴ��������ļ����ܺ͵����ֵ
			upload.setSizeMax(1024 * 1024 * 1000);// 1000M

			List<FileItem> items = upload.parseRequest(request);
			Iterator<FileItem> itr = items.iterator();
			System.out.println("4");
			while (itr.hasNext()) {
				System.out.println("4");
				FileItem item = (FileItem) itr.next();
				// ���fileitem�з�װ������ͨ������������
				if (item.isFormField()) {
					String name = item.getFieldName();
					// �����ͨ����������������������
					String value = item.getString("UTF-8");
					// value = new String(value.getBytes("iso8859-1"),"UTF-8");
					System.out.println(name + "=" + value);
				} else// ���fileitem�з�װ�����ϴ��ļ�
				{
					// �õ��ϴ��ļ����ļ���
					String fileName = item.getName();
					System.out.println("�ļ�����" + fileName);
					if (fileName == null && fileName.trim().length() == 0) {
						continue;
					}
					// ע�⣺��ͬ��������ύ���ļ����ǲ�һ���ģ���Щ������ύ�������ļ����Ǵ���·����
					// ��: C:\Users\H__D\Desktop\1.txt ����Щ���� �� 1.txt
					// �����ȡ�����ϴ��ļ����ļ�����·�����֣�ֻ�����ļ�������
					fileName = fileName
							.substring(fileName.lastIndexOf("\\") + 1);

					// �õ��ϴ��ļ�����չ��
					String fileExt = fileName.substring(
							fileName.lastIndexOf(".") + 1).toLowerCase();
					// �����չ��
					// �����Ҫ�����ϴ����ļ����ͣ���ô����ͨ���ļ�����չ�����ж��ϴ����ļ������Ƿ�Ϸ�
					System.out.println("�ϴ����ļ�����չ���ǣ�" + fileExt);
					if (!Ext_Name.contains(fileExt)) {
						System.out.println("�ϴ��ļ���չ���ǲ��������չ����" + fileExt);
						message = message + "�ļ���" + fileName
								+ "���ϴ��ļ���չ���ǲ��������չ����" + fileExt + "<br/>";
						break;
					}

					// ����ļ���С
					if (item.getSize() == 0)
						continue;
					if (item.getSize() > 1024 * 1024 * 1) {
						System.out.println("�ϴ��ļ���С��" + item.getSize());
						message = message + "�ļ���" + fileName + "���ϴ��ļ���С�������ƴ�С��"
								+ upload.getFileSizeMax() + "<br/>";
						break;
					}

					// �õ����ļ����ļ���
					String saveFileName = makeFileName(fileName);

					// �����ļ�����һ// ��ȡitem�е��ϴ��ļ���������
					InputStream is = item.getInputStream();
					// ����һ���ļ������
					FileOutputStream out = new FileOutputStream(savePath + "\\"
							+ saveFileName);
					// ����һ��������
					byte buffer[] = new byte[1024];
					// �ж��������е������Ƿ��Ѿ�����ı���
					int len = 0;
					while ((len = is.read(buffer)) > 0) {
						out.write(buffer, 0, len);
					}
					// �ر������
					out.close();
					// �ر�������
					is.close();
					// ɾ����ʱ�ļ�
					item.delete();
					message = message + "�ļ���" + fileName + "���ϴ��ɹ�<br/>";
					System.out.println(" ================================= ");
					System.out.println(message);
					System.out.println(" ================================= ");
					// �����ļ�������
					// File uploadedFile = new File(savePath, saveFileName);
					// item.write(uploadedFile);
				}
			}

		} catch (FileSizeLimitExceededException e) {
			message = message + "�ϴ��ļ���С��������<br/>";
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			request.setAttribute("message", message);
			try {
				request.getRequestDispatcher("/message.html").forward(request,
						response);
			} catch (IOException | ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static String makeFileName(String fileName) {
		// Ϊ��ֹ�ļ����ǵ���������ҪΪ�ϴ��ļ�����һ��Ψһ���ļ���
		return UUID.randomUUID().toString().replaceAll("-", "") + "_"
				+ fileName;
	}
}
