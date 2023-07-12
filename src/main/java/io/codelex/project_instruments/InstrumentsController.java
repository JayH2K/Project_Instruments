package io.codelex.project_instruments;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/instrument")
@RestController
public class InstrumentsController {

    private final InstrumentService instrumentService;

    public InstrumentsController(InstrumentService instrumentService) {
        this.instrumentService = instrumentService;
    }


    @PostMapping("/add")
    public void addInstrument(@RequestBody InstrumentDto instrument) {
        instrumentService.addInstrument(instrument);
    }

    @GetMapping("/list")
    public List<Instrument> getInstruments() {
        return instrumentService.getInstruments();
    }
}
