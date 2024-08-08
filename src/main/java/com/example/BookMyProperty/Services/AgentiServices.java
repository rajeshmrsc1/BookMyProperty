package com.example.BookMyProperty.Services;

import java.util.List;

import com.example.BookMyProperty.Model.Agent;

public interface AgentiServices {

	   public Agent SaveNewAgent(Agent agt);

		 List<Agent> FindAllAgent();

		public Agent FindById(Long AgentId );

		public void DeleteAgentById(Long AgentId );

		public Agent UpdateAgentDetails(Agent AgentId );
	    
	
	
}
