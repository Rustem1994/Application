package org.ruste.models.mapper;

import org.mapstruct.Mapper;
import org.ruste.models.dto.TaskDto;
import org.ruste.models.entity.Task;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    Task fromDto(TaskDto source);
}
