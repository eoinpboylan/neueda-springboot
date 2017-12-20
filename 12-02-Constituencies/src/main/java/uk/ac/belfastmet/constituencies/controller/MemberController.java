package uk.ac.belfastmet.constituencies.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.constituencies.domain.AllMembersList;
import uk.ac.belfastmet.constituencies.domain.Member;




@Controller
@RequestMapping("")
public class MemberController {
	
	public MemberController() {
		super();
	}
	
	@GetMapping("/")
	public String home(Model model) {
		
		model.addAttribute("pageTitle", "MLAs");
		model.addAttribute("pageHeader", "Constituencies");
		
		model.addAttribute("members", allMembersArray());
		return "homePage";
	}
	
	@GetMapping("/constituency/{constituencyId}")
	public String constituency(@PathVariable String constituencyId, Model model) {
		
		model.addAttribute("pageTitle", "MLAs");
		model.addAttribute("members", showMembersByConstituency(constituencyId));
		return "constituencyPage";
	}
	
	@GetMapping("/belfast")
	public String belfast(Model model) {
		model.addAttribute("pageTitle", "MLAs");
		model.addAttribute("pageHeader", "Belfast");
		return "belfastPage";
	}
	
	
	
	public ArrayList<Member> allMembersArray(){
		
		String allMembersUrl="http://data.niassembly.gov.uk/members_json.ashx?m=GetAllCurrentMembers";
		RestTemplate restTemplate = new RestTemplate();
		AllMembersList allMembersList = restTemplate.getForObject(allMembersUrl, AllMembersList.class);
		return allMembersList.getAllMembersList();
	}
	
	public Member showMembersByConstituency(String constituencyId){
		 ArrayList<Member> allMembersArray = this.allMembersArray();
		for(int i = 0; i < allMembersArray.size(); i++) {
				Member currentMember = allMembersArray().get(i);
					
				if(currentMember.getConstituencyId().equals(constituencyId)) {
					return currentMember;	
					}
		 }return null;
	}
	
	

}
