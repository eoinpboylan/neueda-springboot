package uk.ac.belfastmet.constituencies.domain;

import java.util.ArrayList;

import lombok.Data;
@Data
public class AllMembersList {
	
	private ArrayList<Member> allMembersList = new ArrayList<Member>();

	public AllMembersList(ArrayList<Member> allMembersList) {
		super();
		this.allMembersList = allMembersList;
	}

	public AllMembersList() {
		super();
	}

	public ArrayList<Member> getAllMembersList() {
		return allMembersList;
	}

	public void setAllMembersList(ArrayList<Member> allMembersList) {
		this.allMembersList = allMembersList;
	}
		
	

}
