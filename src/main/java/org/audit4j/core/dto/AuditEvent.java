package org.audit4j.core.dto;

import java.util.List;

/**
 * Created by User on 18/06/2017.
 */
public interface AuditEvent extends Event {
    String getActor();

    void setActor(String actor);

    String getOrigin();

    void setOrigin(String origin);

    String getAction();

    void setAction(String action);

    void addField(String name, Object value, Object type);

    void addField(String name, Object value);

    void addField(Field field);

    List<Field> getFields();

    void setFields(List<Field> fields);

    String getTag();

    void setTag(String tag);

    String getRepository();

    @Override
    void setRepository(String repository);
}
