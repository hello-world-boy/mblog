package com.mtons.mblog.modules.repository;

import com.mtons.mblog.modules.entity.SecurityCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author langhsu on 2015/8/14.
 */
public interface SecurityCodeRepository extends JpaRepository<SecurityCode, Long>, JpaSpecificationExecutor<SecurityCode> {
    SecurityCode findByKeyAndType(String key, int type);
    SecurityCode findByKey(String key);
}
