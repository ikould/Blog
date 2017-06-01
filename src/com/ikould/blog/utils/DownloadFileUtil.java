package com.ikould.blog.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownloadFileUtil {

	public static void downloadFile(HttpServletRequest request,
			HttpServletResponse response) {
		try {
			// �õ�Ҫ���ص��ļ���
			String fileName = request.getParameter("filename"); // 2323928392489-������.avi
			fileName = new String(fileName.getBytes("iso8859-1"), "UTF-8");

			// �ϴ����ļ����Ǳ�����/WEB-INF/uploadĿ¼�µ���Ŀ¼����
			String fileSaveRootPath = request.getServletContext().getRealPath(
					"/WEB-INF/upload");
			// �õ�Ҫ���ص��ļ�
			File file = new File(fileSaveRootPath + "\\" + fileName);
			// ����ļ�������
			if (!file.exists()) {
				request.setAttribute("message", "��Ҫ���ص���Դ�ѱ�ɾ������");
				request.getRequestDispatcher("/message.html").forward(request,
						response);
				return;
			}
			// �����ļ���
			String realname = fileName.substring(fileName.indexOf("_") + 1);
			// ������Ӧͷ��������������ظ��ļ�
			response.setHeader("content-disposition", "attachment;filename="
					+ URLEncoder.encode(realname, "UTF-8"));
			// ��ȡҪ���ص��ļ������浽�ļ�������
			FileInputStream in = new FileInputStream(fileSaveRootPath + "\\"
					+ fileName);
			// ���������
			OutputStream out = response.getOutputStream();
			// ����������
			byte buffer[] = new byte[1024];
			int len = 0;
			// ѭ�����������е����ݶ�ȡ������������
			while ((len = in.read(buffer)) > 0) {
				// ��������������ݵ��������ʵ���ļ�����
				out.write(buffer, 0, len);
			}
			// �ر��ļ�������
			in.close();
			// �ر������
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
