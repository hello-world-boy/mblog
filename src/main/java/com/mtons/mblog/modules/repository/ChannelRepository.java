package com.mtons.mblog.modules.repository;

import com.mtons.mblog.modules.entity.Channel;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author langhsu
 */
public interface ChannelRepository extends JpaRepository<Channel, Integer>, JpaSpecificationExecutor<Channel> {
    List<Channel> findAllByStatus(int status, Sort sort);

    @Query("select coalesce(max(weight), 0) from Channel")
    int maxWeight();
}
