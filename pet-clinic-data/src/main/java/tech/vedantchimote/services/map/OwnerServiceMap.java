/**
 * Created By Vedant Chimote Date : 07-09-2023 Time : 19:41 Project-Name : ownpetclinic
 */

package tech.vedantchimote.services.map;

import java.util.Set;
import org.springframework.stereotype.Service;
import tech.vedantchimote.model.Owner;
import tech.vedantchimote.services.CrudService;
import tech.vedantchimote.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

  @Override
  public Set<Owner> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Owner object) {
    super.delete(object);
  }

  @Override
  public Owner save(Owner object) {
    return super.save(object);
  }

  @Override
  public Owner findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Owner findByLastName(String lastName) {
    return null;
  }
}
