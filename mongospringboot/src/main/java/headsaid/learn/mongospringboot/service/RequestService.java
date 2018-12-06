/**
 * 
 */
package headsaid.learn.mongospringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import headsaid.learn.mongospringboot.model.Request;
import headsaid.learn.mongospringboot.repository.RequestsRepository;

/**
 * @author ahmmohamed
 *
 */
@Service
public class RequestService 
{
	@Autowired
	private RequestsRepository requestsRepository;
	
	
	public Request createRequest(int typeId,int status,String applicantId)
	{
		 Request r = requestsRepository.insert(new Request(typeId, status, applicantId));
		 return r;
	}
	
	public List<Request> getAll()
	{
		return requestsRepository.findAll();
	}
	
	public List<Request> findByTypeId(int typeId)
	{
		return requestsRepository.findByTypeId(typeId);
	}
}
