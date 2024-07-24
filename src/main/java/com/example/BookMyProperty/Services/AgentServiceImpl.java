package com.example.BookMyProperty.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookMyProperty.Model.Agent;
import com.example.BookMyProperty.Repo.Agentirepos;

@Service
public class AgentServiceImpl implements AgentiServices {

	@Autowired
	Agentirepos atrepo;

	@Override
	public Agent SaveNewAgent(Agent agt) {
		System.out.println("new Agent Registred ");
		return atrepo.save(agt);
	}

	@Override
	public List<Agent> FindAllAgent() {
		System.out.println("All agent record fetch  ");
		return atrepo.findAll();
	}

	@Override
	public Agent FindById(Long AgentId) {
		System.out.println("get agent record   ");
		return atrepo.findById(AgentId).orElse(null);
	}

	@Override
	public void DeleteAgentById(Long AgentId) {
		System.out.println("agent record deleted    ");
		atrepo.deleteById(AgentId);
	}

//	@Override
//	public Agent UpdateAgentDetails(Agent agt) {
//		System.out.println("agent record updated successfully   ");
//		return atrepo.save(agt);
//	}

}
