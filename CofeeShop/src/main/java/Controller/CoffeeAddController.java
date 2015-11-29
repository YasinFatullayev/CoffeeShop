package Controller;
import CoffeeModel.Cofee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

			 @Controller
public class CoffeeAddController {
		
		
		   @RequestMapping(value = "/index", method = RequestMethod.GET)
		   public ModelAndView student() {
		      return new ModelAndView("index", "command", new Cofee());
		   }
		   
		   @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
		   public String addStudent(@ModelAttribute("SpringWeb")Cofee student, 
		   ModelMap model) {
		      model.addAttribute("name", student.getName());
		      model.addAttribute("age", student.getCountry());
		      model.addAttribute("id", student.getPRODUCT_NO());
		      
		      return "result";
		   }
		}