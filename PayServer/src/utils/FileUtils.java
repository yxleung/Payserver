package utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileUtils {
	private static String defaultCharset="utf-8";
	
	public static String readFileToString(String path){
		return readFileToString(path,defaultCharset);
	}
	
	public static String readFileToString(String path,String charset){
		FileInputStream fis=null;
		BufferedReader br=null;
		StringBuilder sb=new StringBuilder();
		try {
			fis=new FileInputStream(path);
			br=new BufferedReader(new InputStreamReader(fis,charset));
			String temp="";
			while((temp=br.readLine())!=null){
				sb.append(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(br!=null)br.close();
				if(fis!=null)fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return sb.toString();
	}
}
