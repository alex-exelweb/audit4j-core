package org.audit4j.core.dto;

import java.io.Serializable;

/**
 * Created by User on 18/06/2017.
 */
public interface EventMeta extends Serializable {
    String getClient();

    void setClient(String client);

    @Deprecated
    String getRepository();

    @Deprecated
    void setRepository(String repository);
}
