package com.example.BookMyProperty.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookMyProperty.Model.Agent;
import com.example.BookMyProperty.Services.AgentiServices;

@RestController
@RequestMapping("/api/agent")
public class AgentRestController {
	@Autowired
	AgentiServices aiserv;

	@GetMapping
	public List<Agent> FindAllAgent() {
		System.out.println("Get mapping is runn in Agent restcontroller  ");
		return aiserv.FindAllAgent();
	}

	@GetMapping(value = "/{AgentId}")
	public Agent FindById(@PathVariable Long AgentId) {
		System.out.println(" Get mapping is runn in Agent restcontroller  ");
		return aiserv.FindById(AgentId);
	}

	@PostMapping
	public Agent SaveNewAgent(@RequestBody Agent agt) {
		System.out.println("Post mapping run in Agent restconroller ");
		return aiserv.SaveNewAgent(agt);
	}

	@PutMapping(value = "/{AgentId}")
	public Agent UpdateAgentDetails(@PathVariable Long AgentId, @RequestBody Agent agt) {
		agt.setAgentId(AgentId);
		System.out.println("Put  mapping is run in Agent restcontroller  ");
		return aiserv.UpdateAgentDetails(agt);
	}

	@DeleteMapping(value = "/{AgentId}")
	public void DeleteAgentById(@PathVariable Long AgentId) {
		System.out.println("Delete mapping is run in Agent restcontroller    ");
		aiserv.DeleteAgentById(AgentId);
	}

}
