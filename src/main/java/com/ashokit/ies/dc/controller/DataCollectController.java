package com.ashokit.ies.dc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashokit.ies.ar.domain.DataCollect;
import com.ashokit.ies.ar.domain.UserAccount;
import com.ashokit.ies.dc.domain.IncomeDetails;
import com.ashokit.ies.dc.domain.UserPlan;
import com.ashokit.ies.dc.service.DataService;

@Controller
public class DataCollectController {
	

	
	@Autowired
	private DataService   dataService;
	
	@GetMapping("/data")
	public String dispaly(Model model) {
		UserAccount userAcc = new UserAccount();
		model.addAttribute("data", userAcc);
		return "datacollect";
	}

	@GetMapping("/search")
	public String dispalys(@RequestParam("userId") String id, Model model, RedirectAttributes redirectAttrs) {

		UserAccount userAcc = dataService.isAppNumValid(id);

		if (userAcc != null) {
			model.addAttribute("appNum", userAcc);

			return "create-case";

		} else {
			redirectAttrs.addFlashAttribute("failMsg", "You Entered Wrong Application Number");
			return "redirect:/data";
		}

	}
	
	@PostMapping("/createcase")
	public String handleCreateCase(UserAccount user,Model model) {
		
		String caseId=dataService.saveCase(user);
		if(caseId!=null) {
			model.addAttribute("caseNum", caseId);
			model.addAttribute("plan",new UserPlan());
			return "select-plan";
		}
		
		return  null;
	}
	
	@PostMapping("/plansubmit")
	public String handlePlanSubmit(UserPlan userPlan,Model model) {
		String caseNum=dataService.saveCitizenPlan(userPlan);
		System.out.println(caseNum);
		
		if(caseNum!=null) {
			model.addAttribute("caseId", caseNum);
			model.addAttribute("income",new IncomeDetails());
			return "income-dtls";
		}
		return "income-dtls";
	}
	

	@PostMapping("/submitincome")
	public String handleIncomeSubtBtn(IncomeDetails incomeDtls,Model model) {
		
		String incomeId=dataService.saveCitizenIncome(incomeDtls);
		
		if(incomeId!=null) {
			model.addAttribute("sucsMsg", "your appplied sucessfully");
			return "final";

		}
		else {
			model.addAttribute("failMsg", "your not submiited correct data try again");
			return "final";

			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}