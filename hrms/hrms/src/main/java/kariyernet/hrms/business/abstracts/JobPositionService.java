package kariyernet.hrms.business.abstracts;

import java.util.List;
import kariyernet.hrms.entities.concretes.JobPosition;
public interface JobPositionService {
	List<JobPosition> getAll();
}
