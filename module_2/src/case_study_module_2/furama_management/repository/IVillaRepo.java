package case_study_module_2.furama_management.repository;

import case_study_module_2.furama_management.model.facility.Villa;
import java.util.Map;

public interface IVillaRepo {
    void add( Villa villa, Integer value);
    Map<Villa,Integer> getAll();
}
