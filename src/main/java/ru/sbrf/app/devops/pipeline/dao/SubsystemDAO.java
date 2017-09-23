package ru.sbrf.app.devops.pipeline.dao;

import org.springframework.data.repository.CrudRepository;
import ru.sbrf.app.devops.pipeline.entity.Subsystem;

/**
 * Created by Tom on 23.09.2017.
 */
public interface SubsystemDAO extends CrudRepository<Subsystem, Long> {
}
