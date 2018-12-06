/**
 * 
 */
package headsaid.learn.mongospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import headsaid.learn.mongospringboot.model.Request;
import headsaid.learn.mongospringboot.service.RequestService;

/**
 * @author ahmmohamed
 *
 */
@RestController
public class RequestsController 
{
	@Autowired
	private RequestService   requestService;
	
	
	@RequestMapping("/create")
	public String createRequest(@RequestParam int typeId,@RequestParam int status,@RequestParam String applicantId)
	{
		Request request = requestService.createRequest(typeId, status, applicantId);
		return request.toString();
	}
	
	@RequestMapping("/get_all")
	public String getAllRequests()
	{
		List<Request> requests = requestService.getAll();
		StringBuffer result = new StringBuffer();
		for(Request r : requests)
		{
			result.append(r.toString()+"\n");
		}
		
		return result.toString();
	}
}
