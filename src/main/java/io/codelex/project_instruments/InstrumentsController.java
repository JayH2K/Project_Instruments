package io.codelex.project_instruments;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/instrument")
@RestController
public class InstrumentsController {

    private final List<Instrument> instrumentList = new ArrayList<>();

    @PostMapping("/add")
    public void addInstrument(@RequestBody Instrument instrument) {
        instrumentList.add(instrument);
    }

    @GetMapping("/list")
    public List<Instrument> getInstruments() {
        return instrumentList;
    }
}
