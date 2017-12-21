package uk.ac.belfastmet.constituencies.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties.Env;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;


import uk.ac.belfastmet.constituencies.domain.AllMembersList;
import uk.ac.belfastmet.constituencies.domain.ConstituencyJsonResponse;
import uk.ac.belfastmet.constituencies.domain.Member;




@Controller
@RequestMapping("")

public class MemberController {
	
	@Value("${api.constituency.url}")
	private String baseUrl;
	
	
    public String getBaseUrl() {
		return baseUrl;
	}


	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	
	@GetMapping("/")
	public String home(Model model) {
		
		model.addAttribute("pageTitle", "MLAs");
		model.addAttribute("pageHeader", "Constituencies");
	
		return "homePage";
	}
	
	@GetMapping("/belfast")
	public String belfast(Model model) {
		model.addAttribute("pageTitle", "MLAs");
		model.addAttribute("pageHeader", "Belfast");
		return "belfastPage";
	}
	
	@GetMapping("/constituency/{constituency}")
	public String event(@PathVariable Integer constituency,  Model model) {
		
		model.addAttribute("pageTitle", "MLAs");
		RestTemplate restTemplate = new RestTemplate();
		ConstituencyJsonResponse jsonResponse = restTemplate.getForObject(
				this.getBaseUrl() + constituency.toString(), ConstituencyJsonResponse.class);
		ArrayList<Member> members = jsonResponse.getAllMembersList().getMembers();
		model.addAttribute("constituency", members.get(0).getConstituencyName());
		model.addAttribute("members", members);
		return "constituencyPage";
	}
	
	/*public ArrayList<Member> allMembersArray(){
		
		String allMembersUrl="http://data.niassembly.gov.uk/members_json.ashx?m=GetAllCurrentMembers";
		RestTemplate restTemplate = new RestTemplate();
		AllMembersList allMembersList = restTemplate.getForObject(allMembersUrl, AllMembersList.class);
		return allMembersList.getAllMembersList();
	}*/
	
	/*@GetMapping("/constituency/{constituencyId}")
	public String constituency(@PathVariable String constituencyId, Model model) {
		
		model.addAttribute("pageTitle", "MLAs");
		model.addAttribute("members", showMembersByConstituency(constituencyId));
		return "constituencyPage";
	}*/

	
	/*public Member showMembersByConstituency(String constituencyId){
		 ArrayList<Member> allMembersArray = this.allMembersArray();
		for(int i = 0; i < allMembersArray.size(); i++) {
				Member currentMember = allMembersArray().get(i);
					
				if(currentMember.getConstituencyId().equals(constituencyId)) {
					return currentMember;	
					}
		 }return null;
	}*/
	
	

}
