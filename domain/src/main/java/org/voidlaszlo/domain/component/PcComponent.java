package org.voidlaszlo.domain.component;

import java.util.UUID;

public class PcComponent {
    private final UUID id;
    private final String name;
    private final PcComponentType type;

    public PcComponent(UUID id, String name, PcComponentType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String toJSON() {
        return String.format(
                "{\"id\":\"%s\", \"name\":\"%s\", \"type\":\"%s\"}",
                this.id.toString(), this.name, this.type.toString()
        );
    }
}
