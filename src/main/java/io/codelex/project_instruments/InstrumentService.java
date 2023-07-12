package io.codelex.project_instruments;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class InstrumentService {

    private final List<Instrument> instrumentList = new ArrayList<>();

    public void addInstrument(@RequestBody InstrumentDto instrument) {
        Instrument newInstrument = new Instrument(instrument.getName(),instrument.getPrice(), LocalDateTime.now());
        instrumentList.add(newInstrument);
    }

    public List<Instrument> getInstruments() {
        return instrumentList;
    }

}
