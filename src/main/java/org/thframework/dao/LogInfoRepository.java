package org.thframework.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.thframework.model.LogInfo;

/**
 * Created on 2016/11/19.
 */
@Repository
public interface LogInfoRepository extends PagingAndSortingRepository<LogInfo, Integer> {



}
