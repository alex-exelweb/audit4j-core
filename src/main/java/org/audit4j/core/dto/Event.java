package org.audit4j.core.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by User on 18/06/2017.
 */
public interface Event extends Serializable {
    Integer getAuditId();

    void setAuditId(Integer auditId);

    Long getUuid();

    void setUuid(Long uuid);

    Date getTimestamp();

    void setTimestamp(Date timestamp);

    void setRepository(String repository);

    void setClient(String client);

    EventMeta getMeta();

    void setMeta(EventMeta meta);
}
