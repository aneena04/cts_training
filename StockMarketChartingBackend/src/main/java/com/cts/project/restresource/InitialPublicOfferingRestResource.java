package com.cts.project.restresource;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.cts.project.bean.InitialPublicOffering;

@RepositoryRestResource(path = "ipos", collectionResourceRel = "ipos")

public interface InitialPublicOfferingRestResource extends PagingAndSortingRepository<InitialPublicOffering, Integer> {

}
