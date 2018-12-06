/**
 * 
 */
package headsaid.learn.mongospringboot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import headsaid.learn.mongospringboot.model.Request;

/**
 * @author ahmmohamed
 *
 */
@Repository
public interface RequestsRepository  extends MongoRepository<Request, String>
{
	public List<Request> findByTypeId(int typeId);

}
