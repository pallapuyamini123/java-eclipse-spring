package ai.jobiak.mvc;


	import org.springframework.stereotype.Controller;
	import org.springframework.ui.ModelMap;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	@Controller//stereo type annotation
	public class WelcomeController {
	@RequestMapping(value="come",method=RequestMethod.GET)
	//this is similar to request attribute we saw in servlets
	//is injected by the application container on per request basis for sharing dat
	public String message(ModelMap map) {
		map.put("msg1","Welcome to Spring MVC Programming");
		map.put("msg2","Spring for limitless options");
	    map.put("tongueTwister","She sells sea shells on sea shore");
	    return "welcome";//template

	}
	}


