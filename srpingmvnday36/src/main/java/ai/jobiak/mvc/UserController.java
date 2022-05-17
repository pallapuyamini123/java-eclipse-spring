package ai.jobiak.mvc;


	import org.springframework.stereotype.Controller;
	import org.springframework.ui.ModelMap;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	@Controller//stereo type annotation
	public class UserController {
		
		@RequestMapping(value="show",method=RequestMethod.GET)
		//this is similar to request attribute we saw in servlets
		//is injected by the application container on per request basis for sharing da
		public String message(ModelMap map) {
			map.put("UName","Hema");
			map.put("password","hema@123");
		    map.put("OTP","1234");
		    return "content";//template

		}

	}


