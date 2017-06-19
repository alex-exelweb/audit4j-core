package org.audit4j.core.dto;

import java.util.Date;

/**
 * Created by User on 18/06/2017.
 */
public interface EventBuilder {
    EventBuilder addActor(String actor);

    EventBuilder addAction(String action);

    EventBuilder addOrigin(String origin);

    EventBuilder addTimestamp(Date timestamp);

    EventBuilder addField(String name, Object value);

    EventBuilder addTag(String name);

    AuditEvent build();
}
