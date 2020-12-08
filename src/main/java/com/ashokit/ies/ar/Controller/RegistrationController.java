package com.ashokit.ies.ar.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashokit.ies.ar.Service.UserService;
import com.ashokit.ies.ar.domain.UserAccount;
import com.ashokit.ies.ar.entity.UserEntity;

@Controller
public class RegistrationController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String inedx() {

		return "home";
	}

	
	@GetMapping("/createuser")
	public String registerUser(Model model) {

		model.addAttribute("applicant", new UserAccount());

		return "applicantregister";
	}
	
	
	/*@PostMapping("/saveUser")
	public String handleSubmitButton(@ModelAttribute("applicant")UserAccount userAccount,RedirectAttributes  redirectAttrs) {
		
		String saveUser = userService.saveUser(userAccount);
		if(saveUser!=null) {
			redirectAttrs.addFlashAttribute("succMsg", "Your Applcation Registration Sucessfull with Application No is:+saveUser");
		}
		return    "redirect:/createuser";
		
		
	}*/
	@PostMapping("/saveUser")
	public String handleSubmitButton(@ModelAttribute("applicant")UserAccount userAccount,RedirectAttributes  redirectAttrs) {
		
		String saveUser = userService.saveUser(userAccount);
		if(saveUser!=null) {
			redirectAttrs.addFlashAttribute("succMsg", "Your Applcation Registration Sucessfull with Application No is:"+saveUser);
		}
		else {
			redirectAttrs.addFlashAttribute("failMsg", "Your Applcation Registration failed beacuse of InValid SSN-Number or not belongs to kentucky state");

		}
		return    "redirect:/createuser";
		
		
	}

	
	@GetMapping("/views")
    public String handleViewApplicationsHyperlink(Model model) {
		
		List<UserAccount> conta=userService.findAllApplicants();
		
		model.addAttribute("contactForm",conta);
		
		
		return "view"; 
		} 
	

}

















