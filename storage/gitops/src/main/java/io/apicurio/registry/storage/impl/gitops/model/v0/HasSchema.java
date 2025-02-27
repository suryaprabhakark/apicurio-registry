package io.apicurio.registry.storage.impl.gitops.model.v0;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author Jakub Senko <em>m@jsenko.net</em>
 */
@SuperBuilder
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class HasSchema {

    @JsonProperty("$type")
    private String type;
}
