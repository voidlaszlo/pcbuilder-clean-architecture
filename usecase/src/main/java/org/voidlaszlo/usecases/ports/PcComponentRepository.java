package org.voidlaszlo.usecases.ports;

import org.voidlaszlo.domain.component.PcComponent;

import java.util.Optional;

public interface PcComponentRepository {
    Optional<PcComponent> save(PcComponent pcComponent);
    Optional<PcComponent> delete(PcComponent pcComponent);
}
