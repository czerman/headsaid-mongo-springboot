/**
 * 
 */
package headsaid.learn.mongospringboot.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ahmmohamed
 *
 */
@XmlRootElement
@Document
public class Request 
{
	@Id
	private String id;
	
	private int typeId;
	private int status;
	private String applicantId;
	
	
	
	public Request()
	{
		
	}
	public Request(int typeId,int status,String applicantId)
	{
		this.typeId =typeId;
		this.status = status;
		this.applicantId = applicantId;
		
	}
	

	
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(String applicantId) {
		this.applicantId = applicantId;
	}
	@Override
	public String toString() {
		
		return " typeId :"+typeId + "- status :"+ status + " - applicantId : "+applicantId;
	}
	
	
}
