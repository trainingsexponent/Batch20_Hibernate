package com.model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {

	public static void main(String[] args) throws IOException {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Session session = sf.openSession();
		
		FileData fileData = new FileData();
		
		File file = new File("F:\\AjasShaikh.txt");
		
		fileData.setFid(123);
		fileData.setFname(file.getName());
		fileData.setFpath(file.getAbsolutePath());
		fileData.setFsize(file.length());
		
		Path path = Paths.get(file.getAbsolutePath());
		byte[] fbyte = Files.readAllBytes(path);
		System.out.println(Arrays.toString(fbyte));
		fileData.setfData(fbyte);
		
		session.save(fileData);
		
		session.beginTransaction().commit();
	}
}
