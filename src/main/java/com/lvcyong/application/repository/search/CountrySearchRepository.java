package com.lvcyong.application.repository.search;

import com.lvcyong.application.domain.Country;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Country entity.
 */
public interface CountrySearchRepository extends ElasticsearchRepository<Country, Long> {
}
