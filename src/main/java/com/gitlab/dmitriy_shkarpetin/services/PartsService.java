package com.gitlab.dmitriy_shkarpetin.services;

import com.gitlab.dmitriy_shkarpetin.forms.CustomerForm;
import com.gitlab.dmitriy_shkarpetin.forms.PartForm;
import com.gitlab.dmitriy_shkarpetin.models.Customer;
import com.gitlab.dmitriy_shkarpetin.models.Part;

import java.util.List;


public interface PartsService {
    void addPart(PartForm form);
    List<Part> getAllParts();


    void deletePart(Integer partId);

    Part getPart(Integer part_id);

    void updatePart(Integer partId, PartForm form);
}
