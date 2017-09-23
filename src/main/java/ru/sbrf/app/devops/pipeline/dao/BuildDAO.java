package ru.sbrf.app.devops.pipeline.dao;

import org.springframework.data.repository.CrudRepository;
import ru.sbrf.app.devops.pipeline.entity.Build;

/**
 * Created by Tom on 23.09.2017.
 */
public interface BuildDAO extends CrudRepository<Build, Long> {
}
