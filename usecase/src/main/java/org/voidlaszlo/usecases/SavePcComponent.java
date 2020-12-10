package org.voidlaszlo.usecases;

import org.voidlaszlo.domain.component.PcComponent;
import org.voidlaszlo.usecases.ports.PcComponentRepository;

import java.util.Optional;

public class SavePcComponent {
    private final PcComponentRepository pcComponentRepository;

    public SavePcComponent(PcComponentRepository pcComponentRepository) {
        this.pcComponentRepository = pcComponentRepository;
    }

    public Optional<PcComponent> save(PcComponent pcComponent) {
        return pcComponentRepository.save(pcComponent);
    }
}
