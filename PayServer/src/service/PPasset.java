package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.anno.Path;

@Path("ppasset")
public class PPasset extends Service{
	@Override
	protected void messageReceived(String appid, HttpServletRequest req,
			HttpServletResponse resp) {
		// TODO Auto-generated method stub
		System.out.println("fuck okay");
		System.out.println(appid);
	}
}
