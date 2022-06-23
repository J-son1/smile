package com.makers.smile;

import org.springframework.data.repository.CrudRepository;

public interface SmileRepository extends CrudRepository<Smile, Long> {
    Smile findFirstByOrderByIdAsc();
}
