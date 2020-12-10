package org.voidlaszlo.usecases;

import org.voidlaszlo.domain.component.PcComponent;
import org.voidlaszlo.usecases.ports.PcComponentRepository;

import java.util.Optional;

public class DeletePcComponent {
    private final PcComponentRepository pcComponentRepository;

    public DeletePcComponent(PcComponentRepository pcComponentRepository) {
        this.pcComponentRepository = pcComponentRepository;
    }

    public Optional<PcComponent> delete(PcComponent pcComponent) {
        return pcComponentRepository.delete(pcComponent);
    }
}
